package hw30;

public class Main {
    public static void main(String[] args) {
        Book oldBook = new Book();
        Book newBook = new Book();
        Author author1 = new Author();
        Author author2 = new Author();

        author1.setName("Leonid");
        author1.setSurname("Tolstoy");
        author2.setName("Boris");
        author2.setSurname("Shtern");
        oldBook.setName("War and peace");
        oldBook.setDate(1989);
        oldBook.setAuthor(author1);
        newBook.setName("47 libra");
        newBook.setDate(2016);
        newBook.setAuthor(author2);
        System.out.println(oldBook.getBookInfo());
        System.out.println(newBook.getBookInfo());
    }
}
