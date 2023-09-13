package d11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Author author = new Author("Milos", " Josifovic");
        Author author1 = new Author("Marko", " Markovic");

        Book book = new Book(author);
        Book book1 = new Book(author1);

        book.setISBN("0689");
        book.setReleaseYear(2012);
        book.setTitle("Mastery");

        book1.setISBN("0687");
        book1.setReleaseYear(2014);
        book1.setTitle("Tom Sawyer");

        book.printBook();
        book1.printBook();
    }
}
