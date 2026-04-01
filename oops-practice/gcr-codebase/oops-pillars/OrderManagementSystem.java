class Order {    //create superclass
    int orderId;
    String orderDate;
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {   //subclass for shippedorder
    String trackingNumber;
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {   //subclass for deliveredorder extended from shippedorder
    String deliveryDate;
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OrderManagementSystem {
    public static void main(String[] args) {
        Order o1 = new Order(101, "26-12-2025");
        Order o2 = new ShippedOrder(102, "26-12-2025", "TRK45731");
        Order o3 = new DeliveredOrder(103, "28-12-2025", "TRK48920", "31-12-2025");

        System.out.println("Order 1 Status: " + o1.getOrderStatus());
        System.out.println("Order 2 Status: " + o2.getOrderStatus());
        System.out.println("Order 3 Status: " + o3.getOrderStatus());
    }
}
