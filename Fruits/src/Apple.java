public class Apple extends Fruit {
    public Apple(double weight) {
        super(weight);
    }

    @Override
    public double calculateCost() {
        return 70.0 * weight;
    }
}
