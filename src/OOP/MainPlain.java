package OOP;

import java.util.Scanner;

/**
 * Created by Oleg on 03.01.2016.
 */
public class MainPlain {

    public static void main(String[] args){

     Plain pl = new Plain("Самолет",3000);

        pl.up(2500);

        System.out.println(pl);

        pl.up(1000);

        System.out.println(pl);

        pl.down(1500);

        System.out.println(pl);

        pl.down(1500);


    }

}
