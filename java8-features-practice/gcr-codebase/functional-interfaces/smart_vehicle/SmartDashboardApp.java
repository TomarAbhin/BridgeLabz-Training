package smart_vehicle;

public class SmartDashboardApp {

    public static void main(String[] args) {

        VehicleDashboard petrolCar = new PetrolCar();
        VehicleDashboard electricCar = new ElectricCar();

        petrolCar.displaySpeed();
        petrolCar.displayBatteryPercentage();

        electricCar.displaySpeed();
        electricCar.displayBatteryPercentage();
    }
}

