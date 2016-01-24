package week3.lesson5;

import java.util.Scanner;

/**
 * Created by Koshel on 23.01.2016.
 */
public class MainConditioners {

    private static String[] operationNames = {"1. Отобразить состояние всех кондиционеров","2. Включить кондиционер с индексом..."
            ,"3. Выключить кондиционер с индексом...","Установить температуру для кондиционера с индексом..."};

    public static void main(String[] args) {

        int index;

        BlockConditioner bc = new BlockConditioner(5);

        Scanner scan = new Scanner(System.in);
        boolean runWhile = true;
        while(runWhile){
            printMenu();
            System.out.println("Выберите операцию:");
            int k = scan.nextInt();
            switch (k){
                case 1: bc.showStatusAllConditioners();break;
                case 2:

                    System.out.println("Введите индекс");
                    index = scan.nextInt();
                    bc.turnONConditioner(index);break;

                case 3:
                    System.out.println("Введите индекс");
                    index = scan.nextInt();

                    bc.turnOFFConditioner(index);break;


                case 4:

                    System.out.println("Введите индекс");
                    index = scan.nextInt();

                    System.out.println("Введите температуру");
                    int temp = scan.nextInt();


                    bc.setTemperature(index,temp);break;
                case 5: runWhile = false;
            }
        }



    }

    public static void printMenu(){
        for(String m:operationNames) System.out.println(m);
    }

}
