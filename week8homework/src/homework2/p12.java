package homework2;

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number=input.nextInt();
        boolean isprime=true;
        for(int i=2;i<number/2;i++){
            if(number%i==0){
                isprime=false;
            }
        }
        System.out.println((isprime)?"This is a prime number":"This is not a prime number");
    }
}
