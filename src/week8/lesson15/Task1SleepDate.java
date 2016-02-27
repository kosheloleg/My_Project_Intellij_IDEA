package week8.lesson15;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 Создать поток, который будет каждые 10 секунд выводить текущее время на экран.
 Сделать возможность прерывания потока с помощью команды с консоли.
 */
public class Task1SleepDate implements Runnable
{

    public static void main (String...args)
    {
        Task1SleepDate s = new Task1SleepDate();
        Thread thread1 = new Thread(s);
        thread1.start();
        thread1.interrupted();
    }

    @Override
    public void run()
    {
        while (true)
        {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
            String a = simpleDateFormat.format(date);
            System.out.println(a);
            sleepNSeconds(2);


        }
    }

    public static int delay = 1000;
    public static void sleepNSeconds(int n)
    {
        try
        {
            Thread.sleep(n * delay);
        }
        catch (InterruptedException e)
        {
            return;
        }
    }
}