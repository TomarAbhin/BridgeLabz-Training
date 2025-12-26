interface Worker {    //interface showing common work behavior
    void performDuties();   // abstract method
}

class Person {  //create superclass
    String name;
    int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {   //chef subclass(inherits Person and implements Worker)
    Chef(String name, int id) {
        super(name, id);
    }
    //unique duty of Chef
    public void performDuties() {
        System.out.println("Chef is preparing food.");
    }
}

class Waiter extends Person implements Worker {  //waiter subclass(inherits Person and implements Worker)
    Waiter(String name, int id) {
        super(name, id);
    }
    //unique duty of Waiter
    public void performDuties() {
        System.out.println("Waiter is serving customers.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Abhay", 106);
        Waiter waiter = new Waiter("Aman", 203);
        chef.showDetails();
        chef.performDuties();

        waiter.showDetails();
        waiter.performDuties();
    }
}
