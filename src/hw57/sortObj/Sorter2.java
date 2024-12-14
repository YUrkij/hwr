package hw57.sortObj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Sorter2 {
    public static void main(String[] args) {
        List<Task> initialTasks = Arrays.asList(
                new Task("Сделать отчет", 2),
                new Task("Позвонить клиенту", 1),
                new Task("Закончить презентацию", 3),
                new Task("Ответить на письма", 4),
                new Task("Подготовить ТЗ", 2)
        );


        PriorityQueue<Task> priorityFirstQueue = new PriorityQueue<>(
                Comparator.<Task, Integer>comparing(Task::getPriority)
                        .thenComparing(Task::getTitle));


        PriorityQueue<Task> titleFirstQueue = new PriorityQueue<>(
                Comparator.<Task, String>comparing(Task::getTitle)
                        .thenComparing(Task::getPriority)
        );

        PriorityQueue<Task> titleFirstQueueReversedPriority = new PriorityQueue<>(
                Comparator.<Task, String>comparing(Task::getTitle)
                        .thenComparing(Task::getPriority)
        );

        priorityFirstQueue.addAll(initialTasks);
        titleFirstQueue.addAll(initialTasks);
        titleFirstQueueReversedPriority.addAll(initialTasks);


        System.out.println("Очередь с сортировкой сначала по приоритету, затем по имени:");
        printQueue(priorityFirstQueue);

        System.out.println("\nОчередь с сортировкой сначала по имени, затем по приоритету:");
        printQueue(titleFirstQueue);

        System.out.println("\nОчередь с сортировкой сначала по имени, затем по приоритету в обратном порядке:");
        printQueue(titleFirstQueueReversedPriority);

    }

    private static void printQueue(PriorityQueue<Task> queue) {
        PriorityQueue<Task> copyQueue = new PriorityQueue<>(queue);
        while (!copyQueue.isEmpty()) {
            System.out.println(copyQueue.poll());
        }
    }
}
