package week5.lesson9;

public enum MyEnum {

    Black,Red,White;


    public static boolean isExist(String s){

        MyEnum[] consts = MyEnum.values();

        for (int i=0;i<consts.length;i++){

            if (consts[i].toString().equalsIgnoreCase(s)){

                return true;
            }

        }

        return false;
    }

    EnumTrafColor getNextColor(EnumTrafColor currentColor){

        return EnumTrafColor.Green;

    }

}
