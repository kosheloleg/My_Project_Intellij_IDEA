package week8.lesson15;

import java.util.ArrayList;

public class MyClass {

    public static class Counter extends Thread {
        int n;

        public Counter(int n) {
            this.n = n;
        }

        public void run() {
            System.out.println(n);

            while (! isInterrupted()) {
                try {
                    Thread.sleep(1000); // закомментировать
                } catch (InterruptedException e) {
                    return;
                }
            }
        }

        public static void main(String[] args) throws InterruptedException {

            ArrayList<Counter> threads = new ArrayList<Counter>();

            for (int i = 0; i < 100; i++) {
                Counter c = new Counter(i);
                c.start();
                threads.add(c);
            }

            Thread.sleep(8000);

            for (Counter c : threads)
                c.interrupt();
        }
    }
}