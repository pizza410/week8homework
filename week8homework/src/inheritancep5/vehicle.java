package inheritancep5;
//p5 base class
public class vehicle {
    public static void main(String[] args) {

    }
    public void fuel_efficiency(double fuel,double distance){
        double efficiency = distance/fuel;
        System.out.println(efficiency);
    }
    public void distance_travelled(double d){
        System.out.println("Distance travelled: "+d);
    }
    public void max_speed(double s){
        System.out.println("Max speed is: "+s);
    }
}
