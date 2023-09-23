package week_06;

public class Question_06_08 {
    public static void main(String[] args) {

        System.out.println("Celcius     Fahrenheit      |       Fahrenheit      Celcius");
        System.out.println("-----------------------------------------------------------");
        for (double celcius = 40, fahrenheit = 120; celcius >= 31 && fahrenheit >= 30;
             celcius--, fahrenheit -= 10) {
            System.out.printf("%-11.1f %-15.1f | %11.1f %14.1f\n"
                    , celcius, celciusToFahrenheit(celcius), fahrenheit, fahrenheitToCelcius(fahrenheit));

        }

    }

    public static double celciusToFahrenheit(double celcius) {
        double fahrenheit = (9.0 / 5) * celcius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelcius(double fahrenheit){
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        return celcius;
    }

}
