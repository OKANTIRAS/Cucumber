package week_13;

public class Course implements Cloneable {

    private String courseName;
    private String [] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudents(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents(){
        return this.students;
    }
    public int getNumberOfStudents(){
      return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudents(String student){
        int indexOfDroppedStudent = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equalsIgnoreCase(student)){
                indexOfDroppedStudent = i;
                numberOfStudents--;
                break;
            }
        }
        for (int i = indexOfDroppedStudent; i < numberOfStudents - 1; i++){
            students[i] = students[i + 1];
        }
    }
    @Override
    public Object clone()throws CloneNotSupportedException{
        Course clonnedCourse = (Course) super.clone();
        clonnedCourse.students = cloneList(this.students);
        return clonnedCourse;
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOfStudents; i++) {
            result.append(students[i]).append(",");

        }
        return result.toString();
    }
    public String[] cloneList(String [] list){
        String [] clonedList = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            clonedList[i] = list[i];

        }
        return clonedList;
    }








}
