package week4.lesson8.HomeWork;

public class Task8_Fib {

    public static void main(String[] args) {

        System.out.println(fibonachi(7));

    }

    public static int fibonachi(int k){

        if (k==1 || k==2) return 1;
        else return (fibonachi( k-1 ) + fibonachi( k-2 ));

    }

}
