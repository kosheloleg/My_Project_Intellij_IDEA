package week3.lesson6.ExamplePhoneMaxim;


public abstract class Phone {
    private String number;
    public void printModel(){
        System.out.println("Phone printModel(): "+getModel());
    }
    public String getModel(){
        return this.getClass().getName();
    }

    public void call(Phone obj) {
        String number1 = " телефон "+this.getModel()+" с номером "+ this.getNumber();
        String number2 = " телефон "+obj.getModel()+" с номером "+ obj.getNumber();
        System.out.println(number1 +" звоню на" + number2);

    }
    public Phone(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }
}