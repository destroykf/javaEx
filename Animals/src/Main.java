public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Buddy"),
                new Cat("Whiskers"),
                new Bear("Baloo")
        };

        Veterinarian vet = new Veterinarian();

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }

        System.out.println("\nMaking noise and eating:");

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
            System.out.println();  // Add a new line for better readability
        }
    }
}
