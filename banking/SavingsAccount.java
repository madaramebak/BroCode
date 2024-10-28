package banking;

public class SavingsAccount extends bankAccount{
    private static final int FEE = 50;

    public SavingsAccount(int balance, int accountNumber, String name, int charge){
        super(balance, accountNumber, name);
    }

    public SavingsAccount(){
        super(0,0, "");
    }

    public void annualCharge(){
        super.setBalance(super.getBalance() - FEE);
    }

     public void checkBalance(){
        super.checkBalance();
        System.out.println("Account type: Savings");
        System.out.println("Annual Fee: " + FEE);
    }


}