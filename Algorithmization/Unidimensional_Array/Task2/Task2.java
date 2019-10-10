package company.Training_Java_Epam.Algorithmization.Unidimensional_Array.Task2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int n,z,countReverse;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность массива: ");
        n = scanner.nextInt();
        int[] mas = new int[n];

        System.out.print("Введите Z: ");
        z = scanner.nextInt();

        System.out.println("Исходный массив:");
        for (int i = 0; i < mas.length; i++)
        {

            mas[i] = (int) (Math.random() * (z*2));
            System.out.print("\t" + mas[i]);

        }
        System.out.println();

        countReverse = 0;
        System.out.println("Финальный массив:");
        for (int i = 0; i < mas.length; i++)
        {

            if(mas[i] > z){

                mas[i] = z;
                countReverse++;

            }

            System.out.print("\t" + mas[i]);

        }
        System.out.println();

        System.out.print("Количество замен:" + countReverse);


    }

}
