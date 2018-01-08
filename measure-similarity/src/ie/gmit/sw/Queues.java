package ie.gmit.sw;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*
 * Author: Adrian Sypos
 * Student number: G00309646
 * Queues class responsible for managing queues
 */

public class Queues {
	
	private static BlockingQueue<Job> inQueue;
	private static BlockingQueue<List<Result>> outQueue;
	
	private Queues(){}
	
	public static synchronized Boolean init()
	{
		inQueue = new ArrayBlockingQueue<Job>(100);
		outQueue = new ArrayBlockingQueue<List<Result>>(100);
		
		return true;
	}

	public static BlockingQueue<Job> getInQueue() {
		return inQueue;
	}

	public static void setInQueue(BlockingQueue<Job> inQueue) {
		Queues.inQueue = inQueue;
	}

	public static BlockingQueue<List<Result>> getOutQueue() {
		return outQueue;
	}

	public static void setOutQueue(BlockingQueue<List<Result>> outQueue) {
		Queues.outQueue = outQueue;
	}
	
	public static void addToInQueue(Job j)
	{
		Queues.inQueue.add(j);
	}
	
	public static void addToOutQueue(List<Result> r)
	{
		Queues.outQueue.add(r);
	}
	
}
