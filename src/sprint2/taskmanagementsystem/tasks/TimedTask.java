package sprint2.taskmanagementsystem.tasks;

import java.time.LocalDate;

public class TimedTask extends Task {

    private LocalDate deadline;
    public TimedTask(String description , LocalDate deadline){
        super(description);
        this.deadline = deadline;
    }

    @Override
    public String getStatus(){
        return super.getStatus() + " Deadline:" + deadline;
    }

    public LocalDate getDeadline() {
        return deadline;
    }
}
