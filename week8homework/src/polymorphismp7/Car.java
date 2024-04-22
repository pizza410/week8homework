package polymorphismp7;

public class Car extends Vehicle{
    public static void main(String[] args) {
        Car dc=new Car();
        dc.speedUp();
    }
    public void speedUp(){
        System.out.println(" speed is 200kmpl");
    }
}
