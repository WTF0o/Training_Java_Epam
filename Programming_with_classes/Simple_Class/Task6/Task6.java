package epam.Training_Java_Epam.Programming_with_classes.Simple_Class.Task6;

/*
6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.
 */

public class Task6 {

    public static void main(String[] args) {

        Time time = new Time(15,24,23);
        System.out.println("Time: " + time.getHours()+ ":" + time.getMinutes() + ":" + + time.getSeconds());
        time.addHours(15);
        System.out.println("Time: " + time.getHours()+ ":" + time.getMinutes() + ":" + + time.getSeconds());

    }

}
