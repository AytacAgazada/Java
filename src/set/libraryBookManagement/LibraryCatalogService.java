package set.libraryBookManagement;
import java.util.*;
public class LibraryCatalogService {
    private final Set<Book> catalog = new HashSet<>();

    public void addBook(Book book){
        if (!catalog.add(book)){
            System.out.println("⚠️ Warning: Book already exists in catalog - " + book);
        }
    }

    public void showCatalog() {
        System.out.println("📚 Library Catalog:");
        catalog.stream().forEach(System.out::println);
    }
}
