package week_09;

public class Question_09_08 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColour("yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan1.setRadius(5);
        fan1.setColour("blue");
        fan1.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());


    }
}
