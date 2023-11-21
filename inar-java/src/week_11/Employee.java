package week_11;

import week_10.MyDate;

public class Employee extends Person{
    private int office;

    private double salary;

    private MyDate dataHired;


    public Employee(){

    }
    public Employee(String name, String address,long number,String email,int office,
                    double salary,MyDate dataHired){
        super(name,address,number,email);
        this.office = office;
        this.salary = salary;
        this.dataHired = dataHired;
    }

    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDataHired() {
        return dataHired;
    }

    public void setDataHired(MyDate dataHired) {
        this.dataHired = dataHired;
    }
    @Override
    public String toString() {
        return "   _Employee_\n" +
                "Name : " + super.getName() +
                "\nAddress : " + super.getAddress() +
                "\nPhone Number : " + super.getPhoneNumber() +
                "\nEmail address : " + super.getEmail() +
                "\nOffice : " + this.office +
                "\nSalary : " + this.salary ;

    }
}
