package hw47;

import java.util.PriorityQueue;

public class TaskManager {
    PriorityQueue<Task> tasks;

    public TaskManager() {
        tasks = new PriorityQueue<>();
    }

    /**
     * Добавление задачи
     * @param task - задача
     */
    public void addTask(Task task) {
        tasks.offer(task);
    }

    @Override
    public String toString() {
        return tasks.toString();
    }

    /**
     * Вывод всех накопившихся задач
     */
    public void printTasks() {
        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }
    }
}

