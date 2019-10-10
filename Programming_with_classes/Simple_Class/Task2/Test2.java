package company.Training_Java_Epam.Programming_with_classes.Simple_Class.Task2;

public class Test2{

    private int a1;
    private int a2;

    public Test2(int a1,int a2){

        this.a1 = a1;
        this.a2 = a2;

    }

    public Test2(){

        a1 = 0;
        a2 = 0;

    }

    public int getA1() {
        return a1;
    }

    public int getA2() {
        return a2;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }
}
