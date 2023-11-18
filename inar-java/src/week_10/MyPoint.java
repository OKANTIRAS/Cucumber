package week_10;

public class MyPoint {
    private double x ;
    private double y ;

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public MyPoint(){
        x = 0;
        y = 0;
    }
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + Math.pow(myPoint.getY() - y, 2));
    }



}
