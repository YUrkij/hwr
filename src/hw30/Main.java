package hw30;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author( "Leonid", "Tolstoy");
        Book oldBook = new Book("War and peace",author1,1989);
        Book newBook = new Book("47 libra",new Author( "Boris", "Shtern"),2016);

        oldBook.setName("War and Peas");
        oldBook.setDate(100_000);
        newBook.setAuthor(new Author("Don", "Juan"));

        System.out.println(oldBook.getName());
        System.out.println(oldBook.getDate());
        System.out.println(oldBook.getAuthor().toString());

        System.out.println(newBook.getName());
        System.out.println(newBook.getDate());
        System.out.println(newBook.getAuthor().toString());

    }
}
