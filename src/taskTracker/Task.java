package taskTracker;

import java.time.LocalDate;

public class Task {
    Integer taskId;
    String taskName;
    TaskStatus status;
    TaskComplexity complexity;
    UrgencyLevel urgency;
    Boolean isOverdue;
    Integer estimatedDaysToComplete;
    LocalDate assignedDate;

    public Task(Integer taskId, String taskName, TaskComplexity complexity, UrgencyLevel urgency, LocalDate assignedDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.complexity = complexity;
        this.urgency = urgency;
        this.assignedDate = assignedDate;
        this.estimatedDaysToComplete = urgency.adjustedDeadlineDays(complexity.getEstimatedHours());
        this.status = TaskStatus.TO_DO;
        this.isOverdue = false;
    }

    public void advanceStatus() {
        switch (status) {
            case TO_DO -> status = TaskStatus.IN_PROGRESS;
            case IN_PROGRESS -> status = TaskStatus.REVIEW;
            case REVIEW -> status = TaskStatus.COMPLETED;
            default -> System.out.println("Task is already completed.");
        }
    }

    public Boolean getIsOverdue() {
        return LocalDate.now().isAfter(assignedDate.plusDays(estimatedDaysToComplete));
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", status=" + status +
                ", complexity=" + complexity +
                ", urgency=" + urgency +
                ", isOverdue=" + isOverdue +
                ", estimatedDaysToComplete=" + estimatedDaysToComplete +
                ", assignedDate=" + assignedDate +
                '}';
    }
}
