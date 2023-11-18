package week_10;

public class Circle2D {

    private double x;

    private double y;

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    private double radius;

    public double getRadius(){
        return radius;
    }
    public Circle2D(){
        this(0,0,1);
    }
    public Circle2D(double x, double y, double radius){
       this.x = x;
       this.y = y;
       this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return  2 * Math.PI * radius;
    }
    public boolean contains(double x2,double y2){
        double distance = Math.sqrt(Math.pow(x2 - x,2) + Math.pow(y2 - y,2));
        return distance < radius;
    }
    public boolean contains(Circle2D circle){

        double x2 = circle.getX();
        double y2 = circle.getY();
        double radius2 = circle.getRadius();
        double distanceOfCenters = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
        return radius >= (distanceOfCenters + radius2);
    }
    public boolean overlaps(Circle2D circle){
        double x2 = circle.getX();
        double y2 = circle.getY();
        double radius2 = circle.getRadius();
        double distance = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
        return distance < radius2 + radius;
    }
}
