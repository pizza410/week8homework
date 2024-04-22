package polymorphismp7;

public class Bicycle extends Vehicle {
    public static void main(String[] args) {
        Bicycle dc=new Bicycle();
        dc.speedUp();
    }
    public void speedUp(){
        System.out.println("Speed is 300kmpl");
    }
}
