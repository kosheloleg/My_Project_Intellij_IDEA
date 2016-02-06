package week5.lesson9;

public class MyEnumExample {

    public static void main(String[] args) {

        MyEnum obj = MyEnum.Black;

        MyEnum[] consts = MyEnum.values();

        MyEnum obj1 = MyEnum.valueOf("Black");

        String s = obj1.toString();

        System.out.println(MyEnum.isExist("Yellow"));

    }

}
