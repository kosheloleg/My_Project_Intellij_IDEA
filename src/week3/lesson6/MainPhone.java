package week3.lesson6;

import java.util.ArrayList;


public class MainPhone {

    public static void main(String... args) {

        ArrayList<Phone> phones = new ArrayList<Phone>();


        phones.add(new Nokia("222-33-44"));

        phones.add(new Samsung("217-20-85"));

        phones.add(new IPhone4s("515-63-87",6789));

        phones.add(new IPhone5("317-60-85",87687));



        int k1 = (int) (phones.size()*Math.random());
        int k2 = (int) (phones.size()*Math.random());


        phones.get(k1).call(phones.get(k2));


        System.out.println();


        for (Phone ph: phones){

            ph.printModel();

        }


        for (Phone ph:phones){

            if (ph instanceof IPhone){

                IPhone iPhone = (IPhone)(ph);

                iPhone.printAppleId();

            }

        }

    }

}
