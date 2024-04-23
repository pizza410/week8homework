package homework2;

import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number=input.nextInt();
        if(number<0){
            System.out.println("-1");
        }
        int sum=0;
        while(number>0){
            int digit=number%10;
            if(digit%2==0){
                sum=sum+digit;
            }
            number=number/10;
        }

        System.out.println("Sum of even digits is "+sum);
    }
}
