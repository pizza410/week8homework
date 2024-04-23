package homework2;

import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows=input.nextInt();
        int middle=(rows+1)/2;
        for(int i=1;i<=middle;i++){
            for(int j=1;j<=middle-i;j++) {
                System.out.print("  ");
            }
            for(int k=1;k<2*i;k++){
                System.out.print("* ");
            }
            System.out.println();
            }
        for(int i=middle-1;i>0;i--){
            for(int j=middle;j>i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<2*i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        }

    }

