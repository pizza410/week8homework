package polymorphismp10;

public class CheckingAccount extends BankAccount{
    public static void main(String[] args) {
        CheckingAccount dc=new CheckingAccount();
        dc.deposit();
        dc.withdraw();
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw limit is different class2");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit limit is different class 2");
    }
}
