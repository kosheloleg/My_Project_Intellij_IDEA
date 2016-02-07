package week5.lesson9;

import java.util.GregorianCalendar;

//Task1. Создать класс Notepad (записная книжка) с внутренним клас-
//        сом или классами, с помощью объектов которого могут хра-
//        ниться несколько записей на одну дату.
//        Notepad ( ArrayList<Message> messages; )
//        Message( GregorianCalendar date; ArrayList<String> list; )


public class NotepadMain {

    public static void main(String[] args) {
        Notepad n = new Notepad();
        GregorianCalendar date1 = new GregorianCalendar(2015,01,20);
        GregorianCalendar date2 = new GregorianCalendar(2015,01,21);
        n.add(date1, "Первая строка");
//        n.add(date1, "Вторая строка");
        n.add(date2, "Третья строка");
//        n.printByDate(date1);
//
//        System.out.println("");

        n.printByDate(date2);
    }






}
