package sprint2.exercises.exercise41;
class Planet {
    private String name;
    private static int planetCount = 0;

    public Planet(String name) {
        this.name = name;
        planetCount++;
    }
    public static int getPlanetCount() {
        return planetCount;
    }
}
public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth");
        System.out.println(Planet.getPlanetCount());

        Planet mars = new Planet("Mars");
        System.out.println(Planet.getPlanetCount());

        Planet jupiter = new Planet("Jupiter");
        System.out.println(Planet.getPlanetCount());
    }
}