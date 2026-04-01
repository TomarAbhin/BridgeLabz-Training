public class PhoneDetails {

    static class Phone {
        // initialization Instance variables
        String brand;
        String model;
        double price;

        Phone(String brand, String model, double price) {   // Constructor to initialize phone details
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        void display() {   // Method to display mobile phone details
            System.out.println("Phone's brand: " + brand);
            System.out.println("Phone's model: " + model);
            System.out.println("Phone's price: " + price);
        }
    }
    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", "Galaxy S25", 75000.0);  // Create Phone object 
        Phone phone1 =new Phone("Vivo", "T2 Pro", 25000.0);

        phone.display();
        phone1.display();
    }
}


