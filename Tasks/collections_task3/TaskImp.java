package com.evergent.coreJAVA.collections_task3;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskImp implements TaskInterface {
	Set<Task> taskSet = null;

	public TaskImp() {
		taskSet = new LinkedHashSet<Task>();
	}

	@Override
	public String addTask(Task b) {
		taskSet.add(b);
		return "Task with No. " + b.getTaskNo() + " is added!";
	}

	@Override
	public void getTaskByNo(String taskNo) {
		boolean b = false;
		if (taskSet.size() > 0 && taskSet != null) {
			for (Task task : taskSet) {
				if (task.getTaskNo().equals(taskNo)) {
					System.out.println("Task No: " + task.getTaskNo() + "\n" + "Task Title: " + task.getTaskTitle()
							+ "\n" + "Task Description: " + task.getTaskDesc());
					b = true;
					break;
				}
			}
		}
		if (!b)
			System.out.println("The task is not found");

	}

	@Override
	public void deleteTaskByNo(String taskNo) {
		boolean b = false;
		if (taskSet.size() > 0 && taskSet != null) {
			for (Task task : taskSet) {
				if (task.getTaskNo().equals(taskNo)) {
					System.out.println(
							"Task With No: " + task.getTaskNo() + " and Title: " + task.getTaskTitle() + " is revomed!");
					taskSet.remove(task);
					b = true;
					break;
				}
			}
		}
		if (!b)
			System.out.println("The task is not found");

	}

	@Override
	public void getAllTasks() {
		if (taskSet.size() > 0) {
			for (Task task : taskSet) {
				System.out.println("Task No: " + task.getTaskNo()+ "\n" + "Task Title: " + task.getTaskTitle() + "\n" + "Task Description: " + task.getTaskDesc());
				System.out.println();
			}

		} else {
			System.out.println("No tasks are available");
		}
	}

}
