package smart_vehicle;

public interface VehicleDashboard {

    void displaySpeed();

    default void displayBatteryPercentage() {
        System.out.println("Battery percentage not applicable for this vehicle");
    }
}

