package inheritancep3;
//p3 Father class

import java.util.Scanner;

public class BankAccount {
    double balance=500;
    public static void main(String[] args) {
        BankAccount dc=new BankAccount();
        dc.withdraw();
        System.out.print("Remaining balance= "+dc.balance);
    }
    public void deposit(){

    }
    public void withdraw(){
        System.out.print("How much you want to withdraw? ");
        Scanner input=new Scanner(System.in);
        double amount=input.nextDouble();
        this.balance=balance-amount;
    }
}
