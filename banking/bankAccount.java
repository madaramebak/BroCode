package banking;

public class bankAccount{
    private int balance;
    private int accountNumber;
    private String name;

    public bankAccount(int balance, int accountNumber, String name){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.name = name;
    }

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
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

}