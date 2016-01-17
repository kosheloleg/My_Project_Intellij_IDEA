package week2.lesson3;


public class MyInteger {

    private int value;

    public  MyInteger(int value){

        this.value = value;

    }

    public MyInteger(){

        this(0);

    }

    public MyInteger plus(MyInteger b){

         int sum = this.getValue()+b.getValue();
         return new MyInteger(sum);

    }

    public int getValue(){

        return value;

    }

}
