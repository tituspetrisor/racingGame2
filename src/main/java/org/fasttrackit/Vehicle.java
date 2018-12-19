package org.fasttrackit;

public class Vehicle {
    String name;
    String color;
    double mileage;
    long totalKm;

    public double accelerate (double speed, double durationInHour){
        System.out.println(name + " accelerated with " + speed + " km/h " + durationInHour + " minutes. ");
            double distnace = speed * durationInHour;
        System.out.println("Traveled distance: " + distnace + " KM/H");
            return distnace;
    }
}
