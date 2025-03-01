package server.bookclass;


public class Book {
    String title;
    String author;
    int publicationyear;

    String about;

    int pages,page;

    int page1,page2;


    public String displayInfo(){
        return "Book's author: " + author +"\n ,title: " + title +"\n publication year: " + publicationyear;
    }

    public String getSummary(){
        return about;
    }

    public String readBook(int page){
        boolean read;
        if (page == pages) {
            return "You finished the book!";
        } else if (page>0 && page<pages) {
            page = pages-page;
            return "You have " + page +" pages to finish the book";
        }else {
            return "You have never read the book!";
        }
    }

    public int addPages(int page1,int page2){
        int sum = page1 + page2;
        return sum;
    }
}