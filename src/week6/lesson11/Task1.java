package week6.lesson11;


import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        Task1[] massive = new Task1[12];
        //ArrayList<Task1> tasks = convert(massive);
        //ArrayList<Task1> tasks = Task1.convert(massive);
        ArrayList<Task1> tasks = Task1.<Task1>convert(massive);
    }

    public static <Q> ArrayList<Q> convert(Q[] arr){
        ArrayList<Q> list = new ArrayList<Q>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        return list;
    }
}


