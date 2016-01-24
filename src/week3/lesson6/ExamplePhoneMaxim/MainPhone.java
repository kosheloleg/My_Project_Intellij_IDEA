package week3.lesson6.ExamplePhoneMaxim;

import java.util.ArrayList;


public class MainPhone {
    public static void main(String[] args) {

        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Nokia("35"));
        phones.add(new Nokia("36"));
        phones.add(new IPhone4("39"));
        phones.add(new IPhone4("40"));
        phones.add(new IPhone5("41"));
        phones.add(new IPhone5("42"));



        int k1 = (int)(phones.size()*Math.random());
        int k2 = (int)(phones.size()*Math.random());
        phones.get(k1).call( phones.get(k2));

        System.out.println("\nСписок моделей телефонов:");
        for( Phone phs:phones) phs.printModel();

        System.out.println("\nСписок имеи:");

        for(Phone phs:phones) {
            if(phs instanceof IPhone){
                IPhone iphone = (IPhone)(phs);
                iphone.printAppleId();
            }
        }
    }
}