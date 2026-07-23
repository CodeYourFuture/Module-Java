class Polygon {
    private final int numberOfSides;

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public final void describe() {
        System.out.println("I am a polygon with " + getNumberOfSides() + " sides");
    }
}