package HomeWork_NewYear;

/**
 * Created by Oleg on 03.01.2016.
 */
public class Developer {

    String typeTransport;
    String weather;

    int timeBeginGoToWork;
    double timeEndGoToWork;
    int salaryHour;
    int salaryTransport;


    int endWorkDay;

    public Developer(int timeBeginGoToWork,int endWorkDay,int salaryHour){

        this.timeBeginGoToWork = timeBeginGoToWork;
        this.endWorkDay = endWorkDay;
        this.salaryHour = salaryHour;

    }



    public double calculateMoney(){

        double money;

        money = (endWorkDay - timeEndGoToWork)*salaryHour - salaryTransport;


        return money;

    }

    public void goToWork(String typeTransport,String weather){

        double k=1;

        if (weather.equals("bad")){k*=2;}
        if (weather.equals("good")) {k/=2;}


        if (typeTransport.equals("moto")){
            timeEndGoToWork=timeBeginGoToWork+k*1;
            salaryTransport = 80;
        }
        if (typeTransport.equals("bus")){
            timeEndGoToWork=timeBeginGoToWork+ k*2;
            salaryTransport = 20;
        }
        if (typeTransport.equals("velo")){
            timeEndGoToWork=timeBeginGoToWork+k*3;
            salaryTransport = 0;
        }

    }









}
