package week2.lesson3;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Oleg on 17.01.2016.
 */
public class Phone {

    private String myNumber;
    private String marka;
    private static Phone[] phones = new Phone[10];
    private static int countPhone;

    public Phone(String number,String marka){

        this.myNumber = number;
        this.marka = marka;

        addPhones(number);
    }

    private void addPhones(String number){

        phones[countPhone] =this;

        countPhone+=1;

    }

    public void call(String number){

        Phone phoneObj = getPhone(number);

        if (!phoneObj.equals(this)) {

        if (phoneObj!=null){
            System.out.println("Телефон "+this+" Звонит на "+phoneObj);
        } else
            System.out.println("Нет такого номера в базе!");}

        else System.out.println("Телефон не может звонить на свой номер");

    }

    public static String getMarka(String number){

        Phone phoneObj;

        phoneObj = getPhone(number);

        if (phoneObj!=null){

            return phoneObj.marka;

        } else return "";

    }

    public Phone(String number){

        this(number,"");

    }

    public Phone(){

        this("","");

    }

    public static boolean isNumberExist(String number){

        return getPhone(number)!=null;

    }

    public static Phone getPhone(String number){

        Phone phoneObj;

        for (int i=0;i<phones.length;i++){

            phoneObj = phones[i];

            if (phoneObj!=null) {

                if (phoneObj.myNumber.equals(number)){

                    return phoneObj;


                }

            }



        }

        return null;

    }

    @Override
    public String toString(){

        return "Марка: "+this.marka+". "+"Номер: "+this.myNumber;

    }

    public static Phone getRandomPhone(){

        int random;
        Phone phoneObj;

        if (countPhone>0) {

            while (true){

                random = (int)(Math.random()*11);

                if (random>=0 & random<phones.length){

                    phoneObj = phones[random];

                    if (phoneObj!=null)
                    return phoneObj;
                }

            }

        }

        else return null;

    }

    public static String getRandomNumber(){

        if (countPhone>0) {
        Phone phoneObj = getRandomPhone();
        return phoneObj.myNumber;
        }

        else return "";

    }
}
