package ie.gmit.sw;

import java.util.List;

/*
 * Author: Adrian Sypos
 * Student number: G00309646
 * Database Interface with two methods - getDocumets and addDocuments
 */
public interface DBinterface {

	public List getDocuments();
	
	public void addDocuments(Document doc);
	
}
