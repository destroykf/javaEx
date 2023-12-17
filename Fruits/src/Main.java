public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple(2.5);
        Pear pear = new Pear(1.7);
        Apricot apricot = new Apricot(1.0);

        double totalCost = apple.calculateCost() + pear.calculateCost() + apricot.calculateCost();

        System.out.println("Общая стоимость проданных фруктов: " + totalCost);

        double totalAppleCost = apple.calculateCost();
        double totalPearCost = pear.calculateCost();
        double totalApricotCost = apricot.calculateCost();

        System.out.println("\nОбщая стоимость яблок: " + totalAppleCost);
        System.out.println("Общая стоимость груш: " + totalPearCost);
        System.out.println("Общая стоимость абрикос: " + totalApricotCost);
    }
}
