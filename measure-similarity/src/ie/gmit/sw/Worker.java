package ie.gmit.sw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.query.Query;
import com.db4o.ta.TransparentActivationSupport;
import com.db4o.ta.TransparentPersistenceSupport;

import xtea_db4o.XTEA;
import xtea_db4o.XTeaEncryptionStorage;

/*
 * Author: Adrian Sypos
 * Student number: G00309646
 * Worker class extending Thread
 * Once ran, this class will keep running as a thread
 * It checks the queue every 10 seconds for jobs
 * If job is available it will create a DBworker instance that will compute the similarity between the uploaded document and the document in the database
 * It returns the result to the outQueue for the user
 */
public class Worker extends Thread{
	private BlockingQueue<Job> inQueue = new ArrayBlockingQueue<Job>(100);
	private BlockingQueue<List<Result>> outQueue = new ArrayBlockingQueue<List<Result>>(100);
	private Job j = null;
	private ObjectContainer db = null;
	private List<Document> dList = new ArrayList<Document>();
	private List<Result> rList = new ArrayList<Result>();
	private Jaccard cj;

	/*
	 * Public constructor
	 */
	public Worker() {}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
		public void run() {
			while(true) {
				inQueue = Queues.getInQueue();
				j = inQueue.poll();
				if(j != null)
				{
			
					DBworker db;
					try {
						db = new DBworker();
						dList = db.getDocuments();
						cj = new Jaccard(dList,j.getDoc());
						rList = cj.Compute();
						db.addDocuments(j.getDoc());
						db.closeDB();
						
					} catch (IOException e) {
						e.printStackTrace();
					}
					Queues.addToOutQueue(rList);
					outQueue =  Queues.getOutQueue();
					
				}
			}
		}
		
}
