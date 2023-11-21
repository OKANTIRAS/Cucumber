package week_11;

import java.util.ArrayList;

public class Course {
    private String courseName;

    ArrayList<String>students = new ArrayList<>();

    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudents(String student){
        students.add(student);
    }
    public ArrayList<String> getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }
    public void dropStudents(String student){
        students.remove(student);
    }
}
