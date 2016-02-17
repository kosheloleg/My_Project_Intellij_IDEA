package week4.lesson8.HomeWork;

import java.io.File;
import java.util.ArrayList;

public class Task2NoRekursia {


    public static void main(String[] args) {

        ArrayList<File> files = new ArrayList<File>();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите путь к файлу");
//
//        String koren = sc.nextLine();

        File file = new File("c:\\1");

        File[] listFiles = file.listFiles();



        for (int i = 0; i < listFiles.length; i++) {

            if (listFiles[i].isDirectory()) {

                files.add(listFiles[i]);

                File[] arr = listFiles[i].listFiles();

                for (int j = 0; j < arr.length; j++) {


                    if (arr[j].isDirectory()) {

                        files.add(arr[j]);

                    }


                }
            }

        }


        System.out.println(files);
    }



}
