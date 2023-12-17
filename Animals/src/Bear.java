public class Bear extends Animal {
    public Bear(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " says Roar!");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats berries and fish.");
    }

    @Override
    public String getDescription() {
        return "I am a bear named " + name;
    }
}
