package library;

import java.util.ArrayList;

public class Members extends Library{
    private String name;
    private int libraryNumbers;
    private int pin;
    private ArrayList<Items> userRecords; 

    public Members(String name, int libraryNumbers, int pin){
        this.name = name;
        this.libraryNumbers = libraryNumbers;
        this.pin = pin;
        userRecords = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLibraryNumbers() {
        return this.libraryNumbers;
    }

    public void setLibraryNumbers(int libraryNumbers) {
        this.libraryNumbers = libraryNumbers;
    }

    public int getPin() {
        return this.pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void checkoutItem(Items item){
        if(item.getReserved()){
            System.out.println("Sorry this was already checked out");
        }else{
        Library.removeItem(item);
        userRecords.add(item);
        item.setReserved(true);
        }
    }

    public void returnItem(Items item){
        Library.addItem(item);
        userRecords.remove(item);
    }

    public ArrayList<Items> getUserRecords(){
        return userRecords;
    }

    public void reserveItem(Items item, boolean decision){
        super.ReserveItem(item, decision);
    }

    





    
}