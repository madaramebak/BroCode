package banking;

public class checkingAccount extends bankAccount{
    private static final int FEE = 100;

    public checkingAccount(int age, int balance, int accountNumber, String name){
        super(balance, accountNumber, name);
    }

    public checkingAccount(){
        super(0,0, "");
    }

    public void annualCharge(){
       super.setBalance(super.getBalance() - FEE);
    }

    @Override
    public void checkBalance(){
        super.checkBalance();
        System.out.println("Account type: Checking");
    }


}