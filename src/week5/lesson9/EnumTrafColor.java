package week5.lesson9;

public enum EnumTrafColor {

    Red,Yellow,Green;

    public static EnumTrafColor getNextColor(EnumTrafColor trafColor){

        EnumTrafColor[] trafColors = EnumTrafColor.values();

        for (int i=0;i<trafColors.length;i++){

            if (trafColors[i]==trafColor){

                if ((i+1)>=trafColors.length){

                    return trafColors[0];

                } else return trafColors[i+1];

            }


        }


        return null;
    }

}
