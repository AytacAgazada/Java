package librarySystem;

import java.util.ArrayList;

public class LibraryMember{
    String name;
    ArrayList<Book> borrowedBooks;

    public LibraryMember(String name, ArrayList<Book> borrowedBooks) {
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        if(!book.isBorrowed()) {
            book.borrowBook();
            borrowedBooks.add(book);
        } else {
            System.out.println("Cannot borrow: Book is already by someone else.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
        } else {
            System.out.println("❌ Error: You didn't borrow this book.");
        }
    }

    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has no borrowed.");
        } else {
            System.out.println(name + "'s Borrowed Books:");
            for (Book book : borrowedBooks) {
                book.displayBook();
                System.out.println("------------------------");
            }
        }
    }
}


