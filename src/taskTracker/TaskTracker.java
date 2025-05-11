package taskTracker;

import java.time.LocalDate;
import java.util.*;

public class TaskTracker {
    public static List<Task> taskList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("=== Welcome to TaskTracker ===");
            System.out.println("1. Add task");
            System.out.println("2. Advance task status");
            System.out.println("3. List overdue tasks");
            System.out.println("4. Filter tasks by urgency");
            System.out.println("5. Show total estimated hours of active tasks");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addTask();
                case 2 -> advanceTaskStatus();
                case 3 -> listOverdueTasks();
                case 4 -> filterTasksByUrgency();
                case 5 -> showTotalEstimatedHours();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addTask() {
        System.out.print("Enter Task Name: ");
        String taskName = scanner.nextLine();

        System.out.print("Select Complexity (EASY, MEDIUM, HARD, EXTREME): ");
        TaskComplexity complexity = TaskComplexity.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Select Urgency (LOW, NORMAL, HIGH, CRITICAL): ");
        UrgencyLevel urgency = UrgencyLevel.valueOf(scanner.nextLine().toUpperCase());

        Task newTask = new Task(taskList.size() + 1, taskName, complexity, urgency, LocalDate.now());
        taskList.add(newTask);
        System.out.println("Task added. Estimated completion in " + newTask.estimatedDaysToComplete + " days.");
    }

    public static void advanceTaskStatus() {
        System.out.print("Enter Task ID to advance status: ");
        int taskId = scanner.nextInt();
        scanner.nextLine();

        Task task = taskList.stream().filter(t -> t.taskId == taskId).findFirst().orElse(null);
        if (task != null) {
            task.advanceStatus();
            System.out.println("Task status advanced: " + task);
        } else {
            System.out.println("Task not found.");
        }
    }

    public static void listOverdueTasks() {
        System.out.println("Overdue tasks:");
        for (Task task : taskList) {
            if (task.getIsOverdue()) {
                System.out.println(task);
            }
        }
    }

    public static void filterTasksByUrgency() {
        System.out.print("Enter urgency level to filter (LOW, NORMAL, HIGH, CRITICAL): ");
        UrgencyLevel urgency = UrgencyLevel.valueOf(scanner.nextLine().toUpperCase());

        System.out.println("Tasks with " + urgency + " urgency:");
        for (Task task : taskList) {
            if (task.urgency == urgency) {
                System.out.println(task);
            }
        }
    }

    public static void showTotalEstimatedHours() {
        int totalHours = taskList.stream()
                .filter(task -> task.status == TaskStatus.IN_PROGRESS || task.status == TaskStatus.REVIEW)
                .mapToInt(task -> task.complexity.getEstimatedHours())
                .sum();
        System.out.println("Total estimated hours for active tasks: " + totalHours);
    }

}
