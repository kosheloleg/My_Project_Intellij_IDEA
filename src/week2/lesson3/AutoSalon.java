package week2.lesson3;

import week1.lesson2.*;
import week1.lesson2.Car;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Koshel on 17.01.2016.
 */
public class AutoSalon {

    private ArrayList<week1.lesson2.Car> cars = new ArrayList<week1.lesson2.Car>();
    private ArrayList<Track> tracks = new ArrayList<Track>();

    private String[] menuList = new String[12];


    private void fillMenuList() {

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

    private void printMenuList() {

        fillMenuList();

        for (int i = 0; i < menuList.length; i++) {

            System.out.println("" + i + ":  " + menuList[i]);

        }

    }

    public void start() {

        String numberTrack;
        String numberCar;

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

                    numberCar = scan.next();

                    System.out.println("Введите цвет авто");

                    String colorCar = scan.next();

                    addCar(new week1.lesson2.Car(numberCar, colorCar));

                    break;

                case 2:

                    System.out.println("Введите номер прицепа");

                    numberTrack = scan.next();

                    addTrack(new Track(numberTrack));

                    break;

                case 3:

                    System.out.println("Введите номер авто");

                    numberCar = scan.next();

                    System.out.println("Введите номер прицепа");

                    numberTrack = scan.next();

                    break;

                case 11:
                    runWhile = false;
            }
        }
    }

    private void addCar(week1.lesson2.Car car) {

        if (!isCarInAutosalon(car.getNumber())) {

            cars.add(car);

            System.out.println("Добавлен новый автомобиль с номером " + car.getNumber() + "  и цветом " + car.getColor());
        } else System.out.println("Авто с таким номером уже есть");
    }

    private boolean isTrackInAutosalon(String numberTrack) {

        return getCar(numberTrack)!=null;

    }

    private boolean isCarInAutosalon(String numberCar) {

        return getCar(numberCar)!=null;

    }

    private week1.lesson2.Car getCar(String numberCar){

        for (week1.lesson2.Car c:cars){

            if (c.getNumber().equals(numberCar)){

                return c;

            }


        }

        return null;
    }

    private Track getTrack(String numberTrack){

        for (Track t:tracks){

            if (t.getNumber().equals(numberTrack)){

                return t;

            }


        }

        return null;
    }

    private void addTrack(Track track) {

        if (!isTrackInAutosalon(track.getNumber())) {

            tracks.add(track);

            System.out.println("Добавлен новый прицеп с номером " + track.getNumber() + "  и состояние " + track.getStatus());
        } else System.out.println("Прицеп с таким номером уже есть");

    }

    private void connectTrackToCar(String carNumber,String trackNumber){

        week1.lesson2.Car car = getCar(carNumber);
        Track track  = getTrack(trackNumber);


    }




}
