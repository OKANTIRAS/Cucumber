package week_13;

public class Question_13_13 {
    public static void main(String[] args)throws CloneNotSupportedException {
        Course course = new Course("Inar Academy");
        course.addStudents("Burak");
        course.addStudents("Emre");
        course.addStudents("Furkan");
        course.addStudents("Jack");
        System.out.println("Course Name : " + course.getCourseName());
        System.out.println("\nNumber of students in course1: " + course.getNumberOfStudents() +
                "\n" + course);
        System.out.println("-----------------------------------");
        Course course2 = (Course) course.clone();
        course2.addStudents("Jonny");
        course2.addStudents("Tonny");
        System.out.println("\nNumber of students in course2: " + course2.getNumberOfStudents() +
                "\n" + course2);

    }
}
