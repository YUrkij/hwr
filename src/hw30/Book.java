package hw30;

public class Book {
    private String name;
    private Author author;
    private Integer date;

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

    /**
     *
     * @return Возвращает название, имя и фамилию автора и дату печати в строке
     */
    public String getBookInfo() {
        return getName() + " " + getAuthor().getAuthorInfo() + " " + getDate();
    }
}
