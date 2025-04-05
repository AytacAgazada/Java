package librarySystem;

public class ScienceBook extends Book{
    String field;

    public ScienceBook(String title, String author, String isbn, boolean isBorrowed, String field) {
        super(title, author, isbn, isBorrowed);
        this.field = field;
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("Field: " + field);
    }

}
