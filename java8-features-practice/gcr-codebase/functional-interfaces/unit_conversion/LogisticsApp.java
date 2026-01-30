package unit_conversion;

public class LogisticsApp {

    public static void main(String[] args) {

        double distanceKm = 120;
        double weightKg = 500;

        System.out.println("Miles: " + UnitConverter.kmToMiles(distanceKm));
        System.out.println("Kilograms: " + UnitConverter.lbsToKg(1100));
        System.out.println("Pounds: " + UnitConverter.kgToLbs(weightKg));
    }
}

