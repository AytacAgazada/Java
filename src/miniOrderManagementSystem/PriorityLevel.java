package miniOrderManagementSystem;

public enum PriorityLevel {
    LOW("Normal speed"),
    MEDIUM("Fast"),
    HIGH("Urgent");

    private final String description;

    PriorityLevel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
