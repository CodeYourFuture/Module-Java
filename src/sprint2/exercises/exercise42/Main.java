package sprint2.exercises.exercise42;

class Configuration {

    public static final int MAX_USERS = 100;
    private final String systemName;
    public Configuration(String systemName) {
        this.systemName = systemName;
    }
}

class Polygon {
    private final int numberOfSides;
    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
    public int getNumberOfSides() {
        return numberOfSides;
    }
    public final void describe() {
        System.out.println("I am a polygon with " + numberOfSides + " sides");
    }
}
class Triangle extends Polygon {
    public Triangle() {
        super(3);
    }
}
public class Main {
    public static void main(String[] args) {
        Configuration config = new Configuration("Server");
        System.out.println(Configuration.MAX_USERS);
        Polygon polygon = new Polygon(5);
        polygon.describe();
        Triangle triangle = new Triangle();
        triangle.describe();
    }
}