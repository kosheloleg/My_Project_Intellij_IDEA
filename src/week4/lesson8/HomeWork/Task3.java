package week4.lesson8.HomeWork;

//Task3.
//        1) Написать метод, который в качестве параметра принимает имя файла.
//        Метод возвращает двухмерный массив (String): имена переменных и значение.
//
//        В файле набор переменных указаны так:
//        ;v=[156],ghg,hg;m=[12],tytuyr894848;vector=[qwe];
//        Существуют правила форматирования текста в файле:
//        - имя переменной всегда стоит между симвоами ';' и '='
//        - значение переменной всегда идет после знака '=' и заключено в квадратные кавычки
//        - все что идет после квадратных кавычек до ';' являются служебными символами и в данной задаче они игнорируются

import java.io.FileReader;
import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) throws Exception {

        String[][] arr = getVariablesAndValue("Task3");

    }

    public static String[][] getVariablesAndValue(String fileName) throws Exception{

        String[][] strArr = new String[1][1];


        FileReader fr = new FileReader(fileName);

        Scanner sc = new Scanner(fr);

        String s="";

        while (sc.hasNextLine()){

            s = sc.nextLine();

            String[] parts = s.split(";");


            for (int i=0;i<parts.length;i++){

                System.out.println(parts[i]);



            }



        }


            return strArr;

    }






}
