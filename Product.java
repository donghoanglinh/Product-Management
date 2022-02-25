package AS02;

/**
 * Create class Product to make object contain information of product
 */
public class Product {
    private String id, name;
    private double price;
    private int quantity;

    //contructor
    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // getter id
    public String getId() {
        return id;
    }

    //getter Name
    public String getName() {
        return name;
    }

    //getter price
    public double getPrice() {
        return price;
    }

    // getter quantity
    public int getQuantity() {
        return quantity;
    }


}
