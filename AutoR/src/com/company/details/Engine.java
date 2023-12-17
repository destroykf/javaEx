package com.company.details;

public class Engine {
    private int power;
    private String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Двигатель: \n" +
                "ЛС: " + power +
                "\nПроизводитель: '" + company;
    }
}
