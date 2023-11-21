package week_11;

public class Student extends Person {
    private  String CLASS_STATUS ;


    public Student(String classStatus) {
        CLASS_STATUS = classStatus;
    }
    public Student(){

    }
    public Student(String name, String address, long phoneNumber,String email,String clasStatus){
        super(name,address,phoneNumber,email);
        this.CLASS_STATUS = clasStatus;
    }
    public String getCLASS_STATUS(){
        return getCLASS_STATUS();
    }

    public String toString(){
        return "_Student_\n" +
           "Name: " + super.getName() +
           "\nAddress: " + super.getAddress()+
           "\nEmail address: " + super.getEmail() +
           "\nClass Status: " + this.CLASS_STATUS;
    }
}
