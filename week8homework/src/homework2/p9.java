package homework2;

import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print("Till which term you want to print? ");
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        for(int i=1;i<=number;i++){
            int sum=b+a;
            a=b;
            b=sum;
            System.out.print(a+" ");
        }
    }
}
