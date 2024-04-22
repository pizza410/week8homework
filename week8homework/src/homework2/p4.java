package homework2;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        System.out.print("Please enter the number: ");
        Scanner input=new Scanner(System.in);
        p4 dc=new p4();
        int i=dc.sumDigit(input.nextInt());
        System.out.println("Sum of your digit is: "+i);

    }
    public int sumDigit(int number){
        int sum=0;
        if(number>=10){
            while(number>0){
               int x=number%10;
               sum+=x;
               number=number/10;
            }
        }
        else if(number<0){
            return -1;

        }
        else if(number>=0 && number<=9){
        return -1;
        }
        return sum;
    }
    static{
        System.out.println("-1 indicates invalid input");
    }
}
