import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Dog dog = new Dog("Rex", 5, true, 50, 25, "something", "anotherSomething");
        animals.add(dog);
        Mammal mammal = new Mammal("Barsik", 5, true, 50, 25, "something");
        animals.add(mammal);

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}