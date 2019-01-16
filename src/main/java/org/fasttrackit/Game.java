package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Vehicle> competitors = new ArrayList<>();


    public void addCompetitors(int competitorCount){
        for(int i = 0; i< competitorCount; i++){
            Vehicle vehicle = new Vehicle();
            //vehicle details will be populated when we learn to get user's input
            competitors.add(vehicle);

        }
    }
    public  void displayCompetitors(){
        System.out.println("Werlcom! Race is starting with: ");
        for (int i = 0; i <competitors.size(); i++){
            if(competitors != null){
                System.out.println(competitors.get(i).getName());

            }
        }
    }


    private Track[] tracks = new Track[10];


    public void addTrack(int index, Track track){
        tracks[0] = new Track("highway", 300);
        tracks[index] = track;
    }
    public void displayAvailableTracks(){

//        //clasic for loop
//        for(int i = 0; i<tracks.length; i++){
//            if(tracks[i] != null){
//                System.out.println(tracks[i].getName() +" " + tracks[i].getLength() + " km");
//            }
//            }
        //enhanced for loop (for-each)
        for (Track track : tracks){
            if(track != null){
                System.out.println(track.getName() + " " + track.getLength());
            }
        }
    }
}
