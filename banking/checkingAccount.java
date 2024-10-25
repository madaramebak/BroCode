package banking;

public class checkingAccount extends bankAccount{
    private int age;
    private int charge;
    private static final int FEE = 100;

    public checkingAccount(int age, int balance, int accountNumber, String name){
        super(balance, accountNumber, name);
        this.age = age;
        this.charge = 0;
    }

    public checkingAccount(){
        super(0,0, "");
        this.age = 18;
        this.charge = 0;
    }

    public int annualCharge(){
        if(age >= 18){
            charge = FEE;
        }
        return charge;
    }


}