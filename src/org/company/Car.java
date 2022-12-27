package org.company;

//car name price year maxSpeed
public class Car {
    public String name;
    public double price;
    public int year;
    public int maxSpeed;

    public Car() {
    }

    public Car(String name, double price, int year, int maxSpeed) {
        this.name = name;
        this.price = price;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public double upTo100() {
        return 4.5;
    }

    public int countOfPassengers() {
        return 5;
    }

    public double averageFuelPer100km() {
        return 9.5;
    }

    @Override
    public String toString() {
        return "Car{" +
            "name='" + name + '\'' +
            ", price=" + price +
            ", year=" + year +
            ", maxSpeed=" + maxSpeed +
            '}';
    }
}
