package hw30;

public class Book {
    private String name;
    private Author author;
    private Integer date;

    public Book() {
    }

    public Book(String name, Author author, Integer date) {
        this.name = name;
        this.author = author;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", date=" + date +
                '}';
    }
}
