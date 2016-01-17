package week2.lesson3;

/**
 * Created by Koshel on 17.01.2016.
 */
public class MainMyInteger {

    public static void main(String[] args){


            MyInteger a = new MyInteger(10);
            MyInteger b = new MyInteger(20);
            MyInteger c = a.plus( b );
            System.out.println(a.getValue() + " + " + b.getValue() + " = " + c.getValue());



    }
}
