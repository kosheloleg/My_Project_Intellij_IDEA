package week4.lesson7;

import java.util.ArrayList;
import java.util.Scanner;


public class MainClass {

    public static void main(String[] args) {

        ArrayList<AbstractHuman> arrHuman = new ArrayList<AbstractHuman>();
        ArrayList<AbstractTable> arrTable = new ArrayList<AbstractTable>();

        ArrayList<AbstractGlass> arrGlass = new ArrayList<AbstractGlass>();



        int i;
        int rand;

        //Создаем 4 человека разного пола

        for (i=0;i<4;i++){

            rand = (int)(Math.random()*10);

            if (rand>=5) arrHuman.add(new HumanWoman());

            else arrHuman.add(new HumanMan());
        }


        //Создаем 10 столов
        for (i=0;i<9;i++){

            arrTable.add(new Table());

        }

        //Создаем 10 стаканов
        for (i=0;i<9;i++){

            rand = (int)(Math.random()*10);

            if (rand>=5) arrGlass.add(new GlassCircle());

            else arrGlass.add(new GlassSquare());

        }

        //Люди наугад берут стаканы и говорят о себе информацию
        for (AbstractHuman human:arrHuman){

            rand = (int)(Math.random()*5+5);

            if (rand<arrGlass.size())
            human.takeGlass(arrGlass.get(rand));

            human.printAboutMe();
        }


        Scanner sc = new Scanner(System.in);

        for (AbstractHuman human:arrHuman) {

            System.out.println("Выберите стол 1-10");

            int numberTable = sc.nextInt();

            human.pourWaterOnTable(arrTable.get(numberTable));

        }

        for (AbstractTable table:arrTable){

            table.printAboutMe();

        }


    }

}
