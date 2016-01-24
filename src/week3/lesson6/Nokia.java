package week3.lesson6;

/**
 * Created by Koshel on 24.01.2016.
 */
public class Nokia extends Phone {

    public void printModel(){

        System.out.println("Я нокия");

    }


    public Nokia(String number,boolean camera,int sideSize){

        super(number,camera,sideSize);
    }

}
