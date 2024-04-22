package polymorphism13;

public class Employee {
    private int id;
    private String name;
    private double salary;
    public static void main(String[] args) {
        Employee dc=new Employee();
       dc.setId(1234);
        System.out.println(dc.getId());
        System.out.println(dc.getSalary(51000));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSalary(double salary){
        return (salary>=50000)? "You have good salary":"Average salary";
    }
}
