package d11_09_2023;

public class Book {
    private String ISBN;
    private String title;
    private int releaseYear;
    private Author author;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public Book(){

    }
    public Book(Author author){
        this.author = author;
    }
    public void printBook(){
        System.out.println(this.ISBN);
        System.out.print(this.title);
        System.out.println(" - " + this.releaseYear);
        System.out.println("Author: " + this.author.getFirstName() + this.author.getLastName());
    }
}
