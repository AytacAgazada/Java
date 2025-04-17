package set.libraryBookManagement;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(111, "Java Fundamentals");
        Book b2 = new Book(222, "Data Structures");
        Book b3 = new Book(333, "Algorithms in Depth");
        Book b4 = new Book(111, "Java Fundamentals - Duplicate");

        LibraryCatalogService catalog = new LibraryCatalogService();
        catalog.addBook(b1);
        catalog.addBook(b2);
        catalog.addBook(b3);
        catalog.addBook(b4); // Should trigger warning
        catalog.showCatalog();
        System.out.println();

        ReadingHistoryService history = new ReadingHistoryService();
        history.readBook(b1);
        history.readBook(b2);
        history.readBook(b1); // Moves to end
        history.showReadingHistory();
        System.out.println();

        WishlistService wishlist = new WishlistService();
        wishlist.addToWishlist(b3);
        wishlist.addToWishlist(b1);
        wishlist.addToWishlist(b3); // Duplicate
        wishlist.showWishlist();
        System.out.println();

        PopularityTrackerService tracker = new PopularityTrackerService();
        tracker.addRating(5);
        tracker.addRating(3);
        tracker.addRating(4);
        tracker.addRating(3); // Duplicate
        tracker.showRatings();
    }
}

