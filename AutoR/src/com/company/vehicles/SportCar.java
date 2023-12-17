package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private int speed;

    public SportCar(String marka, String carClass, Driver driver, Engine engine, int speed) {
        super(marka, carClass, driver, engine);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}