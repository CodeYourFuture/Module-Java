package tasks;

public class Task {

    private final int id;
    private static int nextId =1;
    private String description;
    private boolean completed;


     public Task(String description){

       this.id= nextId;
       nextId ++;
       this.description= description;
       this.completed=false;

     }

     public void complete (){

         if (completed) {
             throw new IllegalStateException("Task is completed");
                    }

           completed = true;
         }


         public String getStatus(){
          if (completed) {
              return "Completed";
          }
             return "Not completed";

         }

          public int getId(){
         return id;
          }

          public String getDescription(){
         return description;
          }
     }

