package homework2;

import java.util.Scanner;

public class p10 {
   static int sum=0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        int original=number;
        int j = String.valueOf(number).length();
        while (number > 0) {
            int i = number % 10;
            int sum1=1;
            for(int k=1;k<=j;k++){
                sum1=sum1*i;
            }
            sum=sum+sum1;
            number=number/10;
        }
        System.out.println((sum==original)? "This is Armstrong":"This is not armstrong");
    }
}
