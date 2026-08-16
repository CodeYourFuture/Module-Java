package tasks;

public class Task {

    private final int id;
    private String description;
    private boolean completed;

    private static int idCounter = 0;

    public Task(String description, boolean completed) {
        if (description == null) {
            throw new IllegalArgumentException("Description should not be null");
        }

        id = idCounter;
        this.description = description;
        this.completed = completed;
        idCounter ++;
    }

    public void complete() {
        if (completed) {
            throw new IllegalStateException ("Task is already completed");

        }
        completed = true;
    }

    public int getId() {
        return id;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        if (!completed){
            return "** Summary **\n* Task ID: " + id + "\n* Task Type: " + this.getClass() + "\n* Description: " + description + "\n* Completion Status: Incomplete";
        }
        return "** Summary **\n* Task ID: " + id + "\n* Task Type: " + this.getClass() + "\n* Description: " + description + "\n* Completion Status: Completed";

    }

    @Override
    public String toString() {
        return getStatus();
    }




}
