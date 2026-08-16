package management;

import tasks.Task;

public class TaskManager {

    private Task[] tasks;
    private int taskCount;

    public TaskManager() {
        this.tasks = new Task[10];
        this.taskCount = 0;
    }

    public void addTask(Task task) {
        if (taskCount == tasks.length) {
            throw new IllegalStateException("The array is full");
        } else {
            tasks[taskCount] = task;
            taskCount++;
        }

    }

    public void completeTask(int id) {
        for (Task task : tasks) {
            if (task == null) {
                continue;
            }
            if (task.getId() == id) {
                task.complete();
            }
        }
    }

    public Task[] getTasksByStatus(boolean completed) {

        int count = 0;

        for (int i = 0; i < taskCount; i++) {
            if(tasks[i].isCompleted() == completed) {
                count++;
            }
        }
        Task[] tasksByCompletionStatus = new Task[count];

        int index = 0;

        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].isCompleted() == completed) {
                tasksByCompletionStatus[index] = tasks[i];
                index++;
            }
        }
        return tasksByCompletionStatus;

    }

    }




