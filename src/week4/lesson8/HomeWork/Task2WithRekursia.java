package week4.lesson8.HomeWork;

import java.io.File;
import java.util.ArrayList;

public class Task2WithRekursia {

    private static ArrayList<File> files = new ArrayList<File>();

    public static void main(String[] args) {

        getAllDirectories("C:\\1");

        System.out.println(files);

    }

    public static void getAllDirectories(String dir){

        File f = new File(dir);

        File[] listFile = f.listFiles();

        for (File ff:listFile){

            files.add(ff);

            if (ff.isDirectory()){

                getAllDirectories(ff.getAbsolutePath());

            }



        }




    }





}
