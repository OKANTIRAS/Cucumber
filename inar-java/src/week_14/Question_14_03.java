package week_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_14_03 {
    public static void main(String[] args) {
        List<Point> points = getRandomlyGeneratedPoints();

        List<Point> sortedAccordingToX = sortAccordingToX(points);
        List<Point> sortedAccordingToY = sortAccordingToY(points);

        printResult(sortedAccordingToX, sortedAccordingToY);

    }
    public static List<Point> getRandomlyGeneratedPoints() {
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            double randomX = Math.random() * 100;
            double randomY = Math.random() * 100;
            points.add(new Point(randomX, randomY));
        }
        return points;
    }
    public static List<Point> sortAccordingToX(List<Point> list) {
        List<Point> result = new ArrayList<>(list);
        Collections.sort(result);
        return result;
    }
    public static List<Point> sortAccordingToY(List<Point> list) {
        List<Point> result = new ArrayList<>(list);
        CompareY compareAccordingToY = new CompareY();

        result.sort(compareAccordingToY);
        return result;
    }
    public static void printResult
            (List<Point> xOrientedPoints, List<Point> yOrientedPoints) {
        System.out.println("Points sorted                    Points sorted");
        System.out.println("According to X                   According to Y");
        for (int i = 0; i < xOrientedPoints.size(); i++) {
            System.out.println(xOrientedPoints.get(i) + "                   " + yOrientedPoints.get(i));
        }
    }
}
