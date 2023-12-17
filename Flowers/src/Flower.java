public class Flower {
    private String countryOfOrigin;
    private int shelfLifeDays;
    private double price;
    private static int soldCount = 0; // Статическая переменная для подсчета проданных цветов

    public Flower(String countryOfOrigin, int shelfLifeDays, double price) {
        this.countryOfOrigin = countryOfOrigin;
        this.shelfLifeDays = shelfLifeDays;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public static int getSoldCount() {
        return soldCount;
    }

    public static void incrementSoldCount() {
        soldCount++;
    }

    @Override
    public String toString() {
        return "Цветок{" +
                "страна производитель='" + countryOfOrigin + '\'' +
                ", срок хранения=" + shelfLifeDays +
                ", цена=" + price +
                '}';
    }
}
