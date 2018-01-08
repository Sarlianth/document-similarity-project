package ie.gmit.sw;

/*
 * Author: Adrian Sypos
 * Student number: G00309646
 * Result class containing blueprints for Result object
 */

public class Result {
	
	private String newDocument;
	private String oldDocument;
	private double result;
	
	/*
	 * Public constructor with params
	 */
	public Result(String newDoc, String oldDoc, double result) {
		super();
		newDocument = newDoc;
		this.oldDocument = oldDoc;
		this.result = result;
	}
	
	public String getNewDoc() {
		return newDocument;
	}
	
	public void setNewDoc(String newDoc) {
		newDocument = newDoc;
	}
	
	public String getOldDoc() {
		return oldDocument;
	}
	
	public void setOldDoc(String oldDoc) {
		this.oldDocument = oldDoc;
	}
	
	public double getResult() {
		return result;
	}
	
	public void setResult(double result) {
		this.result = result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if((String) obj == this.getNewDoc())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
