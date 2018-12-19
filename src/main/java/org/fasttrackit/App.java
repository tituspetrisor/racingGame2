package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        //declaring variable and instantiating a car object
        // this is also called initializing a variable
        Car firstCompetitor= new Car(new Engine());
        firstCompetitor.name = "Dacia";
        firstCompetitor.color = "black";
        firstCompetitor.doorCount = 5;
        firstCompetitor.mileage = 9.5;
        firstCompetitor.running = false;
//local varibles are variables declared inside a methode
//        they don'r receive default value


        Engine firstEngine = new Engine();
        firstEngine.manufacturer = "Renault";


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

    }
    }


