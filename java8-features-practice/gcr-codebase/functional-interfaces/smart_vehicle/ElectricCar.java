package smart_vehicle;

public class ElectricCar implements VehicleDashboard {

    @Override
    public void displaySpeed() {
        System.out.println("Electric Car Speed: 90 km/h");
    }

    @Override
    public void displayBatteryPercentage() {
        System.out.println("Battery Level: 65%");
    }
}

