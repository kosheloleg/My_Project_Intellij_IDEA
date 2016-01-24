package week3.lesson5;

import java.util.ArrayList;


public class BlockConditioner {

   ArrayList<Conditioner> conditioners = new ArrayList<Conditioner>();


    public BlockConditioner(int count){

        for (int i=1;i<=count;i++){

            conditioners.add(new Conditioner(i));

        }

    }


    public void turnONConditioner(int index){

        turnConditioner(index,true);

    }

    public void turnOFFConditioner(int index){

        turnConditioner(index,false);

    }


    public void setTemperature(int index,int temperature){

        Conditioner c = getConditioner(index);

        if (c!=null) c.setTemperature(temperature);
        else System.out.println("С таким индексом кондиционера нет");


    }




    private void turnConditioner(int index,boolean on){

        Conditioner c = getConditioner(index);

        if (c!=null){

            if (on) c.turnOn();
            else c.turnOff();

        } else System.out.println("Кондиционера с таким индексом нет");


    }


    public void showStatusAllConditioners(){


        for (Conditioner cond: conditioners){

            System.out.println("У кондиционера №"+cond.getIndex()+"   температура "+cond.getTemperature()+"  и выключен "+cond.getTurn());

        }


    }

    public Conditioner getConditioner(int index){

        for (Conditioner c: conditioners){

            if (c.getIndex()==index){

                return c;

            }


        }

        return null;

    }

}
