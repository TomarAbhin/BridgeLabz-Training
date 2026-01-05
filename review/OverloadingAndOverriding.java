class Example {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class OverloadingAndOverriding {
    public static void main(String[] args) {
        // Method Overloading example
        Example c1 = new Example();
        System.out.println(c1.add(5, 3));        
        System.out.println(c1.add(5.5, 3.2));    
        System.out.println(c1.add(1, 2, 3));    
        
        Animal animal = new Animal();
        Dog dog = new Dog();
        
        animal.sound(); 
        dog.sound();    
    }
}
