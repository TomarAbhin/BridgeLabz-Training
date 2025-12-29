//node class representing each inventory item
class Item {

    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next; 

    //constructor 
    Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

//inventory management using singly linked list
class Inventory {
    private Item head;  

    // Add item at beginning
    void addAtBeginning(String name, int id, int qty, double price) {
        Item node = new Item(name, id, qty, price);
        node.next = head;  
        head = node;        
    }

    // Add item at end
    void addAtEnd(String name, int id, int qty, double price) {
        Item node = new Item(name, id, qty, price);

        if (head == null) {
            head = node;
            return;
        }

        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;   
    }

    // Add item at specific position 
    void addAtPosition(int pos, String name, int id, int qty, double price) {

        if (pos <= 1) {
            addAtBeginning(name, id, qty, price);
            return;
        }

        Item temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return;

        Item node = new Item(name, id, qty, price);
        node.next = temp.next;
        temp.next = node;
    }

    // Remove item by Item ID
    void removeByItemId(int id) {

        if (head == null) return;

        // If head needs to be removed
        if (head.itemId == id) {
            head = head.next;
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;   
        }
    }

    // Update quantity by Item ID
    void updateQuantity(int id, int newQty) {
        Item temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    // Search item by Item ID
    void searchById(int id) {
        Item temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found with ID: " + id);
    }

    // Search item by Item Name
    void searchByName(String name) {
        Item temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                printItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Item not found with name: " + name);
    }

    // Calculate total inventory value
    void calculateTotalValue() {
        Item temp = head;
        double total = 0;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: ₹" + total);
    }

    // Sort inventory by Item Name 
    void sortByName(boolean ascending) {
        head = mergeSortByName(head, ascending);
    }

    // Sort inventory by Price
    void sortByPrice(boolean ascending) {
        head = mergeSortByPrice(head, ascending);
    }

    // Merge Sort by Item Name
    private Item mergeSortByName(Item h, boolean asc) {
        if (h == null || h.next == null)
            return h;

        Item mid = getMiddle(h);
        Item nextMid = mid.next;
        mid.next = null;

        Item left = mergeSortByName(h, asc);
        Item right = mergeSortByName(nextMid, asc);

        return mergeByName(left, right, asc);
    }

    // Merge Sort by Price
    private Item mergeSortByPrice(Item h, boolean asc) {
        if (h == null || h.next == null)
            return h;

        Item mid = getMiddle(h);
        Item nextMid = mid.next;
        mid.next = null;

        Item left = mergeSortByPrice(h, asc);
        Item right = mergeSortByPrice(nextMid, asc);

        return mergeByPrice(left, right, asc);
    }

    private Item mergeByName(Item a, Item b, boolean asc) {

        if (a == null) return b;
        if (b == null) return a;

        if ((asc && a.itemName.compareToIgnoreCase(b.itemName) <= 0) ||
            (!asc && a.itemName.compareToIgnoreCase(b.itemName) > 0)) {

            a.next = mergeByName(a.next, b, asc);
            return a;
        } else {
            b.next = mergeByName(a, b.next, asc);
            return b;
        }
    }

    
    private Item mergeByPrice(Item a, Item b, boolean asc) {

        if (a == null) return b;
        if (b == null) return a;

        if ((asc && a.price <= b.price) || (!asc && a.price > b.price)) {
            a.next = mergeByPrice(a.next, b, asc);
            return a;
        } else {
            b.next = mergeByPrice(a, b.next, asc);
            return b;
        }
    }

    // Find middle of linked list
    private Item getMiddle(Item head) {
        Item slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

   
    void displayInventory() {
        Item temp = head;

        System.out.println("ItemID\tName\tQty\tPrice");
        while (temp != null) {
            printItem(temp);
            temp = temp.next;
        }
    }

    private void printItem(Item i) {
        System.out.println(i.itemId + "\t" + i.itemName + "\t" + i.quantity + "\t" + i.price);
    }
}


public class InventorySystem {
    public static void main(String[] args) {

        Inventory inv = new Inventory();

        inv.addAtEnd("Keyboard", 101, 10, 800);
        inv.addAtEnd("Laptop", 102, 50, 50000);
        inv.addAtBeginning("Monitor", 103, 5, 12000);
        inv.addAtPosition(2, "CPU", 104, 3, 35000);

        inv.displayInventory();
        // Update quantity
        inv.updateQuantity(102, 25);
        // Search operations
        inv.searchById(101);
        inv.searchByName("CPU");
        // Calculate total value
        inv.calculateTotalValue();
        // Sorting
        System.out.println("\nSorted by Name (Ascending):");
        inv.sortByName(true);
        inv.displayInventory();
        System.out.println("\nSorted by Price (Descending):");
        inv.sortByPrice(false);
        inv.displayInventory();
    }
}
