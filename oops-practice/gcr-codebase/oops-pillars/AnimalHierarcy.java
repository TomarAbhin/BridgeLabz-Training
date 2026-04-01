class Animal {     //create superclass
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {    //subclass dog
    Dog(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: bhau bhau");
    }
}

class Cat extends Animal {    //subclass cat
    Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: meow");
    }
}

class Bird extends Animal {    //subclass bird
    Bird(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says: chirp chirp");
    }
}

public class AnimalHierarcy {
    public static void main(String[] args) {
        Animal a1 = new Dog("Leo", 4);
        Animal a2 = new Cat("Nancy", 2);
        Animal a3 = new Bird("Tweety", 1);

        a1.makeSound();   // polymorphism
        a2.makeSound();
        a3.makeSound();
    }
}
    

