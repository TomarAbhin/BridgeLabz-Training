package smart_house;

public class SmartHome {
    public static void main(String[] args) {

        SmartDevice light = new Light();
        SmartDevice ac = new Ac();
        SmartDevice tv = new Tv();

        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
