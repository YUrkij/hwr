package hw59;

import java.util.*;
import java.util.stream.Collectors;

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

    public Map<Boolean, List<Book>> getAvailabilityMap() {
        return books.values().stream()
                .collect(Collectors.partitioningBy(Book::isAvailable));
    }

    public Map<String, List<Book>> getAuthorBooksGroup() {
        return books.values().stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
    }
    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Library lib = (Library) obj;
        return lib.getBooks() == getBooks();
    }
}
