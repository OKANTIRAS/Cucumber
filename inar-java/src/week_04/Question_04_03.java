package week_04;

public class Question_04_03 {
    public static void main(String[] args) {
        final double RADIUS = 6371.01;
        double atlantaGeorgiaX = 33.7489954;
        double atlantaGeorgiaY = -84.3879824;

        double orlandoFloridaX = 28.5383355;
        double orlandoFloridaY = -81.3792364999;

        double savannahGeorgiaX = 32.0835407;
        double savannahGeorgiaY = -81.09983419999998;

        double charlotteNorthCarolinaX = 35.2270869;
        double charlotteNorthCarolinaY = -80.84312669999997;

        double x1 = Math.toRadians(atlantaGeorgiaX);
        double y1 = Math.toRadians(atlantaGeorgiaY);
        double x2 = Math.toRadians(orlandoFloridaX);
        double y2 = Math.toRadians(orlandoFloridaY);
        double x3 = Math.toRadians(savannahGeorgiaX);
        double y3 = Math.toRadians(savannahGeorgiaY);
        double x4 = Math.toRadians(charlotteNorthCarolinaX);
        double y4 = Math.toRadians(charlotteNorthCarolinaY);

        double side5 = (RADIUS * Math.acos((Math.sin(x1) * Math.sin(x2))) + (Math.cos(x1) * Math.cos(x2) * Math.abs(Math.cos(y1 - y2))));
        double side4 = (RADIUS * Math.acos((Math.sin(x2) * Math.sin(x3))) + (Math.cos(x2) * Math.cos(x3) * Math.abs(Math.cos(y2 - y3))));
        double side2 = (RADIUS * Math.acos((Math.sin(x3) * Math.sin(x4))) + (Math.cos(x3) * Math.cos(x4) * Math.abs(Math.cos(y3 - y4))));
        double side1 = (RADIUS * Math.acos((Math.sin(x4) * Math.sin(x1))) + (Math.cos(x4) * Math.cos(x1) * Math.abs(Math.cos(y4 - y1))));
        double side3 = (RADIUS * Math.acos((Math.sin(x1) * Math.sin(x3))) + (Math.cos(x1) * Math.cos(x3) * Math.abs(Math.cos(y1 - y3))));

        double s = (side1 + side2 + side3) / 2 ;
        double s2 = (side3 + side4 + side5) / 2 ;

        double area = Math.sqrt(s * Math.abs( s - side1) * Math.abs(s - side2) * Math.abs(s - side3));
        double area2 = Math.sqrt(s2 * Math.abs( s2 - side3) * Math.abs(s2 - side4) * Math.abs(s2- side5));
        double totalArea = area + area2;
        System.out.println("Estimated area enclosed by these four cities: " + totalArea);
    }
}
