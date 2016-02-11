package week5.lesson10;

import java.util.Arrays;

public class MainBinaryFind {

    public static void main(String[] args) {

        int[] arr = new int[100];

        for (int i=0;i<100;i++){

            arr[i] = (int)(Math.random()*100);

        }

        Sort.goSelectionSort(arr);

        System.out.println(Arrays.toString(arr));

        int randDigit = arr[(int)(Math.random()*100)];

        System.out.println(randDigit);

        BinaryFind.FindIndex(arr,randDigit);




//        int[] arr = {0,3,7,7,9,22,55,69,89};
//
//        BinaryFind.FindIndex(arr,89);

    }
}
