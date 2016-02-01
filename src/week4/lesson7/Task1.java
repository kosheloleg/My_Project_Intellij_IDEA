package week4.lesson7;

import java.io.File;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите путь и расширение");

        String dir = sc.next();

        String ext = sc.next();

        File f = new File(dir);

        if (f.isDirectory()){

            File[] files = f.listFiles();


            for (File fl:files){

                if (fl.getName().indexOf("."+ext)!=-1){

                    System.out.println(fl.getName());

                }

            }


        } else System.out.println("Такой папки нет");


    }



}
