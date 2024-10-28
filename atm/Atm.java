import java.util.Scanner;

public class Atm{

    private String name;
    private int accountNumber;
    private int pin;
    private int balance;


    public Atm(){
        this.name = "";
        this.accountNumber = 0;
        this.balance = 100;
        this.pin = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPin(){
        return pin;
    }

    public void setPin(int pin){
        this.pin = pin;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void display(){
        System.out.println("Account owner: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Your current balance is: " + this.balance);
    }

    public void withdrawal(int amount){
        this.balance -= amount;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

public static void main(String[] args) {
        Atm atm = new Atm();
        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to the ATM! Please enter your name");
        String name = input.nextLine();
        atm.setName(name);


        System.out.print("Now, please enter your account number: ");
        int accountNumber = input.nextInt();
        atm.setAccountNumber(accountNumber);

        System.out.print("Next, please enter your pin");
        int pin = input.nextInt();
        atm.setPin(pin);

        input.nextLine();

        System.out.println("Welcome " + atm.getName() + "! Currently you have $" + atm.getBalance() + " dollars in Checking Account ****087");
        System.out.println();

        System.out.println("would you like to proceed with any actions? (yes or no)");
        String response = input.nextLine();

        

        


        while(response.toLowerCase().equals("yes")){


        System.out.println("Deposit or withdrawal: ");
        String action = input.nextLine();


        if(action.toLowerCase().equals("withdrawal")){
                System.out.print("Please enter withdrawal amount: ");
                int amount = input.nextInt();
                input.nextLine();
                atm.withdrawal(amount);

        }else if(action.toLowerCase().equals("deposit")){
                System.out.print("Please enter deposit amount: ");
                int amount = input.nextInt();
                input.nextLine();
                atm.deposit(amount);

        }
         System.out.println("Would you like to do any other actions (yes or no)?");
        response = input.nextLine();
        

}

        System.out.println("Thank you for your time " + atm.getName() + ". Would you like a receipt (yes or no)?");
        String receiptOption = input.nextLine();
        

        if(receiptOption.toLowerCase().equals("yes")){
                atm.display();
        }

     }



}