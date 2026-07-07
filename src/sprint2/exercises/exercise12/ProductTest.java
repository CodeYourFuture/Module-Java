package sprint2.exercises.exercise12;
//Exercise 1.2 - Reference Behaviour
//Starting with the following in your main method:
//Product p1 = new Product("Laptop", 900);
//Product p2 = p1;
//p2.setPrice(1100);
//System.out.println(p1.getPrice());
//System.out.println(p2.getPrice());
//Tasks:
//Predict the output
//Run the code to verify
//Change how p2 is instantiated so that making changes to it does not affect p1

public class ProductTest {
    private String name;
    private double price;
    private int stockCount;

    //constructor
    public ProductTest(String name, double price, int stockCount ){
        this.name = name;
        this.price = price;
        this.stockCount = stockCount;
    }

    //constructor chaining
    public ProductTest(String name, double price){
        this(name, price, 0);
    }

    //getters
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getStockCount() {
        return stockCount;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setStockCount(int stockCount){
        this.stockCount = stockCount;
    }

    //to String
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", stockCount=" + stockCount + "}";
    }



    //main method
    public static void main(String[] args){
        ProductTest p1 = new ProductTest("Laptop", 900);
        ProductTest p2 = p1;
        p2.setPrice(1100);
        System.out.println(p1.getPrice());
        System.out.println(p2.getPrice());


    }
//predicted to be 900 and 1100 but i got 1100 and 1100
    //because ProductTest p2 = p1; doesnt create the same object, it points to the same object as p1.
    // i would create a new object like this
//ProductTest p2 = new ProductTest(p1.getName(), p1.getPrice(), p1.getStockCount());

}