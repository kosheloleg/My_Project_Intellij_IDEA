package week4.lesson7;

/**
 * Created by Koshel on 30.01.2016.
 */
public class HumanWoman extends AbstractHuman{

    public void printAboutMe(){

        AbstractGlass glass = super.getGlass();

        if (glass!=null)

        System.out.println("Я женщина у меня есть стакан "+glass.getInfoForMe());

        else System.out.println("Я женщина у меня нет стакана");

    }

}
