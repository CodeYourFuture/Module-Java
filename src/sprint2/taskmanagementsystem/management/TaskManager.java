package sprint2.taskmanagementsystem.management;

import sprint2.taskmanagementsystem.tasks.Task;

public class TaskManager {

    private final Task[] tasks;
    private int taskCount;


    public TaskManager() {
        tasks = new Task[10];
        taskCount = 0;
    }


    public void addTask(Task task) {

        if (taskCount >= tasks.length) {
            System.out.println("Task limit reached.");
            return;
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

        System.out.println("Task not found.");
    }


    public Task[] getTasksByStatus(boolean completed) {

        int count = 0;

        for (int i = 0; i < taskCount; i++) {

            if (tasks[i].isCompleted() == completed) {
                count++;
            }
        }


        Task[] result = new Task[count];

        int index = 0;

        for (int i = 0; i < taskCount; i++) {

            if (tasks[i].isCompleted() == completed) {

                result[index] = tasks[i];
                index++;

            }
        }

        return result;
    }

    public Task[] getAllTasks(){
        Task[] allTasks = new Task[taskCount];

        for(int i = 0; i< taskCount; i++){
            allTasks[i] = tasks[i];
        }
        return allTasks;
    }
}