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

    }

    public void add(GregorianCalendar dateX, String strX){

        boolean isMassageOnDate = false;

        for (Message m:messages){

            if (m.getDate().equals(dateX)) {

                m.addNote(strX);
                isMassageOnDate = true;


            }

            if (!isMassageOnDate){

                messages.add(new Message(dateX,strX));
            }

        }

  /*
  if(в messages есть объект с датой dateX){
   в этот объект(с этой датой) добавляем строку в
   поле list
  } else {
   создаем новый объект Message и добавляем в messages
  }
  */
    }

    public void printByDate(GregorianCalendar dateX){
    }

}