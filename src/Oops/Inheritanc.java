package Oops;

import javax.swing.*;

class PersonalDetails {

    String name;
    int password;
    int age;

    PersonalDetails(String name ,int password,int age){
        this.name = name;
        this.password = password;
        this.age = age;
    }

}
class EmployeeDetails extends PersonalDetails {
    int salary;
    String companyName;


    EmployeeDetails(String name , int password, int age,int salary,String companyName){
        super(name,password,age);
        this.salary = salary;
        this.companyName =companyName;
    }
}

public class Inheritanc {
    public static void main(String[] args) {
        EmployeeDetails pd = new EmployeeDetails( "Ashpak",123,21,2000,"sagitec");

    }
}
