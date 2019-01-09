package org.fasttrackit;

public class Vehicle {
    public static int applicationTotalNumberOfVehicle;
    private String name;
    private String color;
    private double mileage;
    private long totalKm;



    public double accelerate (double speed, double durationInHour){
        System.out.println(name + " accelerated with " + speed + " km/h " + durationInHour + " hour. ");
            double distnace = speed * durationInHour;
        System.out.println("Traveled distance: " + distnace + " KM/H");
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
