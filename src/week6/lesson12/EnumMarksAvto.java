package week6.lesson12;

import week6.lesson11.ConverArrayToArrayList;

import java.util.ArrayList;

public enum EnumMarksAvto {

    BMW,
    Volvo,
    VW,
    Opel,
    Audi;

    public static EnumMarksAvto selectOfMarks(String text) {

        EnumMarksAvto[] arrayMarks = EnumMarksAvto.values();

        ArrayList<EnumMarksAvto> listOfMarks = ConverArrayToArrayList.<EnumMarksAvto>convert(arrayMarks);
        ArrayList<EnumMarksAvto> dopListOfMarks = new ArrayList<EnumMarksAvto>();

        char[] arrayText = text.toCharArray();
        char[] arrayCharMarks;

        for (int i=0;i<arrayText.length;i++){

            for (EnumMarksAvto m:listOfMarks){

                arrayCharMarks = m.toString().toCharArray();

                if (i<arrayCharMarks.length){

                if (arrayText[i] == arrayCharMarks[i]){


                    dopListOfMarks.add(m);

                }

                }

            }

            listOfMarks = dopListOfMarks;

            if (listOfMarks.size()==1){

                return listOfMarks.get(0);

            }

        }



        return null;

    }
}
