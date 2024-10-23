import java.util.ArrayList;
public class tester{
    public static void main(String[] args) {
        Book textBook = new Book("Python intro", 341784, "Bon Jovi");
        Book historyBook = new Book("Modern world History", 14013, "Kai cenat");
        Book chemistryBook = new Book("Organic Chemistry", 31412, "The Faze Clan");

        Library.addBook(textBook);
        Library.addBook(historyBook);
        Library.addBook(chemistryBook);

        ArrayList<Book> collection = Library.getCollection();

        System.out.println("Current Collection:");
        System.out.println("-------------------");
        for(Book book: collection){
            System.out.println("Name: " + book.getName());
            System.out.println("ISBN: " + book.getISBN());
            System.out.println("Author: " + book.getAuthor());
            System.out.println();
        }

        
    }
}