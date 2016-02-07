package week5.lesson10;


public class Sort {

        public static void goSelectionSort(int[] arr){


            for (int i=0;i<arr.length;i++) {

                    int min = arr[i];
                    int posMin = i;

                    for (int j = i + 1; j < arr.length; j++) {

                        if (min > arr[j]) {

                            min = arr[j];
                            posMin = j;
                        }

                    }


                    if (arr[i] > arr[posMin]) {

                        int promValue = arr[i];
                        arr[i] = arr[posMin];
                        arr[posMin] = promValue;

                    }

                }


        }






}
