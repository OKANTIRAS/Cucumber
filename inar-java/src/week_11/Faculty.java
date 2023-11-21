package week_11;

import week_10.MyDate;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(){

    }
    public Faculty( String name, String address, long phoneNumber, String email,int office,
                    double salary,MyDate dateHired,String officeHours,String rank){
        super(name,address,phoneNumber,email,office,salary,dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    @Override
    public String toString() {
        return "   _Faculty_\n" +
                "Name : " + super.getName() +
                "\nAddress : " + super.getAddress() +
                "\nPhone Number : " + super.getPhoneNumber() +
                "\nEmail address : " + super.getEmail() +
                "\nOffice : " + super.getOffice() +
                "\nSalary : " + super.getSalary() +
                "\nOffice Hours : " + this.officeHours +
                "\nRank : " + this.rank;
    }
}
