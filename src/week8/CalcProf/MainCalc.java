package week8.CalcProf;

public class MainCalc {

    public static void main(String[] args) {

        AbstractCalc testCalc = new AbstractCalc();

        testCalc.inChar('1');
        testCalc.inChar('5');

        testCalc.inChar('+');
        testCalc.inChar('5');
        testCalc.inChar('6');
        testCalc.inChar('7');

        testCalc.inChar('=');

        testCalc.inChar('-');
        testCalc.inChar('8');
        testCalc.inChar('2');
        testCalc.inChar('=');

        testCalc.inChar('-');
        testCalc.inChar('9');
        testCalc.inChar('0');
        testCalc.inChar('0');
        testCalc.inChar('=');

        testCalc.inChar('+');
        testCalc.inChar('3');
        testCalc.inChar('0');
        testCalc.inChar('0');
        testCalc.inChar('=');






    }

}
