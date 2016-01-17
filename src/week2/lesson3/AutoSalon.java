package week2.lesson3;

import week1.lesson2.*;

import java.util.ArrayList;

/**
 * Created by Koshel on 17.01.2016.
 */
public class AutoSalon {

     private static ArrayList<week1.lesson2.Car> cars = new ArrayList<week1.lesson2.Car>();
     private static ArrayList<Track> tracks = new ArrayList<Track>();

     private String[] menuList = new String[12];


    public void fillMenueList(){

        menuList[0] = "addCar";
        menuList[1] = "addTrack";
        menuList[2] = "setTrackToCar";
        menuList[3] = "unSetTrack";
        menuList[4] = "showListCars";
        menuList[5] = "showListTracks";
        menuList[6] = "showCarsWithTracks";
        menuList[7] = "start";
        menuList[8] = "move";
        menuList[9] = "stop";
        menuList[10] = "showFullInfo";
        menuList[11] = "quit";

    }

    public static void addCar(week1.lesson2.Car car){

        cars.add(car);

    }

    public static void addTrack(Track track){

        tracks.add(track);

    }


}
