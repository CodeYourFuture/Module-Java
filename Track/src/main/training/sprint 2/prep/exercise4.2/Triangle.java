class Triangle extends Polygon {
    public Triangle(int numberOfSides) {
        super(numberOfSides);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3);
        triangle.describe();
    }
}