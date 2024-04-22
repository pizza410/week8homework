package polymorphismp6;

public class Bird extends Animal{
    public static void main(String[] args) {
        Bird dc=new Bird();
        dc.Sound();

    }
    public void Sound(){
        System.out.println("Bird makes CHI CHI");
    }
}
