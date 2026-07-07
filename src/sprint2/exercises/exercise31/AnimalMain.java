abstract class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public abstract void perform();
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void perform() {
        System.out.println(getName() + " is barking!");
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void perform() {
        System.out.println(getName() + " says Meow!");
    }
}
class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }
    @Override
    public void perform() {
        System.out.println(getName() + " says Squawk Squawk Squawk!");
    }
}
class AnimalShow {
    public void perform(Animal animal) {
        animal.perform();
    }
}
public class AnimalMain {
    public static void main(String[] args) {
        AnimalShow show = new AnimalShow();
        Animal dog = new Dog("The Dog");
        Animal cat = new Cat("My Cat");
        Animal parrot = new Parrot("Pari");
        show.perform(dog);
        show.perform(cat);
        show.perform(parrot);
    }
}