package inheritancep2;

//p2 subclass
public class Car extends Vehicle {
    public static void main(String[] args) {
        Car dc=new Car();
        dc.drive();
    }
    public void drive(){
        System.out.println("Repairing a car");
    }
}
