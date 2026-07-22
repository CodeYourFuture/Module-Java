package tasks;


public class TimedTask  extends Task{

    private String deadLine ;

    public TimedTask (String description , String deadline){

        super(description);
        this.deadline = deadline;

    }

    public String getDeadLine(){
        return deadline;
    }

    @Override
    public String getStatus(){
        return super.getStatus() + " -Dead line is " + deadline;
    }

}
