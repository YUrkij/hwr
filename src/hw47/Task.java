package hw47;

public class Task implements Comparable<Task> {
    private final String name;
    private final Integer priority;
    private final String category;

    public Task(String name, Integer priority, String category) {
        this.name = name;
        this.priority = priority;
        this.category = category;
    }

    @Override
    public int compareTo(Task task) {
        int priorityCompare = priority.compareTo(task.priority) * -1;
        if (priorityCompare != 0) {
            return priorityCompare;
        }
        int categoryCompare = category.compareTo(task.category);
        if (categoryCompare != 0) {
            return categoryCompare;
        }
        return name.compareTo(task.name);
    }

    @Override
    public String toString() {
        return name + " (priority: " + priority + ", category:" + category + ")";
    }
}
