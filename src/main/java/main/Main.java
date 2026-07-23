package main;

import management.TaskManager;
import tasks.Task;
import tasks.TimedTask;
import tasks.PriorityTask;


public class Main {

    public static void main(String[] args) {


        TaskManager manager = new TaskManager();


        Task task1 = new Task("Sprint 1");
        Task task2 = new TimedTask("Submit sprint 2", "25 July");
        Task task3 = new PriorityTask("Study", "HIGH");
        Task task4= new Task("SDC course");


        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);
        manager.addTask(task4);


        manager.completeTask(task1.getId());


        Task[] completedTasks = manager.getTasksByStatus(true);


        System.out.println("Completed Tasks:");

        for(Task task : completedTasks) {

            System.out.println(
                    "ID: " + task.getId()
                            + " Description: " + task.getDescription()
                            + " Status: " + task.getStatus()
            );
        }


        System.out.println("\nAll task types:");

        System.out.println(task1.getStatus());
        System.out.println(task2.getStatus());
        System.out.println(task3.getStatus());

    }
}