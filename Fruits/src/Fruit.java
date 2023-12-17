public abstract class Fruit {
    protected double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    final public void printManufacturerInfo()
    {
        System.out.println("Сделано в России");
    }

    public abstract double calculateCost();
}
