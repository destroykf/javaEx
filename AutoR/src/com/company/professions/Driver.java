package com.company.professions;

public class Driver extends Person {
    private int experience;

    public Driver(String fullName, int age, int experience) {
        super(fullName, age);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Водитель: \n" +
                "ФИО: '" + fullName + '\'' +
                "\nВозраст: " + age +
                "\nСтаж: " + experience;
    }
}
