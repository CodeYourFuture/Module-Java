package tasks;

public class PriorityTask extends Task{
    private final String priority;
    private final boolean isApprovalRequired;

    public PriorityTask(String description, boolean completed, String priority, boolean isApprovalRequired) {
        super(description, completed);
        this.priority = priority;
        this.isApprovalRequired = isApprovalRequired;
    }

    @Override
    public String getStatus() {

        return  super.getStatus() + "\n* Priority: " + priority +
                "\n* Require Approval? : " + isApprovalRequired;

    }


}
