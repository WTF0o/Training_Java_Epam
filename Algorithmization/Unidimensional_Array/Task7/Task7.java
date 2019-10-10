package company.Training_Java_Epam.Algorithmization.Unidimensional_Array.Task7;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] mas;
        int n,max = 0;

        System.out.print("Введите n: ");
        n = scanner.nextInt();
        mas = new int[n];

        System.out.println("Массив:");
        for (int i = 0 ; i < mas.length;i++){

            mas[i] = (int) (Math.random() * 10);
            System.out.print("\t" + mas[i]);

        }
        System.out.println();

        for (int left = 0,right = mas.length - 1; left < right;left++,right--)
            if (max < mas[left] + mas[right]) max = mas[left] + mas[right];

        System.out.print("Максимум: " + max);

    }
}
