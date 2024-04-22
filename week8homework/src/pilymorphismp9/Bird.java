package pilymorphismp9;

public class Bird extends Animal{
    public static void main(String[] args) {
        Bird dc=new Bird();
        dc.makeSound();
        dc.move();

    }
    public void move(){
        System.out.println("Birds like to fly");
    }
    public void makeSound(){
        System.out.println("Bird's sound is chi chi ");
    }
}
