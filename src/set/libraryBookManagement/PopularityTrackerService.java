package set.libraryBookManagement;
import java.util.*;
public class PopularityTrackerService {
    private final Set<Integer> ratings = new TreeSet<>();

    public void addRating(int rating) {
        if (!ratings.add(rating)) {
            System.out.println("⚠️ Rating already exists: " + rating);
        }
    }

    public void showRatings() {
        System.out.println("⭐ Ratings in sorted order:");
        ratings.forEach(System.out::println);
    }
}
