package homework2;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        int count=1;
        int sum=0;
        Scanner input=new Scanner(System.in);
        while(count<=10){
            System.out.print("Please enter the number no "+count+" : ");
            if(input.hasNextInt()){
                int number=input.nextInt();
                sum+=number;
            }
            else{
                System.out.println("Invalid number");
                continue;
            }

            count++;
        }
        input.close();
        System.out.println("Your total sum is: "+sum);
    }
}
