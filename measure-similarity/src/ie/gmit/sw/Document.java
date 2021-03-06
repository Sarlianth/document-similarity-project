package ie.gmit.sw;

import java.util.List;

/*
 * Author: Adrian Sypos
 * Student number: G00309646
 * Document class containing blueprints for Document object
 */

public class Document {
	private List shinglelist;
	private String docID;
	private String name;
	
	/*
	 * Public params constructor
	 */
	public Document(String docID, String name, List shinglelist) {
		super();
		this.docID = docID;
		this.name =  name;
		this.shinglelist = shinglelist;
	}

	public List getShinglelist() {
		return shinglelist;
	}

	public void setShinglelist(List shinglelist) {
		this.shinglelist = shinglelist;
	}

	public String getDocID() {
		return docID;
	}

	public void setDocID(String docID) {
		this.docID = docID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
