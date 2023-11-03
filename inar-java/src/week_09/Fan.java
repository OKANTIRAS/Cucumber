package week_09;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = SLOW;

    private boolean on = false;

    private double radius = 5;

    private String colour = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    Fan fan = new Fan();
    public String toString(){
        if(getOn()){
            return "Fan speed :" + speed + ", colour : " + colour + ", radius :" + radius;
        } else {
            return "Fan color :" + colour + ", radius : " + radius + "\nFan is off";
        }

    }



}
