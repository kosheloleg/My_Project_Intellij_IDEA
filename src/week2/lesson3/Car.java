package week2.lesson3;

import java.util.ArrayList;

public class Car {

    private String number;
    private String color;
    private String marka;


    private static int contObj;

    private ArrayList<String> marks = new  ArrayList<String>();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {

        if (marks.contains(marka))

        this.marka = marka;
    }

    public Car(){

        this("AA","Black","BMW");

        marka = "";
        fillArrayMarks();

    }

    public Car(String num,String c,String marka){

        fillArrayMarks();

       setMarka(marka);
       number = num;
       color = c;

        contObj+=1;

    }

    public int getContObj(){

        return contObj;

    }




    public void setColor(String c){
        if (c.equals("Black") || c.equals("BWhite"))
        color = c;
    }

    public String getColor(){
        return color;
    }

    private void fillArrayMarks(){

        marks.add("BMW");
        marks.add("VOLVO");
        marks.add("VW");

    }


}
