public class Apricot extends Fruit {
    public Apricot(double weight) {
        super(weight);
    }

    @Override
    public double calculateCost() {
        return 120.0 * weight;
    }
}
