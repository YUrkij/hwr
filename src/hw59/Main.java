package hw59;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Library library = getLibrary();

        System.out.println("Книга с ID 3: " + library.getBookById(3));

        System.out.println("\nВсе книги (сортировка по названию):");
        library.getBooks().forEach(System.out::println);
        System.out.println("\nВсе книги (сортировка по автору):");
        library.getBooks(Comparator.comparing(Book::getAuthor)).forEach(System.out::println);

        System.out.println("\nДоступные книги (сортировка по названию):");
        library.getBooks(true).forEach(System.out::println);

        System.out.println("\nДоступные книги (сортировка по автору):");
        library.getBooks(true, Comparator.comparing(Book::getAuthor)).forEach(System.out::println);

        System.out.println("\nНедоступные книги:");
        library.getBooks(false).forEach(System.out::println);


        System.out.println("\nКоличество всех книг: " + library.getBookCount());
        System.out.println("Количество доступных книг: " + library.getBookCount(true));
        System.out.println("Количество недоступных книг: " + library.getBookCount(false));

        System.out.println("\nСписок авторов:");
        library.getAuthors().forEach(System.out::println);
    }

    private static Library getLibrary() {
        Library library = new Library();

        Book book1 = new Book( "Властелин колец", "Джон Толкин", true);
        Book book2 = new Book( "Война и мир", "Лев Толстой", false);
        Book book3 = new Book( "1984", "Джордж Оруэл", true);
        Book book4 = new Book( "Мятная сказка", "Александр Полярный", false);
        Book book5 = new Book( "Без названия", "Неизвестный", true);
        Book book6 = new Book( "Ещё названия", "Неизвестный", true);
        Book book7 = new Book( "Опять названия", "Неизвестный", true);
        Book book8 = new Book( "Приключения Шерлока Холмса", "Артур Конан Дойл", true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        return library;
    }
}


