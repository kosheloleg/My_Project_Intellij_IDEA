package week5.Calc;

public abstract  class AbstractProcessor implements Processorable {
    private int result;
    private int temp;
    @Override
    public void printResult() {
        System.out.println("Result = " + result);
    }
    protected void setResult(int r){
        result = r;
    }
    public int getResult(){
        return result;
    }
}