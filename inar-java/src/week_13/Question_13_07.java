package week_13;

public class Question_13_07 {

        public static void main(String[] args)  {
            GeometricObject[] geometricObjects = new GeometricObject[5];
            geometricObjects[0] = new Triangle(3.2, 4.0, 5.0,"blue",true);
            geometricObjects[1] = new Triangle(6, 8, 10,"red",true);
            geometricObjects[2] = new Triangle(7, 24, 25,"green",true);
            geometricObjects[3] = new Square(2);
            geometricObjects[4] = new Square(6);

            for (int i = 0; i < geometricObjects.length; i++) {

                System.out.println("Area of Geometric Object in the index " + i + " is : "
                        + geometricObjects[i].getArea());
                if (geometricObjects[i] instanceof Colorable) {
                    ((Colorable) geometricObjects[i]).howToColor();
                }
            }


        }

}
