package week2.lesson3;

/**
 * Created by Oleg on 17.01.2016.
 */
public class mainPhone {

    public static void main(String[] args){

        Phone phone = new Phone("217-20-85","Iphone");
        Phone phone1 = new Phone("107-63-94","Samsung");
        Phone phone3 = new Phone("777-77-77","LG");



        System.out.println("Есть ли номер 217-20-85:"+ Phone.isNumberExist("217-20-85"));
        System.out.println("Есть ли номер 107-63-94:"+ Phone.isNumberExist("107-63-94"));
        System.out.println("Есть ли номер 777-77-77:"+ Phone.isNumberExist("777-77-77"));

        Phone randomPhone = Phone.getRandomPhone();

        randomPhone.call(Phone.getRandomNumber());


    }

}
