package polymorphism11;

import java.util.Scanner;

public class Person {
    private String name;
    private double age;
    private String country;

    public static void main(String[] args) {
        Person dc=new Person();
        dc.setAge();
        dc.setcountry();
        dc.setName();
        dc.getAge();
        dc.getcountry();
        dc.getName();

    }
    public void setAge(){
        System.out.print("Please enter the age: ");
        Scanner input=new Scanner(System.in);
        double age=input.nextDouble();
        this.age = age;
        System.out.println(age);
    }
    public double getAge(){
        return age;
    }
    public void setName(){
        System.out.print("Please enter the name: ");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        this.name = name;
        System.out.println(name);
    }
    public String getName(){
        return name;
    }

    public void setcountry(){
        System.out.print("Please enter the name of country: ");
        Scanner input=new Scanner(System.in);
        String country=input.nextLine();
        this.country = country;
        System.out.println(country);
    }
    public String getcountry(){
        return country;
    }


}
