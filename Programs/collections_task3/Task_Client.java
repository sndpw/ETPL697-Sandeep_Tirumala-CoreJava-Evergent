package com.evergent.coreJAVA.collections_task3;
import java.util.Scanner;

public class Task_Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TaskImp task = new TaskImp();
		for (;;) {
			System.out.println(
					"1. Add New Task \n2. Search by Task No. \n3. Delete by Task No. \n4. Display All Tasks \n5. Exit");
			int no = sc.nextInt();
			sc.nextLine();
			switch (no) {
			case 1:
				Task t = new Task();
				System.out.println("Enter the Task No");
				t.setTaskNo(sc.nextLine());
				System.out.println("Enter the task title");
				t.setTaskTitle(sc.nextLine());
				System.out.println("Enter the task description");
				t.setTaskDesc(sc.nextLine());
				System.out.println(task.addTask(t));
				break;

			case 2:
				System.out.println("Enter the Task No.");
				String tno = sc.next();
				task.getTaskByNo(tno);
				break;

			case 3:
				System.out.println("Enter the Task No.");
				String tno2 = sc.next();
				task.deleteTaskByNo(tno2);
				break;

			case 4:
				task.getAllTasks();
				break;

			case 5:
				System.exit(0);
				sc.close();
			}

		}
	}
}
