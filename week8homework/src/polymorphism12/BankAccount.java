package polymorphism12;

public class BankAccount {
    private double accountNo;
    private double balance;
    public static void main(String[] args) {
        BankAccount dc=new BankAccount();
        dc.setAccountNo(20000);
        dc.getAccountNo();
        dc.setBalance(1234);
        dc.getBalance();
    }

    public double getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(double accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
