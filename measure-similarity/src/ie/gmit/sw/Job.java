package ie.gmit.sw;

/*
 * Author: Adrian Sypos
 * Student number: G00309646
 * Job class containing blueprints for Job object
 */

public class Job {
	private Document doc;

	/*
	 * Public params constructor
	 */
	public Job(Document doc) {
		super();
		this.doc = doc;
	}

	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}	
	
}
