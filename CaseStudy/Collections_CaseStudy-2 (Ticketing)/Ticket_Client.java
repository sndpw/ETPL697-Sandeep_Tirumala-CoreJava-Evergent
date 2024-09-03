package com.evergent.coreJAVA.collections.casestudy;

import java.util.Scanner;

public class Ticket_Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TicketImp ticket = new TicketImp();
		for (;;) {
			System.out.println(
					"1. Add Ticket \n2. Process next ticket \n3. Peek next ticket \n4. Display Tickets \n5. Exit");
			int no = sc.nextInt();
			sc.nextLine();
			switch (no) {
			case 1:
				Ticket t = new Ticket();
				t.setTicket();
				System.out.println("Enter the Name");
				t.setName(sc.nextLine());
				System.out.println("Enter the Age");
				t.setAge(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter the From address");
				t.setFrom(sc.nextLine());
				System.out.println("Enter the Destination address");
				t.setTo(sc.nextLine());
				ticket.addTicket(t);
				break;

			case 2:
				System.out.println("Processing the next ticket");
				ticket.processNextTicket();
				break;

			case 3:
				System.out.println("Getting the next ticket");
				ticket.peekNextTicket();
				break;

			case 4:
				ticket.displayQueue();
				break;

			case 5:
				sc.close();
				System.exit(0);
			}

		}
	}
}
