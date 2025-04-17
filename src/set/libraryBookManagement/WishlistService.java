package set.libraryBookManagement;

import java.util.*;

public class WishlistService {
    private Set<Book> wishlist = new LinkedHashSet<>();

    public void addToWishlist(Book book){
        if (!wishlist.add(book)){
            System.out.println("⚠️ Book already in wishlist: " + book);
        }
    }

    public void showWishlist() {
        System.out.println("🌟 Wishlist:");
        wishlist.stream().forEach(System.out::println);
    }
}
