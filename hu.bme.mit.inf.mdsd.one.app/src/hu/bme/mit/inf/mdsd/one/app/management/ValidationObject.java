package hu.bme.mit.inf.mdsd.one.app.management;

public class ValidationObject {
	public ValidationObject(Boolean valid, String error) {
		super();
		this.valid = valid;
		this.error = error;
	}
	private Boolean valid;
	private String error;
	public Boolean getValid() {
		return valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}

}
