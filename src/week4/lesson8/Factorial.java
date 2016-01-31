package week4.lesson8;


import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите k");
        int k= sc.nextInt();

        System.out.println(fact(k));


    }

    public static int fact(int k) {

        if (k != 0){

            return k * fact(k - 1);
        } else {
        return 0;}

    }
}
