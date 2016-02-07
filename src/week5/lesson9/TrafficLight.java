package week5.lesson9;

//Задача 3.
//        Написать класс Светофор TrafficLight с перечислением EnumTrafColor.
//        TrafficLight и EnumTrafColor реализуют отношения делегирования.
//        В классе MainTrafficLight создаем объект класса Светофор и с помощью цикла for (например 10 раз) вызываем метод
//        переключения цвета в светофоре.
//        Между каждым перечислением(в main) вставляем код замирания на секунду(пол секунды)
//        try {
//        Thread.sleep(500);
//        } catch (Exception e) {
//        e.printStackTrace();
//        }
//        Подумать о том, чтобы в перечислении был метод например getNextColor, который переключает светофор на следующий цвет.
//        Последовательность цветов у светофора:ж,з,ж,к,ж,з,ж,к,ж,з,ж,к
public class TrafficLight {

    EnumTrafColor colorTrafficLight;

    EnumTrafColor getNextColor(){

        EnumTrafColor nextColor = EnumTrafColor.getNextColor(colorTrafficLight);
        colorTrafficLight = nextColor;

        return nextColor;

    }

    TrafficLight (){

        colorTrafficLight = EnumTrafColor.Red;
        EnumTrafColor.up = false;

    }

}
