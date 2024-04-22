package inheritancep5;

public class Motorcycle extends vehicle{
    String maker="Mahindra";
    int year=2019;
    String fuel="Patrol";
    public static void main(String[] args) {
        vehicle dc=new vehicle();
        dc.distance_travelled(1234);
        dc.fuel_efficiency(12.04,1234);
        dc.max_speed(100);

    }
}
