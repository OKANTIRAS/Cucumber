package week_11;

public class Question_11_05 {
    public static void main(String[] args) {

        Course course = new Course("Inar_Java");
        course.addStudents("Nisanur Altuntas");
        course.addStudents("Gürkan Serteser");
        course.addStudents("Sinan Cetin");
        course.addStudents("Mehmet Toprak");
        course.addStudents("Sefa Atakul");
        course.addStudents("Musa Deniz");
        course.addStudents("Berkan Eris");
        System.out.println("After adding students to the course..");

        for (int i = 0; i < course.students.size(); i++) {
            System.out.println(course.students.get(i));
        }
        System.out.println("Number of students: " + course.getNumberOfStudents());
        System.out.print("-----------------------------\n");

        course.dropStudents("Nisanur Altuntas");
        course.dropStudents("Mehmet Toprak");
        course.dropStudents("Berkan Eris");

        for (int i = 0; i < course.students.size(); i++) {
            System.out.println(course.students.get(i));
        }
        System.out.println("Number of students: " + course.getNumberOfStudents());



    }
}
