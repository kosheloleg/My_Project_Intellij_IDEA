package week4.lesson8.HomeWork;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

//Task4. Запросить с консоли путь на папку. Создать в этой директории файл "dyrectory.txt" и заполнить этот файл (без использования рекурсии)
//        список всех файлов и папок этой папки, с вложеннной иерархией.
//        Если файл "dyrectory.txt" уже существует, то не перезаписывать этот файл, а добавить в него новую информацию.

public class Task4 {

    private static ArrayList<File> listWithFileNames = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        String dir;

        ArrayList<String> arrString = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите путь к файлу");

        dir = sc.nextLine();

        getListFiles(dir);

        File f = new File(dir+"dyrectory.txt");
        if (f.exists()){

            FileReader fr = new FileReader(dir+"dyrectory.txt");

            Scanner scFile = new Scanner(fr);

            while (scFile.hasNextLine()){

                arrString.add(scFile.nextLine());

            }



        }

        FileWriter fw = new FileWriter(dir+"dyrectory.txt");

        for (String s:arrString){

            fw.write(s+"\n");

        }


        for (File fl:listWithFileNames){

            if (!arrString.contains(fl.getAbsolutePath())){

                fw.write(""+fl.getAbsolutePath()+"\n");

            }

        }


        fw.close();



    }

    public static void getListFiles(String str) {
        File f = new File(str);

        File[] files = f.listFiles();

        for (File s : files) {
            //if (s.isFile()) {
            listWithFileNames.add(s);
            //} else
            if (s.isDirectory()) {
                getListFiles(s.getAbsolutePath());
            }
        }

    }





}
