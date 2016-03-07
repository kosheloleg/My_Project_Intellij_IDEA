package week8.Calc_NEW;

public class Calc {
    private AbstractProcessor proc;

    public Calc(AbstractProcessor pr){
        proc = pr;
    }
    public void inSymv(char c){
        proc.inputChar( c );
        proc.printResult();
    }
}