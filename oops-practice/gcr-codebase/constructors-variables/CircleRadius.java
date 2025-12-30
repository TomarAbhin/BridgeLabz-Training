public class CircleRadius {
    static class Circle {
        //initialize instance variable
        double radius;

        Circle() {    // constructor for defaut value
            this(4.0); 
        }
        Circle(double radius) {  // constructor for user-input value
            this.radius = radius;
        }
        void display() { // Method to display radius
            System.out.println("radius of circle is: " + radius);
        }
    }
    public static void main(String[] args) {
        Circle c1 = new Circle();  // Using default constructor
        c1.display();   

        Circle c2 = new Circle(10.5); // Using parameterized constructor
        c2.display();
    }
}


