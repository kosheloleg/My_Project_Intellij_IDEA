package week3.lesson6;

import java.util.ArrayList;

/**
 * Created by Koshel on 24.01.2016.
 */
public class MainPhone {

    public static void main(String... args) {

        ArrayList<Phone> phones = new ArrayList<Phone>();


        phones.add(new Nokia("222-33-44",true,2));

        phones.add(new Samsung("217-20-85",true,3));

        phones.add(new IPhone4("515-63-87",false,5,6789));

        phones.add(new IPhone5("317-60-85",true,4,87687));


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
