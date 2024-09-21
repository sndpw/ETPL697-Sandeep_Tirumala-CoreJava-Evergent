package com.evergent.coreJAVA.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCustomerService15 {
	public static void main(String[] args) {
		// Creating a Queue using LinkedList
		Queue<String> customerQueue = new LinkedList<>();

		// Adding customer requests to the queue (enqueue)
		customerQueue.add("Customer 1: Request for account balance.");
		customerQueue.add("Customer 2: Request for password reset.");
		customerQueue.add("Customer 3: Request for new credit card.");
		customerQueue.add("Customer 4: Request for transaction history.");

		// Display the initial queue
		System.out.println("Initial Customer Queue: " + customerQueue);

		// Processing customer requests in FIFO order (dequeue)
		while (!customerQueue.isEmpty()) {
			String currentRequest = customerQueue.poll(); // Retrieves and removes the head of the queue
			System.out.println("Processing: " + currentRequest);

			// Simulate some processing time
			try {
				Thread.sleep(1000); // Pause for 1 second to simulate processing
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Display the queue after processing all requests
		System.out.println("All customer requests have been processed. Final Queue: " + customerQueue);
	}
}