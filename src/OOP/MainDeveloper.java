package OOP;

import java.util.ArrayList;

public class MainDeveloper {

    public static void main(String[] args){

        double maxMoney;
//        String bestWeather="";
        String bestTransport="";

        ArrayList<String>  weathers = new ArrayList<String>();
        weathers.add("good");
        weathers.add("bad");
        weathers.add("usualy");

        ArrayList<String> transports = new ArrayList<String>();
        transports.add("moto");
        transports.add("velo");
        transports.add("bus");


        Developer dev = new Developer(9,18,35);

        double money;

        for (String wtrs:weathers){

            //money = 0;
            maxMoney = 0;
            for (String trnsp:transports){


                dev.goToWork(trnsp,wtrs);
                money = dev.calculateMoney();

//                System.out.println("В "+wtrs+" погоду на "+trnsp+"  зароботок составит "+money);

                if (money>maxMoney){

                    maxMoney = money;

                    bestTransport = trnsp;



                }


            }

            System.out.println("В "+wtrs+" погоду оптимальный транспорт будет "+bestTransport+". Зароботок составит "+maxMoney);


        }


    }
}
