package company.Training_Java_Epam.Algorithmization.Unidimensional_Array.Task4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int[] mas;
        int n, numberMax,numberMin,buffer,indexMax,indexMin;
        indexMin=indexMax=buffer=numberMin=numberMax=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        n = scanner.nextInt();
        mas = new int[n];

        System.out.println("Исходный массив:");
        for (int i = 0;i < mas.length;i++) {

            mas[i] = -10 + (int) (Math.random() * 20);

            if(i == 0)
            {

                numberMax = mas[i];
                numberMin = mas[i];
                indexMax = i;
                indexMin = i;

            }
            else if((i != 0) && (numberMin > mas[i]))
            {

                numberMin = mas[i];
                indexMin = i;

            }
            else if((i != 0) && (numberMax < mas[i]))
            {

                numberMax = mas[i];
                indexMax = i;

            }

            System.out.print("\t" + mas[i]);

        }

        reverseMas(mas,indexMax,indexMin);

        System.out.println("\n" + "Финальный массив:");
        for (int i = 0;i < mas.length;i++) {

            System.out.print("\t" + mas[i]);

        }

    }

    public static void reverseMas(int[] mas,int indexMax,int indexMin)
    {
        int buffer;

        buffer = mas[indexMin];
        mas[indexMin] = mas[indexMax];
        mas[indexMax] = buffer;

    }
}
