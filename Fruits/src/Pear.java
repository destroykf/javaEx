public class Pear extends Fruit {
    public Pear(double weight) {
        super(weight);
    }

    @Override
    public double calculateCost() {
        return 85.0 * weight;
    }
}
