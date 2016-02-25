package week5.Calc;

public abstract  class AbstractProcessor implements Processorable {
    private int result;
    private int temp;
    private char tempOperation;
    @Override
    public void printResult() {
        System.out.println("Temp " + temp);
        System.out.println("Result " + result);
        System.out.println();
    }


    protected void setResult(int r){
        result = r;
    }
    public int getResult(){
        return result;
    }

    public char getTempOperation() {
        return tempOperation;
    }

    public void setTempOperation(char tempOperation) {

        if (tempOperation=='='){

            if (getTempOperation()=='+') setResult(getTemp()+getResult());
            if (getTempOperation()=='-') setResult(getTemp()-getResult());
            if (getTempOperation()=='/') setResult(getTemp()/getResult());
            if (getTempOperation()=='*') setResult(getTemp()*getResult());


        }

        else
            this.tempOperation = tempOperation;
    }

    public void setTemp(int temp){

        this.temp = temp;


    }

    public int getTemp(){

        return temp;

    }


}