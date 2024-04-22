package polymorphism14;

import java.util.Scanner;

public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;
    public static void main(String[] args) {

    }

    public double getMileage() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter distance covered: ");
        double distance=input.nextDouble();
        System.out.print("Enter fuel consumed in liters: ");
        double fuel= input.nextDouble();
        return mileage=distance/fuel;
    }

    public int getYear() {
        return year;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getModel_name() {
        return model_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
