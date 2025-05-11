package taskTracker;

public enum UrgencyLevel {
    LOW(1.5),
    NORMAL(1.0),
    HIGH(0.75),
    CRITICAL(0.5);

    private final double deadlineMultiplier;

    UrgencyLevel(double deadlineMultiplier) {
        this.deadlineMultiplier = deadlineMultiplier;
    }

    public int adjustedDeadlineDays(int estimatedHours) {
        return (int) Math.ceil(estimatedHours * deadlineMultiplier);
    }
}

