public class bankAccount{
    private int balance;
    private int accountNumber;
    private String name;

    bankAccount(int balance, int accountNumber, String name){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public void withdrawal(int amount){
        this.balance -= amount;
    }

    public void checkBalance(){
        System.out.println(this.balance);
    }

    public static void main(String[] args) {
        bankAccount account = new bankAccount(500, 02134, "John");

        System.out.print("Original balance: " );
        account.checkBalance();

        account.withdrawal(85);
        account.withdrawal(17);
        account.withdrawal(43);
        account.deposit(32);

        System.out.print("After a week of spending: ");
        account.checkBalance();


    }
}