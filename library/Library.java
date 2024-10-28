package library;

import java.util.ArrayList;

public class Library{
    private static ArrayList<Items> libraryRecords = new ArrayList<>();



    public static void addItem (Items item){
        libraryRecords.add(item);
    }

    public static void removeItem (Items item){
        libraryRecords.remove(item);
    }

    public static boolean searchForBook(Items item){
        return libraryRecords.contains(item);
    }

    public static ArrayList<Items> getCollection (){
        return libraryRecords;
    }

    public void ReserveItem (Items item, boolean decision){
            if(decision){
                item.setReserved(true);
            }
    }

    public static void display(){
        for(Items Item : libraryRecords){
            System.out.println("Author: " + Item.getAuthor());
            System.out.println("Name: " + Item.getName());
            System.out.println("Identification #: " + Item.getIdentification());
            System.out.println("Reserved: " + Item.getReserved());
        }
    }

}