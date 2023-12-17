public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " says Meow!");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats fish.");
    }

    @Override
    public String getDescription() {
        return "I am a cat named " + name;
    }
}
