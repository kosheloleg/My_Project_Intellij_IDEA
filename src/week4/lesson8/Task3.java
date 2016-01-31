package week4.lesson8;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите k");
        int k= sc.nextInt();

        output(k);

    }

    public static void output(int k){

        if (k>2) output(k-1);
        System.out.println(k);
    }
}
