package hw43;

import java.util.*;

public class ListsOfStudents {

    private final List<String> students = new ArrayList<>();

    /**
     * Добавление имя в список
     *
     * @param name - имя
     */
    public void addStudent(String name) {
        students.add(name);
    }

    /**
     * Добавление имя в список по индексу
     *
     * @param index - индекс
     * @param name  - имя
     */
    public void addStudent(int index, String name) {
        if (students.size() > index && index >= 0) {
            students.add(index, name);
        } else {
            System.out.println("Index Not Found");
        }
    }

    /**
     * Добавление имён в список из массива
     *
     * @param names - массив имён
     */
    public void addStudents(String[] names) {
        Collections.addAll(students, names);
    }

    /**
     * Добавление имён в список из массива с индекса
     *
     * @param index - индекс
     * @param names - массив имён
     */
    public void addStudents(int index, String[] names) {
        if (students.size() > index && index >= 0) {
            for (String name : names) {
                students.add(index, name);
                index++;
            }
        } else {
            System.out.println("Index Not Found");
        }
    }

    /**
     * Добавление имён в список из Листа
     *
     * @param names - Лист имён
     */
    public void addStudents(List<String> names) {
        students.addAll(names);
    }

    /**
     * Добавление имён в список из Листа синдекса
     *
     * @param index - индекс
     * @param names - Лист имён
     */
    public void addStudents(int index, List<String> names) {
        if (students.size() > index && index >= 0) {
            students.addAll(index, names);
        } else {
            System.out.println("Index Not Found");
        }
    }

    /**
     * Возвращает имя студента по индексу
     *
     * @param index - индекс
     * @return Имя студента
     */
    public String getStudent(int index) {
        if (students.size() > index && index >= 0) {
            return students.get(index);
        } else {
            return "Student Not Found";
        }
    }

    /**
     * Убирает первого встречанного студента по имени
     *
     * @param name - имя
     */
    public void removeStudent(String name) {
        if (students.contains(name)) {
            students.remove(name);
        } else {
            System.out.println("Student Not Found");
        }
    }

    /**
     * Убирает первого встречанного студента по индексу
     *
     * @param index - индекс
     */
    public void removeStudent(int index) {
        if (students.size() > index && index >= 0) {
            students.remove(index);
        } else {
            System.out.println("Index Not Found");
        }
    }

    /**
     * Проверяет, есть ли в списке имя
     *
     * @param name - имя
     * @return
     */
    public boolean containsStudent(String name) {
        return students.contains(name);
    }

    /**
     * Проверяет, есть ли в списке массив имён
     *
     * @param names
     * @return
     */
    public boolean containsStudent(String[] names) {
        return students.containsAll(Arrays.stream(names).toList());
    }

    /**
     * Проверяет, есть ли в списке Лист имён
     *
     * @param names - Лист имён
     * @return
     */
    public boolean containsStudent(List<String> names) {
        return students.containsAll(names);
    }

    /**
     * Получить кол-во студентов
     *
     * @return
     */
    public int getStudentsCount() {
        return students.size();
    }

    /**
     * Проверяет, пустой ли список
     *
     * @return
     */
    public boolean isStudentEmpty() {
        return students.isEmpty();
    }

    /**
     * Очищает список студентов
     */
    public void clearStudent() {
        if (!isStudentEmpty()) {
            students.clear();
        }
    }
}
