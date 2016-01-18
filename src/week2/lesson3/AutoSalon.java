package week2.lesson3;

import week1.lesson2.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Koshel on 17.01.2016.
 */
public class AutoSalon {

     private static ArrayList<week1.lesson2.Car> cars = new ArrayList<week1.lesson2.Car>();
     private static ArrayList<Track> tracks = new ArrayList<Track>();

     private static String[] menuList = new String[12];

    public AutoSalon(){



    }


    private static void fillMenuList(){

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

    private static void printMenuList(){

        fillMenuList();

        for (int i=0;i<menuList.length;i++){

            System.out.println(""+i+":  "+menuList[i]);

        }

    }

    public static void startMenuList() {

        printMenuList();
        System.out.println();
        System.out.println("Выберите действие");


        Scanner scan = new Scanner(System.in);

        boolean runWhile = true;
        while (runWhile) {

            int k = scan.nextInt();
            switch (k) {
                case 1:

                    System.out.println("Введите номер авто");

                    String numberCar = scan.next();

                    System.out.println("Введите цвет авто");

                    String colorCar = scan.next();

                    addCar(new week1.lesson2.Car(numberCar, colorCar));

                    break;

                case 11:
                    runWhile = false;
            }
        }
    }

    public static void addCar(week1.lesson2.Car car){

        cars.add(car);

        System.out.println("Добавлен новый автомобиль с номером "+car.getNumber()+"  и цветом "+car.getColor());


    }

    public static void addTrack(Track track){

        tracks.add(track);

    }


}
