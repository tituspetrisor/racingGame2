package org.fasttrackit;

import org.fasttrackit.cheater.CheatingCar;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        //declaring variable and instantiating a car object
        // this is also called initializing a variable
        Car firstCompetitor = new Car(new Engine());
        firstCompetitor.setName("Dacia");
        firstCompetitor.setColor("black");
        firstCompetitor.setMileage(5);
        firstCompetitor.setMileage(9.5);
        firstCompetitor.running = false;
//local varibles are variables declared inside a methode
//        they don'r receive default value


        Engine firstEngine = new Engine();
        firstEngine.manufacturer = "Renault";
        System.out.println(firstEngine);


//sout print the message to the console
        System.out.println(firstEngine.manufacturer);


        firstCompetitor.engine = firstEngine;
        firstCompetitor.engine.manufacturer = "BMW";
//        firstCompetitor = null; //golire variabile

        System.out.println(firstEngine.manufacturer);
//        System.out.println(firstEngine.manufacturer);
//        Engine testEngine;

        firstCompetitor.accelerate(100, 30);
        double travelDistance = firstCompetitor.accelerate(10, 30);
        Vehicle vehicle1 = new Vehicle();
        Vehicle.applicationTotalNumberOfVehicle = 1;
        System.out.println("Total from vehicle 1: " + Vehicle.applicationTotalNumberOfVehicle);
        // that it is true!!!!!


        Vehicle vehicle2 = new Vehicle();
        vehicle2.applicationTotalNumberOfVehicle = 2;
        System.out.println("Total from vehicle 2: " + vehicle2.applicationTotalNumberOfVehicle);


        System.out.println("Total from vehicle 2: " + vehicle2.applicationTotalNumberOfVehicle);
        System.out.println("Total from vehicle 1: " + vehicle1.applicationTotalNumberOfVehicle);


        CheatingCar firstCheating = new CheatingCar();
        firstCheating.accelerate(20, 1);

        //polymorfism
        Vehicle cheatingCar = new CheatingCar();
        cheatingCar.accelerate(20, 2);
        //type casting
        ((CheatingCar) cheatingCar).test();

        //modulo operator
        System.out.println(4 % 2);
        System.out.println(4 % 3);


        Game game = new Game();
        game.start();


    }
}


