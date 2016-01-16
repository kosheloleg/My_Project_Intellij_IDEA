package HomeWork_NewYear;

import java.util.Scanner;

/**
 * Created by Oleg on 03.01.2016.
 */
public class ConsoleMenu {

    private static String[] operationNames;

    public ConsoleMenu(String... operationNames){

        this.operationNames = operationNames;

    }



        public static void printMenu(){
            for(String m:operationNames) System.out.println( m );
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            boolean runWhile = true;
            while(runWhile){
                printMenu();
                int k = scan.nextInt();
                switch (k){
                    case 1:System.out.println("fucntion Прийти");break;
                    case 2:System.out.println("fucntion Уйти");break;
                    case 3:System.out.println("fucntion Зайти");break;
                    case 4:runWhile = false;
                }
            }
        }



}


