package hw47;

public class Main {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.addTask(new Task("Починить баг консоли",2,"Bug"));
        tm.addTask(new Task("Внедрить новую функцию",3,"Feature"));
        tm.addTask(new Task("Обновить документацию",3,"Documentation"));
        tm.addTask(new Task("Исправить опечатки в докупентации",1,"Documentation"));
        tm.addTask(new Task("Устранить проблему входа в систему",1,"Bug"));
        tm.addTask(new Task("Починить критический баг консоли",3,"Bug"));
        tm.addTask(new Task("Исправить ошибку пользовательского интерфейса",2,"Bug"));
        tm.printTasks();
    }
}
