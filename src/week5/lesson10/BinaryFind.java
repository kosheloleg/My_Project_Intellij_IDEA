package week5.lesson10;

public class BinaryFind {


    public static void FindIndex(int[] arr,int k){

        System.out.println(Find(arr,k));


    }




    public static int Find(int[] arr,int k){



        int opornoe;

        int begin = 0;
        int end = arr.length-1;


        while (true){

            opornoe = begin+ ((end - begin) / 2);

            if (arr[opornoe]==k) return opornoe;


            if (k >= arr[opornoe]) {

                begin = opornoe;

            } else {

                end = opornoe;

            }

            if (end - begin == 1) {

                if (arr[begin] == k) return begin;

                else if (arr[end] == k) return end;

                else return  -1;


            }


        }




    }


}
