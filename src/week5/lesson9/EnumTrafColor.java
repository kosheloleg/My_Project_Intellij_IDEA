package week5.lesson9;

public enum EnumTrafColor {

    Red,Yellow,Green;


    public static boolean down;

    static boolean up;


    public static EnumTrafColor getNextColor(EnumTrafColor trafColor){

        EnumTrafColor[] trafColors = EnumTrafColor.values();

        for (int i=0;i<trafColors.length;i++){

            if (trafColors[i]==trafColor){

                if (i!=(trafColors.length-1) & i!=0){

                    return trafColors[i+((up)? 1:-1)];


                } else {

                    if (up) {

                        up=!up;
                        return trafColors[trafColors.length-2];
                    } else {
                        up=!up;

                        return trafColors[1];
                    }




                }



            }




        }







        if (trafColor==EnumTrafColor.Yellow){

            return (up)? EnumTrafColor.Red:EnumTrafColor.Green;

        } else{

            up=!up;
            return EnumTrafColor.Yellow;

        }

    }

}
