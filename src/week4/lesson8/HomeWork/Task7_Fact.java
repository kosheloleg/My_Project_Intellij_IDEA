package week4.lesson8.HomeWork;

public class Task7_Fact {

    public static void main(String[] args) {

        System.out.println(getFact(5));

    }

    public static int getFact(int f){

        if (f==1)

            return 1;
         else
            return f*getFact(f-1);
    }

}
