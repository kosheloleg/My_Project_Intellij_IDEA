package week5.lesson10;

import java.util.Arrays;

/**
 * Created by Koshel on 07.02.2016.
 */
public class mainSort {

    public static void main(String[] args) {

        int[] arr = new int[100];

        for (int i=0;i<100;i++){

            arr[i] = (int)(Math.random()*100);

        }

        int[] arrCopy = Arrays.copyOf(arr,arr.length);

        //System.out.println(Arrays.toString(arrCopy));

       /////////////////////////////////////////////////////////
//        int[] testArr = new int[3];
//        testArr[0] = 9;
//        testArr[1] = 7;
//        testArr[2] = 6;
//


        System.out.println(Arrays.toString(arrCopy));

        Sort.goSelectionSort(arr);

        System.out.println(Arrays.toString(arr));

    }


}
