package management;

import tasks.Task;

public class TaskManager {

    private int taskCount;
    private Task[] tasks = new Task[10];


    public void addTask(Task task) {

        if (taskCount >= 10) {
            throw new IllegalStateException("Task manager is full");
        }

        tasks[taskCount] = task;
        taskCount++;
    }


    public void completeTask(int id) {

        for (int i = 0; i < taskCount; i++) {

            if (tasks[i].getId() == id) {

                tasks[i].complete();
                return;
            }
        }

        throw new IllegalStateException("Task was not found");
    }


    public Task[] getTasksByStatus(boolean completed) {

        int count = 0;


        for (int i = 0; i < taskCount; i++) {

            if ((tasks[i].getStatus().equals("Completed")) == completed) {
                count++;
            }
        }


        Task[] result = new Task[count];

        int index = 0;


        for (int i = 0; i < taskCount; i++) {

            if ((tasks[i].getStatus().equals("Completed")) == completed) {

                result[index] = tasks[i];
                index++;
            }
        }

        return result;
    }
}