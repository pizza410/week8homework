package inheritancep5;

public class Truck extends vehicle{
    String maker="TATA";
    int year=2017;
    String fuel="Diesel";
    public static void main(String[] args) {
        vehicle dc=new vehicle();
        dc.distance_travelled(1234);
        dc.fuel_efficiency(12.04,1234);
        dc.max_speed(100);

    }
}
