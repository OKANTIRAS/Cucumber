package week_13;

public class Octagon extends GeometricObject implements Cloneable {
    private double side;

    public Octagon(){

    }
    public Octagon(double side){
        this.side = side;
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side = side;
    }
    @Override
    public double getArea(){
        return (2 + 4/Math.pow(2,0.5) * side *side);
    }
    @Override
    public double getPerimeter(){
        return 8 *side;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public String toString(){
        return "Area  :"+ this.getArea() +
                "\nPerimeter  : " + this.getPerimeter();
    }
    @Override
    public boolean equals(Object o) {
        return this.getArea() == ((Octagon) o).getArea();
    }

}
