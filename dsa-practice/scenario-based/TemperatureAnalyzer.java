import java.util.Scanner;
public class TemperatureAnalyzer {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        float[][] temperatures = new float[7][24];
        //taking input for 7 days and 24 hours
        for (int day = 0; day < 7; day++) {
            System.out.println("enter temperatures for Day " + (day + 1) + " (24 values):");
            for (int i = 0; i < 24; i++) {
                temperatures[day][i] = s.nextFloat();
            }
        }
        hottestAndColdestDay(temperatures);
        averageTemperature(temperatures);
    }

    //method to find the hottest and coldest day based on temperature values
    public static void hottestAndColdestDay(float[][] temps) {
        float hottestTemp = Float.MIN_VALUE;
        float coldestTemp = Float.MAX_VALUE;
        int hottestDay = 0;
        int coldestDay = 0;

        for (int day = 0; day < temps.length; day++) {
            for (int i = 0; i < temps[day].length; i++) {
                if (temps[day][i] > hottestTemp) {
                    hottestTemp = temps[day][i];
                    hottestDay = day + 1;
                }

                if (temps[day][i] < coldestTemp) {
                    coldestTemp = temps[day][i];
                    coldestDay = day + 1;
                }
            }
        }

        System.out.println("\nHottest Day: Day " + hottestDay + " (" + hottestTemp + "°C)");
        System.out.println("Coldest Day: Day " + coldestDay + " (" + coldestTemp + "°C)");
    }

    //method to calculate average temperature for each day
    public static void averageTemperature(float[][] temps) {
        System.out.println("\nAverage Temperature Per Day:");
        for (int day = 0; day < temps.length; day++) {
            float sum = 0;

            for (int i = 0; i < temps[day].length; i++) {
                sum += temps[day][i];
            }

            float average = sum/temps[day].length;
            System.out.println("Day " + (day + 1) + ": " + average + "°C");
        }
    }
}

