package sprint2.exercises.exercise11;
//Create a Product class with:
//Fields: name, price, stockCount
//Getters and setters for each field
//A toString method that includes each of the fields
//Two constructors:
//Name and price only, defaulting stockCount to 0
//Name, price and stock
//Create several products and print them, then modify your first constructor so that it takes advantage of constructor chaining.

public class Product {

    private String name;
    private double price;
    private int stockCount;

    // Full constructor
    public Product(String name, double price, int stockCount) {
        this.name = name;
        this.price = price;
        this.stockCount = stockCount;
    }

    // Constructor chaining (default stock = 0)
    public Product(String name, double price) {
        this(name, price, 0);
    }

    // Getters
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStockCount() {
        return stockCount;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    // toString
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", stockCount=" + stockCount + "}";
    }

    // Main method (testing)
    public static void main(String[] args) {

        Product orange = new Product("Orange", 2.50);
        Product milk = new Product("Milk", 1.20, 10);
        Product bread = new Product("Bread", 1.00, 5);

        System.out.println(orange);
        System.out.println(milk);
        System.out.println(bread);

        orange.setPrice(3.00);
        System.out.println(orange);
    }
}