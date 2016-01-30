package week4.lesson7;

import java.util.ArrayList;


public class MainClass {

    public static void main(String[] args) {

        ArrayList arrHuman = new ArrayList();
        ArrayList arrTable = new ArrayList();

        int i;

        for (i=0;i<4;i++){

            int rand = (int)(Math.random()*10);

            if (rand>=5) arrHuman.add(new HumanWoman());

            else arrHuman.add(new HumanMan());
        }

        for (i=0;i<9;i++){

            arrTable.add(new Table());

        }


    }

}
