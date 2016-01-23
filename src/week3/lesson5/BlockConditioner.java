package week3.lesson5;

import java.util.ArrayList;

/**
 * Created by Koshel on 23.01.2016.
 */
public class BlockConditioner {

    ArrayList<Conditioner> conditioners;

    public BlockConditioner(int count){

        for (int i=0;i<count;i++){

            conditioners.add(new Conditioner(i+1));

        }


    }


    public BlockConditioner(){

        this(0);
    }



}
