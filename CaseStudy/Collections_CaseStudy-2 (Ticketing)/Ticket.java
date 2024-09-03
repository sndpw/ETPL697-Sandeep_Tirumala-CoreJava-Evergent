package com.evergent.coreJAVA.collections.casestudy;

public class Ticket {
	private int ticketId;
	private String name;
	private int age;
	private String from;
	private String to;

	public void setTicket() {
		this.ticketId = (int) (Math.random() * 286268878);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getTicket() {
		return ticketId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public String getRoute() {
		return from + " - " + to;
	}

//	public String getFrom() {
//		return from;
//	}
//
//	public String getTo() {
//		return to;
//	}

}
