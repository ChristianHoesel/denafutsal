package hu.bme.mit.inf.mdsd.one.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import javax.ws.rs.core.EntityTag;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.server.impl.container.servlet.JerseyServletContainerInitializer;

public class MDSDClient {

	/**
	 * 
	 • TeX – POST http://10.40.200.94:8080/documentconverter/tex: saves the
	 * TeX file and returns a unique id for the session. – GET
	 * http://10.40.200.94:8080/documentconverter/pdf/ID: returns the compiled
	 * PDF file for the session identified ID . – GET
	 * http://10.40.200.94:8080/documentconverter/log/ID: returns the compiled
	 * PDFLaTeX log for the session identified ID . • HTML – POST
	 * http://10.40.200.94:8080/documentconverter/html: saves the HTML file and
	 * returns a unique id. – GET
	 * http://10.40.200.94:8080/documentconverter/html/ID: returns the HTML file
	 * identified by ID . Note: the POST methods consume two type of inputs: •
	 * Plain text messages with the MIME type set to text/plain . • Multipart
	 * messages (http://en.wikipedia.org/wiki/MIME#Multipart_messages). This is
	 * useful if you test the service with a REST client (e.g. Google Chrome’s
	 * Advanced REST client). If you use it this way, don’t forget to set the
	 * field name to file . See the figure below for reference.
	 */

	final static String PING_URL = "http://10.40.200.94:8080/documentconverter/ping";
	final static String TEX_UPLOAD_URL = "http://10.40.200.94:8080/documentconverter/tex";
	final static String GET_PDF_URL = "http://10.40.200.94:8080/documentconverter/pdf/";
	final static String GET_PDF_LOG_URL = "http://10.40.200.94:8080/documentconverter/log/";
	final static String HTML_UPLOAD_URL = "http://10.40.200.94:8080/documentconverter/html";
	final static String GET_HTML_URL = "http://10.40.200.94:8080/documentconverter/html/";
	

	/**
	 * Ping GET http://10.40.200.94:8080/documentconverter/ping: says “pong”.
	 * 
	 * @return
	 */
	public String ping() {

		String entity = "no response";

		try {
			WebResource resource = Client.create().resource(PING_URL);
			ClientResponse response = resource.get(ClientResponse.class);

			System.out.println(String.format("GET on [%s], status code [%d]",
					PING_URL, response.getStatus()));

			entity = response.getEntity(String.class);

			response.close();

		} catch (ClientHandlerException e) {
			System.out.println(e.toString());
		}

		return entity;
	}

	/**
	 * TeX
	 * 
	 * POST http://10.40.200.94:8080/documentconverter/tex: saves the TeX file 
	 * and returns a unique id for the session.
	 * 
	 * @param fileName
	 * @return
	 * @throws FileNotFoundException
	 */
	public String uploadTex(String fileName) throws FileNotFoundException {

		InputStream fileInStream = new FileInputStream(fileName);
		String sContentDisposition = "attachment; filename=\"" + fileName
				+ "\"";
		WebResource fileResource = Client.create().resource(TEX_UPLOAD_URL);
		ClientResponse response = fileResource.type(MediaType.TEXT_PLAIN)
				.header("Content-Disposition", sContentDisposition)
				.post(ClientResponse.class, fileInStream);

		String entity = null;

		entity = response.getEntity(String.class);
		System.out.println(entity);
		response.close();

		return entity;

	}
	
	/**
	 * File író alkalmatosság:
	 * 
	 * @param fileName
	 * @param content
	 */
	public void writeFile(String fileName, String content) {
		FileOutputStream fop = null;
		File file;

		try {
			file = new File(fileName);
			fop = new FileOutputStream(file);

			if (!file.exists()) {
				file.createNewFile();
			}

			byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
			fop.flush();
			fop.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * TeX
	 * 
	 * GET http://10.40.200.94:8080/documentconverter/pdf/ID: returns the 
	 * compiled PDF file for the session identified ID .
	 * @param id
	 */
	public void getPDF(String id, String fileName) {

		String URL = GET_PDF_URL + id;

		String entity = null;

		try {
			WebResource resource = Client.create().resource(URL);
			ClientResponse response = resource.get(ClientResponse.class);

			System.out.println(String.format("GET on [%s], status code [%d]",
					URL, response.getStatus()));

			entity = response.getEntity(String.class);

			writeFile(fileName, entity);

			response.close();

		} catch (ClientHandlerException e) {
			System.out.println(e.toString());
		}

	}
	
	/**
	 * TeX
	 * 
	 * GET http://10.40.200.94:8080/documentconverter/log/ID: returns the 
	 * compiled PDFLaTeX log for the session identified ID.
	 * 
	 * @param id
	 * @param fileName
	 */
	public void getPDFLog(String id, String fileName) {

		String URL = GET_PDF_LOG_URL + id;

		String entity = null;

		try {
			WebResource resource = Client.create().resource(URL);
			ClientResponse response = resource.get(ClientResponse.class);

			System.out.println(String.format("GET on [%s], status code [%d]",
					URL, response.getStatus()));

			entity = response.getEntity(String.class);

			writeFile(fileName, entity);

			response.close();

		} catch (ClientHandlerException e) {
			System.out.println(e.toString());
		}

	}
	
	
	/**
	 * HTML
	 * 
	 * POST http://10.40.200.94:8080/documentconverter/html: saves the HTML 
	 * file and returns a unique id.
	 * 
	 * @param fileName
	 * @return
	 * @throws FileNotFoundException
	 */
	public String uploadHTML(String fileName) throws FileNotFoundException {

			InputStream fileInStream = new FileInputStream(fileName);
			String sContentDisposition = "attachment; filename=\"" + fileName
					+ "\"";
			WebResource fileResource = Client.create().resource(HTML_UPLOAD_URL);
			ClientResponse response = fileResource.type(MediaType.TEXT_PLAIN)
					.header("Content-Disposition", sContentDisposition)
					.post(ClientResponse.class, fileInStream);

			String entity = null;

			entity = response.getEntity(String.class);
			System.out.println(entity);
			response.close();

			return entity;

		}
	
	/**
	 * HTML
	 * 
	 * GET http://10.40.200.94:8080/documentconverter/html/ID: returns the HTML 
	 * file identified by ID
	 *  
	 * @param id
	 */
	public void getHTML(String id, String fileName) {

		String URL = GET_HTML_URL + id;

		String entity = "no response";

		try {
			WebResource resource = Client.create().resource(URL);
			ClientResponse response = resource.get(ClientResponse.class);

			System.out.println(String.format("GET on [%s], status code [%d]",
					URL, response.getStatus()));

			entity = response.getEntity(String.class);

			writeFile(fileName, entity);

			response.close();

		} catch (ClientHandlerException e) {
			System.out.println(e.toString());
		}

	}

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		MDSDClient mdsdClient = new MDSDClient();
		mdsdClient.ping();
		String pdfId = mdsdClient.uploadTex("E:\\futsal.tex");
		mdsdClient.getPDF(pdfId, "E:\\futsal+"+pdfId+".pdf");
		String htmlId = mdsdClient.uploadHTML("E:\\643017.html");
		mdsdClient.getHTML(htmlId, "E:\\futsal+"+htmlId+".html");
	}

}
