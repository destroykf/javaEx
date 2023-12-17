public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " says Woof!");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats bones.");
    }

    @Override
    public String getDescription() {
        return "I am a dog named " + name;
    }
}
