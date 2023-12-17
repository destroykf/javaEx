public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
        // Увеличиваем счетчик проданных цветов при создании букета
        for (Flower flower : flowers) {
            Flower.incrementSoldCount();
        }
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Flower flower : flowers) {
            totalPrice += flower.getPrice();
        }
        return totalPrice;
    }
}
