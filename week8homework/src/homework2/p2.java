package homework2;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean i=true;
        System.out.print("Please enter the numbers: ");
        int number=input.nextInt();
        int max=number;
        int min =number;
        while(i){
            int number1=input.nextInt();
            if(number1>number){
                max=number1;
            }
            else if(number1<number){
                min=number1;
            }
            if(input.hasNextInt()) {
                if (number1 > max) {
                    max = number1;
                } else if (number1 < min) {
                    min = number1;
                }
            }
            else {
                System.out.println("Your number is not valid");
                i=false;
            }

        }
        System.out.println("Your min and max is "+min+" "+max+" respectively.");

    }
}
