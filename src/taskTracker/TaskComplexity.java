package taskTracker;

public enum TaskComplexity {
    EASY(4),
    MEDIUM(8),
    HARD(16),
    EXTREME(40);

    private final int estimatedHours;

    TaskComplexity(int estimatedHours) {
        this.estimatedHours = estimatedHours;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }
}

