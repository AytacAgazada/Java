package server.bookclass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "Chess Story";
        book1.author = "Stefan Zweig";
        book1.publicationyear = 1942;
        book1.pages = 72;
        book1.about = "It is the only story in which Zweig looks at Nazism, and he does so with characteristic emphasis on the psychological." +
                " Travelers by ship from New York to Buenos Aires find that on board with them is the world champion of chess, an arrogant and unfriendly man.";

        System.out.println(book1.displayInfo());
        System.out.println(book1.getSummary());

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter pages: ");
        book1.page = scn.nextInt();
        System.out.print(book1.readBook(book1.page));

        Book calculator = new Book();
        calculator.page1 = 15 ;
        calculator.page2 = 25;
        System.out.println("Sum of two page numbers: " + calculator.addPages(calculator.page1, calculator.page2));



    }
}
