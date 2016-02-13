package week6.lesson11;


import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        Integer[] massive = new Integer[12];
        //ArrayList<Task1> tasks = convert(massive);
        //ArrayList<Task1> tasks = Task1.convert(massive);
        ArrayList<Integer> tasks = Task1.<Integer>convert(massive);
    }

    public static <Q> ArrayList<Q> convert(Q[] arr){
        ArrayList<Q> list = new ArrayList<Q>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        return list;
    }
}


