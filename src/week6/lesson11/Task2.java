package week6.lesson11;

//Task 2. Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
// Реализовать метод, который возвращает любой элемент массива по индексу.

import java.util.ArrayList;

public class Task2<Q> {

    public static ArrayList<Task2> arr;

    public  <Q> Task2 get(int index){

        return arr.get(index);

    }

    public void  set(ArrayList arr){

        this.arr = arr;
    }

}
