package epam.Training_Java_Epam.Programming_with_classes.Simple_Class.Task5;

/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */


public class Task5 {

    public static void main(String[] args) {

        MyСounter counter1 = new MyСounter(25);
        MyСounter counter2 = new MyСounter();

        System.out.println("Counter1 : " + counter1.getValue());
        System.out.println("Counter2 : " + counter2.getValue());

        counter1.increment();
        counter2.setValue(55);
        counter2.decrement();
        System.out.println("Counter1 : " + counter1.getValue());
        System.out.println("Counter2 : " + counter2.getValue());

    }

}
