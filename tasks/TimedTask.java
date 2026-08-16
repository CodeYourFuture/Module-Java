package tasks;

import java.time.LocalDate;

public class TimedTask extends Task {
    private final LocalDate deadline;
    private final double durationInHours;

    public TimedTask(int id, String description, boolean completed, LocalDate deadline, double durationInHours) {
        super(description, completed);

        if (deadline == null) {
            throw new IllegalArgumentException("Deadline should not be null");
        }

        if (durationInHours <= 0) {
            throw new IllegalArgumentException("durationInHours can not be zero or negative");
        }
        this.deadline = deadline;
        this.durationInHours = durationInHours;
    }

    @Override
    public String getStatus() {
        if (!isCompleted()){
            return "** Summary **\n* Task ID: " + getId() + "\n* Description: " + getDescription() + "\n* Deadline: " + deadline +
                    "\n* Duration: " + durationInHours + " hours" + "\n* Completion Status: Incomplete";
        }
        return "** Summary **\n* Task ID: " + getId() + "\n* Description: " + getDescription() + "\n* Deadline: " + deadline +
                "\n* Duration: " + durationInHours + " hours" + "\n* Completion Status: Completed";

    }





}
