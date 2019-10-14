package epam.Training_Java_Epam.Programming_with_classes.Simple_Class.Task1;

/*
1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.
 */

public class Task1 {

    public static void main(String[] args) {

        Test1 test1 = new Test1();

        test1.setAll(5,7);
        System.out.println(test1.print());

        System.out.println(test1.CheckValues());
        System.out.println(test1.sum());

    }
}

