package polymorphismp8;

public class Manager extends Employee{
    public static void main(String[] args) {
        Manager dc=new Manager();
        dc.calculateSalary();
    }
    public void calculateSalary(){
        System.out.println("Managers salary is: 80000 ");
    }
}
