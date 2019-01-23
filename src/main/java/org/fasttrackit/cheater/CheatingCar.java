package org.fasttrackit.cheater;

import org.fasttrackit.AutoVehicle;
import org.fasttrackit.Vehicle;

public class CheatingCar extends Vehicle {
    @Override
    public double accelerate(double speed, double durationInHour) {
        System.out.println(getName() + " accelerated with " + speed + " km/h " + durationInHour + " hour. ");
        double distnace = 2 * speed * durationInHour;
        System.out.println("Traveled distance: " + distnace + " KM/H");
        return distnace;
    }

    //    @Override
//    public double accelerate (double speed, double durationInHour){
//        double cheatingSpeed = 2 * speed;
//        return super.accelerate(cheatingSpeed, durationInHour);
//
//    }
    //co-variant return type!!!!! - poate returna si din clasa copil
    // se da la examen
    @Override
    public AutoVehicle returnSomeVehicle() {
        return new AutoVehicle();
    }

    public void test() {
        System.out.println("test");
    }
}
