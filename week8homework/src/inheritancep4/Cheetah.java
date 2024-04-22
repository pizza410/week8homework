package inheritancep4;

// p4 sub class
public class Cheetah extends Animal {
    public static void main(String[] args) {
        Cheetah dc=new Cheetah();
        dc.move();
    }
    public void move(){
        System.out.println("Run");
    }
}
