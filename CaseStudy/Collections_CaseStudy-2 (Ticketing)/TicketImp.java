package com.evergent.coreJAVA.collections.casestudy;

import java.util.ArrayDeque;
import java.util.Deque;

public class TicketImp implements TicketInterface {
	Deque<Ticket> ad = new ArrayDeque<>();

	public void addTicket(Ticket ticket) {
		ad.add(ticket);
		System.out.println("Ticket is Booked...");
	}

	public void processNextTicket() {
		System.out.println(ad.pollFirst().getTicket());
	}

	public void peekNextTicket() {
		System.out.println("Ticket Id: " + ad.peekFirst().getTicket());
		System.out.println("Passenger Name: " + ad.peekFirst().getName());
		System.out.println("Passenger Age: " + ad.peekFirst().getAge());
		System.out.println("From - To: " + ad.peekFirst().getRoute());
		System.out.println();
	}

	public void displayQueue() {
		for (Ticket ticket : ad) {
			System.out.println("Ticket Id: " + ticket.getTicket());
			System.out.println("Passenger Name: " + ticket.getName());
			System.out.println("Passenger Age: " + ticket.getAge());
			System.out.println("From - To: " + ticket.getRoute());
			System.out.println();
		}
	}

}
