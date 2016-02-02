package week4.lesson8.HomeWork;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

//Task4. Запросить с консоли путь на папку. Создать в этой директории файл "dyrectory.txt" и заполнить этот файл (без использования рекурсии)
//        список всех файлов и папок этой папки, с вложеннной иерархией.
//        Если файл "dyrectory.txt" уже существует, то не перезаписывать этот файл, а добавить в него новую информацию.

public class Task4 {

    public static void main(String[] args) throws Exception {

        String dir;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите путь к файлу");

        dir = sc.nextLine();


        FileWriter fw = new FileWriter(dir+"dyrectory.txt");

        File f = new File(dir);
        File[] files = f.listFiles();

        for (File fff:files){

            System.out.println(fff.getCanonicalFile());

            System.out.println();

            System.out.println(fff.getCanonicalPath());

        }



    }





}
