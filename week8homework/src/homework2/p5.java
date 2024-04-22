package homework2;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number: ");
        p5 dc=new p5();
        boolean b=dc.isPalindrome(input.nextInt());
        if(b)
            System.out.println("Given number is palindrome");
        else
            System.out.println("Given number is not palindrome");

    }
    public boolean isPalindrome(int number){
        if(number<0){
            number=-number;
        }
        int i=number;
        int reversed=0;
        while(number>0){
            int lastdigit=number%10;
            reversed=reversed*10+lastdigit;
            number=number/10;
        }
        return reversed==i;
    }
}
