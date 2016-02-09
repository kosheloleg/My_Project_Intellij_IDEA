package week5.Calc;

import week5.Calc.AbstractProcessor;

public class TestProcessor extends AbstractProcessor {

    @Override
    public void inputChar(char c) {
        System.out.println("Введено "+c);
    }
}