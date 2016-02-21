package week7.lesson14;

import week7.lesson13.Car;
import week7.lesson13.Engine;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k=0;

        System.out.println("Введите число");

        if (sc.hasNextInt()){

           k = sc.nextInt();

        }

        for (int i=0;i<k;i++){

            try {

                Car car = new Car(i+1,"322"+(int)(i+1),new Engine("43"+(int)(i+1)));
                // запись
                FileOutputStream fos = new FileOutputStream("c:\\test\\"+(int)(i+1)+".out");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                try {
                    oos.writeObject(car);
                } finally {
                    oos.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }


    }



}
