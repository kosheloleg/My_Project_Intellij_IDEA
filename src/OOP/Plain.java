package OOP;

/**
 * Created by Oleg on 03.01.2016.
 */
public class Plain extends Transport{

    int height;


    public Plain(String type,int maxHeight){

        super (type,0,0,maxHeight);

    }

    public void down(int height){

        if (this.height<=height){

            System.out.println("Не возможно снизить высоту, по скольку самолет разобьется. Текущая высота: "+height);
        }
        else {
            this.height-=height;
            System.out.println("Высота самолета уменшилась на: "+height);
        }



    }

    public void up(int height){

        if ((this.height+height)>maxHeight){
            System.out.println("Самолет не может набрать такую высоту, потому что максимальная "+maxHeight);
        } else {

            this.height+= height;
            System.out.println("Высота самолета увеличилась на: "+height);
       }


    }

    @Override
    public String toString(){

        return "У самолета максимальная высота: "+maxHeight+". Текущая высота: "+height;

    }



}
