package epam.Training_Java_Epam.Programming_with_classes.Simple_Class.Task1;


public class Task1 {

    public static void main(String[] args) {

        Test1 test1 = new Test1();

        test1.setAll(5,7);
        test1.print();

        System.out.println(test1.CheckValues());
        System.out.println(test1.sum());

    }
}

