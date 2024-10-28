package banking;

public class bankAccount implements actions{
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
    @Override
    public void deposit(int amount){
        this.balance += amount;
    }

	@Override
    public void withdrawal(int amount){
		if(amount > 0 && amount <= balance){
        this.balance -= amount;
		}
    }

    @Override
    public void checkBalance(){
        System.out.println("User: " + getName());
		System.out.println("Account number: " + getAccountNumber());
		System.out.println("Balance: " + getBalance());
    }

}