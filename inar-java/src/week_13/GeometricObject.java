package week_13;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean isFilled;
    private Date whenCreated;

    protected GeometricObject() {
        this.whenCreated = new Date();
    }

    protected GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
        this.whenCreated = new Date();
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.isFilled;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public Date getWhenCreated() {
        return this.whenCreated;
    }

    @Override
    public String toString() {
        return "Created on " + this.whenCreated + "\ncolor : " + this.color +
                " and filled : " + this.isFilled;
    }
    @Override
    public int compareTo(GeometricObject object){
        if(this.getArea() > object.getArea()){
            return 1;
        } else if (this.getArea() == object.getArea()) {
            return 0;
        }else{
            return -1;
        }
    }


    public abstract double getArea();

    public abstract double getPerimeter();

}
