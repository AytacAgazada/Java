package librarySystem;

public class Book {
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    public Book(String title, String author, String isbn, boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = isBorrowed;
    }

    public Book() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            System.out.println("✅ Book '" + title + "' has been borrowed.");
        }else {
                System.out.println("❌ Error: Book '" + title + "' is already borrowed.");
            }
        }

        public void returnBook() {
            if (isBorrowed){
                System.out.println("Book '" + title + "' has been returned.");
            }else{
            System.out.println("❌ Error: Book '" + title + "' was not borrowed.");
            }
    }


    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Status: " + (isBorrowed ? "Borrow" : "Available"));
    }
}
