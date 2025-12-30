public class AreaOfCircle {

    static class Circle {
        double radius;   // initialize Instance variables

        Circle(double radius) {  // Constructor to initialize radius
            this.radius = radius;
        }

        // Method to calculate and display area
        void displayArea() {
            double pi=3.14;
            double area = pi*radius*radius;
            System.out.println("Area of Circle: " + area);
        }

        // Method to calculate and display circumference
        void displayCircumference() {
            double pi=3.14;
            double circumference = 2 *pi* radius;
            System.out.println("Circumference of Circle: " + circumference);
        }
    }

    public static void main(String[] args) {

        // Create Circle object
        Circle circle = new Circle(12.5);

        System.out.println("Radius of Circle: " + circle.radius);
        circle.displayArea();
        circle.displayCircumference();
    }
}


