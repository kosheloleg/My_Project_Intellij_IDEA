package week3.lesson6;

/**
 * Created by Koshel on 24.01.2016.
 */
public class Samsung extends Phone {

    public void printModel(){

        System.out.println("Я самсунг");

    }

    public Samsung(String number,boolean camera,int sideSize){

        super(number,camera,sideSize);
    }


}
