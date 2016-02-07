package week5.lesson9;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Notepad {
    private ArrayList<Message> messages = new ArrayList<>();
    private class Message{
        private GregorianCalendar date;
        private ArrayList<String> list = new ArrayList<>();

        Message(GregorianCalendar date,String strX){

            this.date = date;
            addNote(strX);

        }

        GregorianCalendar getDate(){

           return date;
        }

        void addNote(String strX){

            list.add(strX);

        }

        ArrayList<String> getList(){

            return list;

        }

    }

    public void add(GregorianCalendar dateX, String strX){

        Message m = getMessageOnDate(dateX);


        if (m==null)  messages.add(new Message(dateX,strX));
        else  m.addNote(strX);

        if (m==null)
            messages.add(new Message(dateX,strX));
        else
            m.addNote(strX);


    }

    public Message getMessageOnDate(GregorianCalendar dateX){

        for (Message m:messages){

            if (m.getDate().equals(dateX))

                return m;
            }

        return null;
    }

    public void printByDate(GregorianCalendar dateX){

        Message m = getMessageOnDate(dateX);

        if (m!=null) {

            for (String str:m.getList()){

                System.out.println(str);

            }

        } else System.out.println("На эту дату записей нет");

    }

}