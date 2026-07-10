package sprint2.taskmanagementsystem.tasks;

public class Task {
//Note for me: no one can directly modify this fields this is what is called encapsulation.
    private final int id;
    private String description;
    private boolean completed;
//I have used static id generator for increment, this can be used inside all my objects. and only one copy exist for the whole class.
    private static int nextId = 1;

    public Task(String description){
        this.id = nextId;
        nextId++;
        this.description = description;
        this.completed = false;
    }
    public void complete(){
        if(completed){
            System.out.println("Task" + id + "is completed.");
            return;
        }
        completed = true;
        System.out.println("Task " + id + " is completed successfully");
    }

    public String getStatus(){
        if(completed){
            return "completed";
        }
        else{
            return "Not completed";
        }

    }

    public int getId(){
        return id;
    }
    public String getDescription(){
       return description;
    }
    //I check if description exist if it doesnt exist I print can't be empty message then set description
    public void setDescription(String description){
        if(description == null || description.isBlank()){
            System.out.println("Description cannot be empty");
            return;
        }
        this.description = description;
    }

    public boolean isCompleted(){
        return completed;
    }

}
