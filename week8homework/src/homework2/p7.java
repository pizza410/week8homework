package homework2;

import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int i=input.nextInt();
        p7 dc=new p7();
        System.out.println("Sum of first and last digit is: "+dc.sumFirstANdLAstDigit(i));
    }
    public int sumFirstANdLAstDigit(int number){
        if(number<0){
            System.out.println("-1");
        }
        int last=number%10;
        int first=number;
        while(first>10){
            first=first/10;
        }
        return first+last;
    }
}
