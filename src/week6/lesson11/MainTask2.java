package week6.lesson11;


import java.util.ArrayList;

public class MainTask2 {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("тыры пыры");

        Task2 t2 = new Task2();
        t2.set(arr);

        Task2 t= t2.get(0);

        System.out.println(t);

    }


}
