import java.util.*;
//abstract base class
abstract class WarehouseItem {
    private String name;
    public WarehouseItem(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract String getCategory();
}

//electronics item
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}

//groceries item
class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}

//furniture item
class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Furniture";
    }
}

//generic storage class with bounded type parameter
class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    //store item
    public void addItem(T item) {
        items.add(item);
    }

    //retrieve all stored items
    public List<T> getItems() {
        return items;
    }
}

public class WarehouseManagementSyste {
    public static void main(String[] args) {
        //create storage for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Watch"));
        electronicsStorage.addItem(new Electronics("Mobile Phone"));

        groceriesStorage.addItem(new Groceries("Flour"));
        groceriesStorage.addItem(new Groceries("Juice"));

        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        displayItems(electronicsStorage.getItems());
        displayItems(groceriesStorage.getItems());
        displayItems(furnitureStorage.getItems());
    }

    //method to display items of any WarehouseItem type
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getCategory() + " Item: " + item.getName());
        }
    }
}
    

