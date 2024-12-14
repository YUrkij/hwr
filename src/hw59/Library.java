package hw59;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private final Map<Integer, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public Book getBookById(int id) {
        return books.get(id);
    }

    public List<Book> getBooks() {
        return books.values().stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .toList();
    }

    public List<Book> getBooks(Comparator<Book> comparator) {
        return books.values().stream()
                .sorted(comparator)
                .toList();
    }

    public List<Book> getBooks(boolean available) {
        return books.values().stream()
                .filter(book -> book.isAvailable() == available)
                .sorted(Comparator.comparing(Book::getTitle))
                .toList();
    }
    public List<Book> getBooks(boolean available, Comparator<Book> comparator) {
        return books.values().stream()
                .filter(book -> book.isAvailable() == available)
                .sorted(comparator)
                .toList();
    }

    public long getBookCount() {
        return books.size();
    }

    public long getBookCount(boolean available) {
        return books.values().stream()
                .filter(book -> book.isAvailable() == available)
                .count();
    }

    public List<String> getAuthors() {
        return books.values().stream()
                .map(Book::getAuthor)
                .distinct()
                .sorted()
                .toList();
    }

}
