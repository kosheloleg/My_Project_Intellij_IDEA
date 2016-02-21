package week7.lesson14;

import week7.lesson13.Car;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Task3 {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        String dir;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите путь к папке");


        dir = sc.nextLine();

        File f = new File(dir);

        File[] files = f.listFiles();


        for (File fff : files) {


            try {

                // чтение
                Car car;
                FileInputStream fis = new FileInputStream(fff.getAbsoluteFile());
                ObjectInputStream oin = new ObjectInputStream(fis);
                try {
                    car = (Car) oin.readObject();
                    cars.add(car);

                } finally {
                    oin.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }

       for (Car c:cars){

           System.out.println(c);

       }

    }


}



