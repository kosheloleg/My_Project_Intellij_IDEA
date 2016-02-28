package week8.lesson15;



import java.util.ArrayList;

public class Thread50000 {

    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        ft.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }

        ft.interrupt();
    }

    // поток, который породит 50 дочерних потоков
    private static class FirstThread extends Thread {

        // список порожденных потоков
        ArrayList<SecondThread> list = new ArrayList<SecondThread>();

        public void run() {
            SecondThread st;

            // создаем 50 потоков и складываем ссылки на них с список
            for (int i = 0; i < 50; i++) {
                st = new SecondThread(i);
                list.add(st);

                st.start();
            }

            // ждем пока нас прибьют
            while ( ! isInterrupted()) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }

            // если мы тут, значит нас прибили
            // прерываем наши 50 дочерних потоков
            for (SecondThread s : list)
                s.interrupt();
        }
    }




    // один из 50-и потоков
    private static class SecondThread extends Thread {
        int n;

        public SecondThread(int n) {
            this.n = n;
        }

        public void run() {
            // выводим свой номер
            System.out.println(n);

            // ждем пока нас прибьют
            while ( ! isInterrupted()) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }

            System.out.println(n + " thread interrupted!");
        }
    }



}
