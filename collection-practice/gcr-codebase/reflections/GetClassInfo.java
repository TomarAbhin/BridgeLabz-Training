package reflections;

import java.lang.reflect.*;

 //sample class
class Car {
    private double price ;
    public String name;
    public Car() {
    }

    //sample constructor
    public Car(double price, String name) {
        this.price = price; 
        this.name = name;
    }

    public void display() {
        System.out.println(price + " " + name);
    }
}

public class GetClassInfo {
    public static void main(String[] args) throws Exception {

        //create object
    	Car c=new Car(849000.0,"Dzire");

        //get Class object
        Class<?> cls =c.getClass();

        //print class name 
        System.out.println("Class Name: " + cls.getName());
        //get the constructors
        System.out.println("\nConstructors:");
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        //get the fields
        System.out.println("\nFields:");
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //get the methods
        System.out.println("\nMethods:");
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}



