package week_10;

public class Course {
    private String courseName;

    private String[] students = new String[100];

    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents > student.length()) {
            String[] tempt = new String[students.length * 2];
            System.arraycopy(students, 0, tempt, 0, students.length);
            students = tempt;
        }
        students[numberOfStudents++] = student;


    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int indexOfDroppedStudent = getIndexOfDroppedStudent(student);
        if (indexOfDroppedStudent == -1) {
            System.out.println("There is no student with this name !");
        }
        for (int i = indexOfDroppedStudent + 1; i < students.length; i++) {
            students[i - 1] = students[i];
        }
        numberOfStudents--;
    }

    public int getIndexOfDroppedStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(student)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        numberOfStudents = 0;
        students = new String[0];
    }

    public void printStudents() {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i]);
        }
    }
}