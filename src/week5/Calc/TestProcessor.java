package week5.Calc;

public class TestProcessor extends AbstractProcessor {

    @Override
    public void inputChar(char c) {
        System.out.println("Введено "+c);

        int digit = Character.getNumericValue(c);
        String str="";

        if (getTempOperation()!='\u0000' && getTemp()==getResult()){

            super.setResult(0);

        }

        if (digit>=0){

            str = ""+super.getResult()+c;


            super.setResult(Integer.valueOf(str));

        } else {

            if (c!='=') super.setTemp(getResult());


            super.setTempOperation(c);


        }
    }
}