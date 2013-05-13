package hu.bme.mit.inf.szolgint.neo4j;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.json.impl.provider.entity.JSONObjectProvider;

public class Neo4jREST {

	public String SERVER_ROOT_URI;

	/**
	 * @param SERVER_URI
	 *            server root URI
	 */
	public Neo4jREST(String SERVER_URI) {
		super();
		setSERVER_ROOT_URI(SERVER_URI);
	}

	public String getSERVER_ROOT_URI() {
		return SERVER_ROOT_URI;
	}

	public void setSERVER_ROOT_URI(String ROOT_URI) {
		SERVER_ROOT_URI = ROOT_URI;
	}

	/**
	 * A Neo4j szerver futásának ellenõrzése:
	 * 
	 * @return
	 */
	public boolean databaseIsRunning() {
		boolean return_value;

		try {
			WebResource resource = Client.create().resource(SERVER_ROOT_URI);
			ClientResponse response = resource.get(ClientResponse.class);

			System.out.println(String.format("GET on [%s], status code [%d]",
					SERVER_ROOT_URI, response.getStatus()));

			if (response.getStatus() == ClientResponse.Status.OK
					.getStatusCode()) {
				return_value = true;
			} else {
				return_value = false;
			}

			response.close();

		} catch (ClientHandlerException e) {
			return_value = false;
		}

		return return_value;
	}

	/**
	 * Node létrehozása:
	 * 
	 * @return
	 */
	public URI createNode() {
		final String nodeEntryPointUri = SERVER_ROOT_URI + "/db/data/node";

		System.out.print("Creating node: ");

		WebResource resource = Client.create().resource(nodeEntryPointUri);
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON)
				.type(MediaType.APPLICATION_JSON).entity("{}")
				.post(ClientResponse.class);

		final URI location = response.getLocation();
		System.out.println(String.format("[%s], status code [%d]",
				location.toString(), response.getStatus()));
		response.close();

		return location;
	}

	/**
	 * Node törlése:
	 * 
	 * @param nodeEntryPointUri
	 */
	public void deleteNode(URI nodeEntryPointUri) {
		System.out.print("Deleting node: " + nodeEntryPointUri);
		WebResource resource = Client.create().resource(nodeEntryPointUri);
		ClientResponse response = resource.type(MediaType.APPLICATION_JSON)
				.delete(ClientResponse.class);

		// Ellenõrizzük, hogy sikerült-e törölni a node-ot:
		response = resource.get(ClientResponse.class);

		if (response.getStatus() == ClientResponse.Status.NOT_FOUND
				.getStatusCode()) {
			System.out.println(String.format(" -- SUCCEED, status code [%d]",
					response.getStatus()));
		} else {
			System.out.println(String.format(" -- FAILED, status code [%d]",
					response.getStatus()));
		}
		response.close();
	}

	/**
	 * Tulajdonság hozzáadása egy node-hoz:
	 * 
	 * @param nodeUri
	 * @param propertyName
	 * @param propertyValue
	 */
	public void addProperty(URI nodeUri, String propertyName,
			String propertyValue) {

		String propertyUri = nodeUri.toString() + "/properties/" + propertyName;

		System.out.print(String.format("Adding [%s] property to [%s], ",
				propertyName, nodeUri));

		WebResource resource = Client.create().resource(propertyUri);
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON)
				.type(MediaType.APPLICATION_JSON)
				.entity("\"" + propertyValue + "\"").put(ClientResponse.class);

		System.out.println(String.format("status code [%d]",
				response.getStatus()));

		response.close();
	}

	/**
	 * Tulajdonság törlése egy node-ból:
	 * 
	 * @param nodeUri
	 * @param propertyName
	 */
	public void deleteProperty(URI nodeUri, String propertyName) {

		String propertyUri = nodeUri.toString() + "/properties/" + propertyName;

		System.out.print(String.format("Deleting [%s] property from [%s]",
				propertyName, nodeUri));

		WebResource resource = Client.create().resource(propertyUri);
		ClientResponse response = resource.type(MediaType.APPLICATION_JSON)
				.delete(ClientResponse.class);

		// Ellenõrizzük, hogy sikerült-e törölni a node-ot:
		response = resource.get(ClientResponse.class);

		if (response.getStatus() == ClientResponse.Status.NOT_FOUND
				.getStatusCode()) {
			System.out.println(String.format(" -- SUCCEED, status code [%d]",
					response.getStatus()));
		} else {
			System.out.println(String.format(" -- FAILED, status code [%d]",
					response.getStatus()));
		}
		response.close();

	}

	/**
	 * Kapcsolatok JSON generálója:
	 * 
	 * @param endNode
	 * @param relationshipType
	 * @param jsonAttributes
	 * @return
	 */
	private static String generateJsonRelationship(URI endNode,
			String relationshipType, String... jsonAttributes) {
		StringBuilder sb = new StringBuilder();
		sb.append("{ \"to\" : \"");
		sb.append(endNode.toString());
		sb.append("\", ");

		sb.append("\"type\" : \"");
		sb.append(relationshipType);
		if (jsonAttributes == null || jsonAttributes.length < 1) {
			sb.append("\"");
		} else {
			sb.append("\", \"data\" : ");
			for (int i = 0; i < jsonAttributes.length; i++) {
				sb.append(jsonAttributes[i]);
				if (i < jsonAttributes.length - 1) { // Miss off the final comma
					sb.append(", ");
				}
			}
		}

		sb.append(" }");
		return sb.toString();
	}

	/**
	 * Kapcsolat létrehozása két node között:
	 * 
	 * @param startNode
	 * @param endNode
	 * @param relationshipType
	 * @param jsonAttributes
	 * @return
	 * @throws URISyntaxException
	 */
	public URI addRelationship(URI startNode, URI endNode,
			String relationshipType, String jsonAttributes)
			throws URISyntaxException {
		System.out.print(String.format(
				"Creating relationship from [%s] to [%s]", startNode, endNode));
		URI fromUri = new URI(startNode.toString() + "/relationships");
		String relationshipJson = generateJsonRelationship(endNode,
				relationshipType, jsonAttributes);

		WebResource resource = Client.create().resource(fromUri);
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON)
				.type(MediaType.APPLICATION_JSON).entity(relationshipJson)
				.post(ClientResponse.class);

		final URI location = response.getLocation();
		System.out.println(String.format(", status code [%d]",
				response.getStatus()));

		response.close();
		return location;
	}

	public void deleteRelationship(URI startNode)
			throws URISyntaxException {
		
		URI fromUri = new URI(startNode.toString() + "/relationships/all");

		WebResource resource = Client.create().resource(fromUri);
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON)
				.get(ClientResponse.class);

		String json = response.getEntity(String.class);

		JSONParser parser = new JSONParser();

		Object obj;

		try {
			obj = parser.parse(json);
			JSONArray jsonArray = (JSONArray) obj;

			for (int i = 0; i < jsonArray.size(); i++) {
				
				JSONObject jsonObject = (JSONObject) jsonArray.get(i);
				String self = (String) jsonObject.get("self");
				
				System.out.print(String.format(
						"Deleting relationship [%s]", self));
				
				resource = Client.create().resource(self);
				response = resource.type(MediaType.APPLICATION_JSON)
						.delete(ClientResponse.class);
				
				System.out.println(String.format(", status code [%d]",
						response.getStatus()));
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}

		response.close();
	}
}
