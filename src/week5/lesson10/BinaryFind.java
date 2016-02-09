package week5.lesson10;

import java.util.Arrays;

public class BinaryFind {


    public static void FindIndex(int[] arr,int k){

        //System.out.println(k);
        Find(arr,k);

    }




    public static int Find(int[] arr,int k){

        int[] arrCut;

        int opornoe = (int)Math.round(arr.length/2);

       // System.out.println(opornoe);

        if (k>=opornoe){

            arrCut = new int[arr.length-opornoe];

            for (int i=opornoe;i<arr.length;i++){

                arrCut[i-opornoe] = arr[i];

            }

        } else {

            arrCut = Arrays.copyOf(arr,opornoe);

        }

        System.out.println(Arrays.toString(arrCut));

        return 0;

    }







}
