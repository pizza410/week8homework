package pilymorphismp9;

public class Panther extends Animal {
    public static void main(String[] args) {
    Panther dc=new Panther();
    dc.move();
    dc.makeSound();
    }
    public void move(){
        System.out.println("Panther likes to crawl");
    }
    public void makeSound(){
        System.out.println("Sound of panther is hiss hiss");
    }
}
