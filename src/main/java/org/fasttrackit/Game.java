package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private List<Vehicle> competitors = new ArrayList<>();

    public void start() throws Exception {
        addTrack(0, new Track("1-Highway", 300));
        addTrack(1, new Track("2-Seaside", 100));
        displayAvailableTracks();
        addCompetitors(2);
        displayCompetitors();
//        Track track = getTrackFromUser();
        int trackNumber = getTrackFromUser();
        Track track = tracks[trackNumber - 1];
        System.out.println("Choose track: " + track.getName());

        boolean noWinnerYet = true;
        int competitorsWithoutFuel = 0;


        while (noWinnerYet && competitorsWithoutFuel < competitors.size()) {
            for (Vehicle vehicle : competitors) {
                double speed = getVehicleAccelerationFromUser();
                vehicle.accelerate(speed);

                    if(vehicle.getFuleLevel() <= 0){
                        competitorsWithoutFuel++;
                    }
                if (vehicle.getTotalKm() >= track.getLength()) ;
                noWinnerYet = false;
                System.out.println("The winner is: " + vehicle.getName());
                break;
            }
        }


    }

    public int getTrackFromUser() throws Exception {
        System.out.println("Please choose your track: ");
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException exception) {
//            throw  new Exception("Expected an integer number");
            System.out.println("Expected an integer number");
            return getTrackFromUser();
        }
    }

//        public Track getTrackFromUser() {
//            System.out.println("Please choose your track: ");
//            Scanner scanner = new Scanner(System.in);
//            int chooseTrackNumber = scanner.nextInt();
//            if (chooseTrackNumber == 1) {
//                System.out.println("Track is: " + tracks[0]);
//                return tracks[chooseTrackNumber-1];
//            } else if (chooseTrackNumber == 2) {
//                System.out.println("Track is: " + tracks[1]);
//                return tracks[chooseTrackNumber-1];
//            } else
//            return null;
//        }


    public void addCompetitors(int competitorCount) {
        for (int i = 0; i < competitorCount; i++) {
            Vehicle vehicle = new Vehicle();
            String name = getVehicleNameFromUser();
            vehicle.setName(name);

            //vehicle details will be populated when we learn to get user's input
            competitors.add(vehicle);

            //se da un nr random
            double mileage = ThreadLocalRandom.current().nextDouble(5, 15);
            vehicle.setMileage(mileage);
            System.out.println("Your mileage is: " + mileage);

        }
    }

    private double getVehicleAccelerationFromUser() {
        System.out.println("Please eneter accelerate speed: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }


    private String getVehicleNameFromUser() {
        System.out.println("Please enter vehicle name: ");
        // This scanner is for insert something in terminal
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your vehicle name is " + name);

        return name;

    }

    public void displayCompetitors() {
        System.out.println("Werlcom! Race is starting with: ");
        for (int i = 0; i < competitors.size(); i++) {
            if (competitors != null) {
                System.out.println(competitors.get(i).getName());

            }
        }
    }


    private Track[] tracks = new Track[10];


    public void addTrack(int index, Track track) {
        tracks[0] = new Track("highway", 300);
        tracks[index] = track;
    }

    public void displayAvailableTracks() {

//        //clasic for loop
//        for(int i = 0; i<tracks.length; i++){
//            if(tracks[i] != null){
//                System.out.println(tracks[i].getName() +" " + tracks[i].getLength() + " km");
//            }
//            }
        //enhanced for loop (for-each)
        for (Track track : tracks) {
            if (track != null) {
                System.out.println(track.getName() + " " + track.getLength());
            }
        }
    }
}
