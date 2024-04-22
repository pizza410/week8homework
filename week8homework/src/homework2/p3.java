package homework2;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter character: ");
        if(input.hasNext("[a-zA-Z]")){
            char c=input.next().toLowerCase().charAt(0);
            if(c=='a'||c=='i'||c=='e'||c=='o'||c=='u'){
                System.out.println("Input letter is vowel");
            }
            else{
                System.out.println("Input letter is constant");
            }

        }
        else{
            System.out.println("Wrong type of entry");
        }
    }
}
