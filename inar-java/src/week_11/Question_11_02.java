package week_11;

import week_10.MyDate;

public class Question_11_02 {
    public static void main(String[] args) {
        Person person = new Person("Gürol","Istanbul",9999999,"gürolinar");
        Person student = new Student("Nafiz","Ankara",3333333,"nafiz@hotmail",
        "freshman");
        Person employee = new Employee("Recai", "Istanbul",324543634,"recai@inar",910,
                877777,new MyDate());
        Person faculty = new Faculty("Serhat","Texas",2433454,"serhat@inar",101,334444,new MyDate(),
                "10 am to 6 pm","manager");
        Person staff = new Staff( "Ceo",212,324234324342L,
                new MyDate(),"elon","Usa",12343245325L,"elonMusk");



        System.out.println(person);
        System.out.println("-------------");
        System.out.println(student);
        System.out.println("-------------");
        System.out.println(employee);
        System.out.println("-------------");
        System.out.println(faculty);
        System.out.println("-------------");
        System.out.println(staff);
    }
}
