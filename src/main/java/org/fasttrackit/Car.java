package org.fasttrackit;

public class Car extends AutoVehicle {
    //inheritance or "is-a" relationship
//    instance variables(declared as properties of a class
//    they receive default values (null for objects, 0 for numbers, false for booleans)

    int doorCount;

    public Car(Engine engine) {
        super(engine);

    }
}