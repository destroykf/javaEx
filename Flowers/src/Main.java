public class Main {
    public static void main(String[] args) {
        // Создаем цветы
        Flower rose = new Rose("Голландия", 5, 2.5);
        Flower carnation = new Carnation("Франция", 7, 3.0);
        Flower tulip = new Tulip("Голландия", 4, 2.0);

        // Создаем букеты
        Bouquet bouquet1 = new Bouquet(new Flower[]{rose, carnation});
        Bouquet bouquet2 = new Bouquet(new Flower[]{rose, tulip});
        Bouquet bouquet3 = new Bouquet(new Flower[]{carnation, tulip, rose});

        // Выводим стоимость букетов
        System.out.println("Стоимость букета 1: $" + bouquet1.calculateTotalPrice());
        System.out.println("Стоимость букета 2: $" + bouquet2.calculateTotalPrice());
        System.out.println("Стоимость букета 3: $" + bouquet3.calculateTotalPrice());

        // Выводим количество проданных цветов
        System.out.println("\nКоличество проданных цветов: " + Flower.getSoldCount());
    }
}
