package week8.lesson15;

public class Thread1Example {

    public static void main(String[] args) {

        FirstThread obj1 = new FirstThread("Thr1");
        FirstThread obj2 = new FirstThread("\tThr2");
        FirstThread obj3 = new FirstThread("\t\tThr3");

        obj1.start();
        obj2.start();
        obj3.start();

        System.out.println("end!!!!!!!!!!!!!!!!!!!!!!!!1");
    }
}
class FirstThread extends Thread{
    private String name;
    public FirstThread(String n){
        name = n;
    }
    @Override
    public void run(){
        for(int i = 0; i < 1000;i++){
            System.out.println(name+"_"+i);
        }
    }
}