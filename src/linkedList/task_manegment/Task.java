package linkedList.task_manegment;

import java.util.Objects;

public class Task {
    String name;
    String priority;

    public Task(String name, String priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) && Objects.equals(priority, task.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }
}
