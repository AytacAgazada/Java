package set.libraryBookManagement;
import java.util.*;
public class ReadingHistoryService {
    private final Set<Book> history = new LinkedHashSet<>();

    public void readBook(Book book){
        history.remove(book);
        history.add(book);
    }

    public void showReadingHistory() {
        System.out.println("📖 Reading History:");
        history.stream().forEach(System.out::println);
    }

}
