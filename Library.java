import java.util.ArrayList;

public class Library{
    private static ArrayList<Book> bookCollection = new ArrayList<>();

    public static void addBook (Book book){
        bookCollection.add(book);
    }

    public static void removeBook (Book book){
        bookCollection.remove(book);
    }

    public static boolean searchForBook(Book book){
        return bookCollection.contains(book);
    }

    public static ArrayList<Book> getCollection (){
        return bookCollection;
    }

}