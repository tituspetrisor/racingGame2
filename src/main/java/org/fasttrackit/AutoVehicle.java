package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    Engine engine;
    boolean running;

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

    //overload
    public AutoVehicle() {
        this(new Engine());
        //constructor overloading
    }
}
