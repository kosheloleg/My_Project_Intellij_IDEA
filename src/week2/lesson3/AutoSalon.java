package week2.lesson3;

import week1.lesson2.*;
import week1.lesson2.Car;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Koshel on 17.01.2016.
 */
public class AutoSalon {

    private static ArrayList<week1.lesson2.Car> cars = new ArrayList<week1.lesson2.Car>();
    private static ArrayList<Track> tracks = new ArrayList<Track>();

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

            System.out.println("" + (i+1) + ":  " + menuList[i]);

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

            if (k>12 &k<=0){

                System.out.println("Такой номер не походит");
                return;
            }

            switch (k) {
                case 1:

                    System.out.println("Введите номер авто");

                    numberCar = scan.next();

                    addCar(new week1.lesson2.Car(numberCar));

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

                    connectTrackToCar(numberCar,numberTrack);

                    break;

                case 4:

                    System.out.println("Введите номер авто");

                    numberCar = scan.next();

                    disconnectTrackToCar(numberCar);

                    break;

                case 5:

                    showCarList();

                    break;

                case 6:

                    showTrackList();

                    break;


                case 7:

                    showCarsWithTrack();

                    break;



                case 8:

                    System.out.println("Введите номер авто");

                    numberCar = scan.next();

                    carStart(numberCar);

                    break;

                case 9:

                    System.out.println("Введите номер авто");

                    numberCar = scan.next();

                    carMove(numberCar);

                    break;

                case 10:

                    System.out.println("Введите номер авто");

                    numberCar = scan.next();

                    carStop(numberCar);

                    break;

                case 11:

                    showCarsAndTrack();

                    break;


                case 12:
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

        return getTrack(numberTrack)!=null;

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

        if (car != null){

            if (track!=null){

                car.setTrack(track);

            } else System.out.println("Прицепа с таким номером нет");

        } else System.out.println("Автомобиля с таким номером нет");


    }

    private void disconnectTrackToCar(String numberCar){

        week1.lesson2.Car car = getCar(numberCar);

        car.unSetTrack();

    }

    public static void showCarList(){

        for (week1.lesson2.Car car:cars){

            System.out.println(car);

        }

    }

    public static void showTrackList(){

        for (Track t: tracks){

            System.out.println(t);

        }

    }

    public static void showCarsWithTrack(){

        for (week1.lesson2.Car car:cars){

            if (car.getTrack()!=null){

                System.out.println(car);

            }

        }


    }

    public void carStart(String numberCar){

        week1.lesson2.Car car = getCar(numberCar);

        if (car!=null){

            car.start();

        } else System.out.println("Машина с таким номером не найжена");




    }

    public void carMove(String numberCar){

        week1.lesson2.Car car = getCar(numberCar);

        if (car!=null){

            car.move(30);


            Track track = car.getTrack();

            if (track!=null){

                track.roll();

            }

        } else System.out.println("Машина с таким номером не найжена");

    }

    public void carStop(String numberCar) {

        week1.lesson2.Car car = getCar(numberCar);

        if (car != null) {

            car.stop();

            Track track = car.getTrack();

            if (track != null) {

                track.stop();

            } else { System.out.println("Прицепа нет");}

        } else System.out.println("Машина с таким номером не найжена");

    }

    public void showCarsAndTrack(){

        System.out.println("Все автомобили в автосалоне:");

        for (Car c:cars){

            System.out.println(c);

        }

        System.out.println("");

        System.out.println("Все прицепы в автосалоне прикрепленные к машине:");

        for (Track t:tracks){

            if (t.getCar()!=null){

            System.out.println(t);
            }

        }

    }

}
