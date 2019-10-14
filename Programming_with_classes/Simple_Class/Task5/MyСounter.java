package epam.Training_Java_Epam.Programming_with_classes.Simple_Class.Task5;

public class MyСounter {

    private int value;

    public MyСounter(int value) {

        this.value = value;

    }

    public MyСounter() {

        value = 0;

    }

    public int getValue() {

        return value;

    }

    public void setValue(int value) {

        this.value = value;

    }

    public void increment() {

        ++value;

    }

    public void decrement() {

        --value;

    }

}
