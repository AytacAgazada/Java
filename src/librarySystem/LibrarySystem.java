package librarySystem;

import java.nio.file.*;
import java.util.*;

public class LibrarySystem {
    public static void main(String[] args) {

        //        FictionBook fictionBook = new FictionBook(
//                "Harry Potter",
//                "J.K. Rowling",
//                "1234567890",
//                false,
//                "Fantasy"
//        );
//
//        ScienceBook scienceBook = new ScienceBook(
//                "A Brief History of Time",
//                "Stephen Hawking",
//                "0987654321",
//                false,
//                "Physics"
//        );

        Scanner scn = new Scanner(System.in);
        Book book = new Book();

        System.out.print("📗 Name of the book:  ");
        book.setTitle(scn.nextLine().trim());

        System.out.print("✒️ Writer's name: ");
        book.setAuthor(scn.nextLine().trim());

        Path path = Paths.get("C:\\Users\\User\\IdeaProjects\\ltclab\\Ltclab\\src\\librarySystem\\books.txt");

        try {
            List<String> lines = Files.readAllLines(path);
            boolean found = false;

            for (String line : lines) {
                String[] parts = line.split(",");

                if (parts[0].trim().equalsIgnoreCase(book.getTitle()) && parts[1].trim().equalsIgnoreCase(book.getAuthor())) {
                    System.out.println("\n📖 Book found!");
                    System.out.println("Title: " + parts[0]);
                    System.out.println("Author: " + parts[1]);
                    System.out.println("ISBN: " + parts[2]);
                    System.out.println("Genre: " + parts[3]);

                    Book foundBook;
                    if (parts[3].equalsIgnoreCase("Fantasy") || parts[3].equalsIgnoreCase("Mystery") || parts[3].equalsIgnoreCase("Adventure")) {
                        foundBook = new FictionBook(parts[0], parts[1], parts[2], false, parts[3]);
                    } else {
                        foundBook = new ScienceBook(parts[0], parts[1], parts[2], false, parts[3]);
                    }

                    LibraryMember alice = new LibraryMember("Alice", new ArrayList<>());
                    alice.borrowBook(foundBook);

                    System.out.println("\n📖 Displaying Borrowed Books:");
                    alice.displayBorrowedBooks();

                    System.out.println("\n🔁 Returning a Book:");
                    alice.returnBook(foundBook);

                    System.out.println("\n📖 Updated Borrowed Books:");
                    alice.displayBorrowedBooks();

                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("❌ Book not found in the library.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
