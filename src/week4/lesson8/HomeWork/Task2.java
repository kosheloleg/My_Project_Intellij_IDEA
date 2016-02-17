package week4.lesson8.HomeWork;

//Task2. Запросить путь на папку с консоли, получить список всех папок заданной папки с учетом иерархии.
//        Например, поиск в папке "book" даст 5 элементов:
//        -book
//        --directory1
//        ----file1
//        ----file2
//        --directory2
//        ----directory3
//        ------directory4
//        --------directory5
//        ----------file3

import java.io.File;
import java.util.ArrayList;

public class Task2 {

    private static ArrayList<File> listWithFileNames = new ArrayList<>();

    public static void main(String[] args) {
        getListFiles("C:\\1\\");

        for (File fil : listWithFileNames) {
            System.out.println(fil.getAbsolutePath());
        }
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
