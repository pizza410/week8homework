package polymorphismp10;

public class SavingAccount extends BankAccount{
    public static void main(String[] args) {
     SavingAccount dc=new SavingAccount();
     dc.deposit();
     dc.withdraw();
    }

    @Override
    public void deposit() {
        System.out.println("Deposit limit is different class 1");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw limit is different class 1");
    }
}
