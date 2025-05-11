package taskTracker;

public enum TaskStatus {
    TO_DO("Yet to be started"),
    IN_PROGRESS("Currently in progress"),
    REVIEW("Under review"),
    COMPLETED("Task completed");

    private final String description;

    TaskStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFinalStatus() {
        return this == COMPLETED;
    }
}
