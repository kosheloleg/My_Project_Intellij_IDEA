package week6.lesson11;

//Task 2. Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
// Реализовать метод, который возвращает любой элемент массива по индексу.

public class Task2 {

    public static void main(String[] args) {


        Integer[] massStr = new Integer[2];
        massStr[0] = 999;
        massStr[1] = 888;


        AnyVector<Integer> m = new AnyVector<Integer>(massStr);

        Integer str = m.get(1);

        System.out.println(str);

    }

}

class AnyVector<T> {

    AnyVector(T[] m){

        mass = m;

    }

    private T[] mass;

    public void set(T[] mass) {

        this.mass = mass;

    }

    public T get(int k){

        return mass[k];

    }




}
