package week5.Calc;

public abstract  class AbstractProcessor implements Processorable {
    private double result;
    private double temp;
    private char tempOperation;
    private char tempOperationMath;
    @Override
    public void printResult() {
        System.out.println("Temp " + temp);
        System.out.println("Result " + result);
        System.out.println();
    }

    public void setTempOperationMath(char tempOperationMath){
        this.tempOperationMath = tempOperationMath;
    }

    public char getTempOperationMath(){
        return this.tempOperationMath;
    }


    protected void setResult(double r){
        result = r;
    }
    public double getResult(){
        return result;
    }

    public char getTempOperation() {
        return tempOperation;
    }

    public void setTempOperation(char tempOperation) {

        if (tempOperation=='='){

            if (getTempOperationMath()=='+') setResult(getTemp()+getResult());
            if (getTempOperationMath()=='-') setResult(getTemp()-getResult());
            if (getTempOperationMath()=='/') setResult(getTemp()/getResult());
            if (getTempOperationMath()=='*') setResult(getTemp()*getResult());

            setTemp(0);
            setTempOperationMath(' ');
            setTempOperation(' ');

        }

        else
            this.tempOperation = tempOperation;
    }

    public void setTemp(double temp){

        this.temp = temp;


    }

    public double getTemp(){

        return temp;

    }


}