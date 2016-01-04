package OOP;

import java.util.Scanner;

/**
 * Created by Oleg on 03.01.2016.
 */
public class MainVahtersha {

    public static void main(String[] args){

        ConsoleMenu cm = new ConsoleMenu("Впустить друга","Впустить чужого","Выпустить друга","Выпустить чужого");

        Vahtersha vaht = new Vahtersha();


        vaht.printInfo();



        Scanner scan = new Scanner(System.in);
        boolean runWhile = true;
        while(runWhile) {
            //cm.printMenu();
            int k = scan.nextInt();
            switch (k) {
                case 1:
                    System.out.println("Впустить друга");
                    vaht.addFriends(1);
                    vaht.printInfo();
                    break;
                case 2:
                    System.out.println("Выпустить друга");
                    vaht.removeFriends(1);
                    vaht.printInfo();
                    break;
                case 3:
                    System.out.println("Впустить чужого");
                    vaht.addOwners(1);
                    vaht.printInfo();
                    break;
                case 4:
                    System.out.println("Выпустить чужого");
                    vaht.removeOwners(1);
                    vaht.printInfo();
                    break;
                case 5:
                    runWhile = false;
            }
        }
    }






}
