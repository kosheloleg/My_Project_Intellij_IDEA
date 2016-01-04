package OOP;

import java.util.Scanner;

/**
 * Created by Oleg on 03.01.2016.
 */
public class MainBus {

    int countHuman;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Bus bus = new Bus("Bus",50,80);

        while (true){

            if (sc.hasNextInt()){

                bus.addHuman(sc.nextInt());
                System.out.println(bus);
            } else break;

        }





    }




}
