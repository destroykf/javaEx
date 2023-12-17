package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String marka;
    private String carClass;
    private Driver driver;
    private Engine engine;

    public Car(String marka, String carClass, Driver driver, Engine engine) {
        this.marka = marka;
        this.carClass = carClass;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "\n\nАвто: \n" +
                "Марка: '" + marka + '\'' +
                "\nКласс авто: '" + carClass + '\'' +
                "\n\n" + driver +
                "\n\n" + engine;
    }
}
