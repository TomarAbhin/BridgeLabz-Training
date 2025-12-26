class Device {     //create superclass
    int deviceId;
    String status;
    Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class ThermoDevice extends Device {   //themodevice subclass
    double temperatureSetting;
    ThermoDevice(int deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        Device d1 = new Device(101, "ON");
        ThermoDevice t1 = new ThermoDevice(201, "ON", 21.5);
        System.out.println("Generic Device:");
        d1.displayStatus();

        System.out.println("\nThermostat Device:");
        t1.displayStatus();
    }
}


