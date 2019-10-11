package epam.Training_Java_Epam.Algorithmization.Unidimensional_Array.Task5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        int[] mas;
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        n = scanner.nextInt();
        mas = new int[n];

        System.out.println("Исходный массив:");
        for (int i = 0;i < mas.length;i++) {

            mas[i] = -10 + (int) (Math.random() * 20);
            System.out.print("\t" + mas[i]);

        }

        System.out.println("\n" + "Финальный массив:");
        for (int i = 0;i < mas.length;i++) {

            if(mas[i] > i) System.out.print("\t" + mas[i]);

        }

    }
}
