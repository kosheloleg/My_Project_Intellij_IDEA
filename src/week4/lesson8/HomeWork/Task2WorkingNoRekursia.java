package week4.lesson8.HomeWork;

import java.io.File;
import java.util.ArrayList;

public class Task2WorkingNoRekursia {


    public static void main(String[] args) {

        ArrayList<File> files = new ArrayList<File>();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите путь к файлу");
//
//        String koren = sc.nextLine();

        File file = new File("c:\\1");

        File[] listFiles = file.listFiles();

        for (File dir : listFiles) {

            if (dir.isDirectory()) {

                files.add(dir);
            }

        }

        for (int i = 0; i < files.size(); i++) {

            File[] arr = files.get(i).listFiles();

            for (int j = 0; j < arr.length; j++) {


                if (arr[j].isDirectory()) {

                    files.add(arr[j]);

                }


            }

        }



        System.out.println(files);
    }



}
//
//    ////////////////////////Иерархия папок
//    ArrayList<File> files =
//            files.add(dir); \\new File
//
//        for (int i=0; files.size;i++){
//
//        File[] arr = files.get(i).listFiles;
//
//        for (int j=0;j<arr...;j++){
//
//        if (isDirectiry)
//
//        files.add(arr[j])
//
//        }
//        }
//        }
