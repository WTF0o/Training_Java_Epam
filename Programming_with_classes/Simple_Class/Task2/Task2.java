package company.Training_Java_Epam.Programming_with_classes.Simple_Class.Task2;

public class Task2 {

    public static void main(String[] args) {

        Test2 test1 = new Test2();
        Test2 test2 = new Test2(10,20);

        test1.setA1(5);
        test1.setA2(10);

        System.out.println("Test1" + "\t" + "a1=" + test1.getA1() + "\t" + "a2=" + test1.getA2());
        System.out.println("Test2" + "\t" + "a1=" + test2.getA1() + "\t" + "a2=" + test2.getA2());
    }
}
