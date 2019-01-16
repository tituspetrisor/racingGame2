package org.fasttrackit;

public class Vehicle {
    public static int applicationTotalNumberOfVehicle;
    private String name;
    private String color;
    private double mileage;
    private long totalKm;
    private double fuelLevel = 70;



    public double accelerate (double speed, double durationInHour){
        System.out.println(name + " accelerated with " + speed + " km/h " + durationInHour + " hour. ");
            double distnace = speed * durationInHour;
        System.out.println("Traveled distance: " + distnace + " KM/H");
        double spentFuel = distnace * mileage / 100;
        System.out.println("Remaining fuel: " + fuelLevel);
        fuelLevel -= spentFuel;
//        fuelLevel = fuelLevel - spentFuel;
        totalKm += distnace;
        System.out.println("Total travel distance" + totalKm);

            return distnace;

    }
    // method overloading
    public double accelerate (double speed){
        return accelerate( speed, 1);

    }

    //metoda folosita pentru demonstrarea co-variant return type
    public Vehicle returnSomeVehicle(){
        return this;
    }

    public double getFuleLevel() {
        return fuelLevel;
    }

    public void setFuleLevel(double fuleLevel) {
        this.fuelLevel = fuleLevel;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public long getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(long totalKm) {
        this.totalKm = totalKm;
    }
}
