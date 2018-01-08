package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.Part;

/*
 * Author: Adrian Sypos
 * Student number: G00309646
 * ShingleWorker class that is used to create shingles from documents
 * A shingle is build by building a string of 3 words [ignoring spaces and punctuation]
 * Therefore one shingle represents three words
 */

public class ShingleWorker {
	
	private Part part;
	private String docID;
	private File textFile;
	private Shingle shingle;
	private String[] words = null;
	private String line = null;
	private BufferedReader br;
	
	private List<Shingle> s = new ArrayList<Shingle>();
	/*
	 * Public constructor for part [uploaded files]
	 */
	public ShingleWorker(Part part, String docID) {
		super();
		this.part = part;
		this.docID = docID;
	}
	/*
	 * Public constructor for textfiles
	 */
	public ShingleWorker(File textFile, String docID)
	{
		super();
		this.textFile = textFile;
		this.docID = docID;
	}
	/*
	 * Method to create shingles and put them into a List of shingles
	 */
	public List createShingles() throws IOException
	{
		int j = 0;
		if(part != null)
		{
			br = new BufferedReader(new InputStreamReader(part.getInputStream()));
		}
		else
		{
			br = new BufferedReader(new FileReader(textFile));
		}
		StringBuilder sb = new StringBuilder();
		while ((line = br.readLine()) != null) {
			
			words = line.split("\\W+");
			
			for(int i = 0; i < words.length; i++) {
				j++;
				
				sb.append(words[i]);
				if(j == 3)
				{
					shingle = new Shingle(this.docID, sb.toString().hashCode());
					s.add(shingle);
					sb.delete(0, sb.length());
					j = 0;
				}
				
			}
		}
		return s;
	}

}