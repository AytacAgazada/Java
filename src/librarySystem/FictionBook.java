package librarySystem;

public class FictionBook extends Book {
    String genre;

    public FictionBook(String title, String author, String isbn, boolean isBorrowed, String genre) {
        super(title, author, isbn, isBorrowed);
        this.genre = genre;
    }

    @Override
    public void displayBook(){
        super.displayBook();
        System.out.println("Genre: "+ genre);
    }
}
