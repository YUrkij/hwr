package hw57.sortObj;

import java.util.Objects;

class Task {
    private final String title;
    private final int priority;

    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }


    public int getPriority() {
        return priority;
    }


    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return priority == task.priority && Objects.equals(title, task.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, priority);
    }
}
