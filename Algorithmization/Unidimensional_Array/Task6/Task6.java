package epam.Training_Java_Epam.Algorithmization.Unidimensional_Array.Task6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        double[] mas;
        double sum = 0;
        int n;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        n = scanner.nextInt();
        mas = new double[n];

        System.out.println("Исходный массив:");
        for (int i = 0;i < mas.length;i++) {

            mas[i] =Math.random() * 10;

            if((i > 1) && testSimpleNumber(i)) {
                sum = sum + mas[i];
            }
            System.out.print("\t" + decimalFormat.format(mas[i]));

        }

        System.out.print("\n" + "Сумма: " + decimalFormat.format(sum));


    }

    public static boolean testSimpleNumber(double number){

        boolean simpleNumber = true;

        for (int i = 2;i < number;i++)
        {
            if ((number % i == 0) && (number != i)) return simpleNumber=false;
        }

        return  simpleNumber;

    }
}
