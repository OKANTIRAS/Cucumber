package week_06;

public class Question_06_09 {
    public static void main(String[] args) {
        System.out.println("Feet        Meters      |        Meters       Feet");
        System.out.println("------------------------------------------------");

        for(double feet = 1, meters = 20; feet <= 10 && meters <= 65; feet++, meters += 5){
            System.out.printf("%-11.1f %-11.3f | %11.1f %14.3f\n",
                    feet,footToMeter(feet),meters,meterToFoot(meters));


        }
    }
    public static double footToMeter(double foot){
        double meter = 0.305 * foot;
        return meter;

    }
    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;
        return foot;
    }
}
