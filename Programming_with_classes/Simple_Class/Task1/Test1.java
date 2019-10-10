package company.Training_Java_Epam.Programming_with_classes.Simple_Class.Task1;

public class Test1{

    private int a1;
    private int a2;

    public void setAll(int a1,int a2) {

        this.a1 = a1;
        this.a2 = a2;

    }

    public void print(){

        System.out.printf("a1=%d" + "\t" + "a2=%d" + "\n",a1,a2);

    }

    public int sum(){

        return a1 + a2;

    }

    public int CheckValues(){

        return (a1>a2) ? a1 : a2;

    }

}
