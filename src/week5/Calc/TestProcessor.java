package week5.Calc;

public class TestProcessor extends AbstractProcessor {

    @Override
    public void inputChar(char c) {
        System.out.println("Введено "+c);

        if (c=='c') {
            super.setResult(0);
            super.setTemp(0);
            super.setTempOperation(' ');
            return;
        }

        int digit = Character.getNumericValue(c);
        String str="";

        if (getTempOperation()!='\u0000' && getTemp()==getResult()){

            super.setResult(0);

        }

        if (digit>=0){

            if (super.getTempOperation()=='.') {str = ""+(int)super.getResult()+'.'+c;}

            else  str = ""+(int)super.getResult()+c;

            if (super.getTempOperation()=='.') super.setTempOperation(' ');


            super.setResult(Double.valueOf(str));

        } else {

            if ((c!='=') && (c!='.')) super.setTemp(getResult());


            if ((c=='.') || (c=='='))
            super.setTempOperation(c);
            else super.setTempOperationMath(c);

        }
    }
}