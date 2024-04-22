package inheritancep3;

import java.util.Scanner;

public class SavingAccount extends BankAccount {
    public static void main(String[] args) {
     SavingAccount dc=new SavingAccount();
     dc.withdraw();
    }
    public void withdraw(){
        BankAccount dc=new BankAccount();
        System.out.print("How much you want to withdraw? ");
        Scanner input=new Scanner(System.in);
        double amount=input.nextDouble();
       if(dc.balance-amount<100){
           System.out.println("You can not withdraw more");
          return;
       }
        dc.balance=dc.balance-amount;
        System.out.println(dc.balance);
    }
}
