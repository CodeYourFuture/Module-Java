package main;

import tasks.*;
import management.TaskManager;

import java.time.LocalDate;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Task task = new Task("Email customised onboarding guide to new-hires", true);
        System.out.println(task.getStatus());

        PriorityTask priorityTask = new PriorityTask("Finance Team experiencing tech issues", false, "High", false);
        System.out.println(priorityTask.getStatus());

        TimedTask timedTask = new TimedTask(159, "Compliance Team needs new screens", false, LocalDate.of(2026, 8, 1), 72);
        System.out.println(timedTask.getStatus());

        TaskManager taskManager = new TaskManager();
        taskManager.addTask(task);
        taskManager.addTask(priorityTask);
        taskManager.addTask(timedTask);

        taskManager.completeTask(404);
        taskManager.completeTask(159);

        System.out.println(Arrays.toString(taskManager.getTasksByStatus(true)));

    }



}
