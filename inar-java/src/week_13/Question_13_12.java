package week_13;

public class Question_13_12 {
    public static void main(String[] args) {

        GeometricObject[] geometricObjects = new GeometricObject[4];
        GeometricObject circle1 = new Circle_09(8);
        GeometricObject circle2 = new Circle_09(6);
        GeometricObject rectangle1 = new Rectangle_10(3,4);
        GeometricObject rectangle2 = new Rectangle_10(5,8);
        geometricObjects[0] = circle1;
        geometricObjects[1] = circle2;
        geometricObjects[2] = rectangle1;
        geometricObjects[3] = rectangle2;

        double sumArea = sumArea(geometricObjects);
        System.out.printf("Total area of Geometric Objects: %.2f",sumArea);




    }
    public static double sumArea(GeometricObject[] geometricObjects){
        double sumArea = 0;
        for (int i = 0; i < geometricObjects.length; i++) {
            sumArea+= geometricObjects[i].getArea();
        }
        return sumArea;
    }

}

