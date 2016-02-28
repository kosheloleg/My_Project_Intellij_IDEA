package week8.Calc_NEW;

public abstract  class AbstractProcessor implements Processorable {
    private double result;
    private double temp;
    private char tempOperation;
    private char tempOperationMath;
    @Override
    public void printResult() {

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


    }

    public void setTemp(double temp){

        this.temp = temp;


    }

    public double getTemp(){

        return temp;

    }


}