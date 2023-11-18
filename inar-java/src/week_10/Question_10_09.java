package week_10;

public class Question_10_09 {
    public static void main(String[] args) {
        Course course = new Course("Java Class");
        course.addStudent("Okan TIRAS");
        course.addStudent("Berk BILGIN");
        course.addStudent("Ahmet BAYRAM");
        course.printStudents();
        System.out.println();
        course.dropStudent("Okan TIRAS");
        course.printStudents();
        System.out.println();
        course.clear();
        course.printStudents();


    }


}

