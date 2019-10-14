package epam.Training_Java_Epam.Algorithmization.Unidimensional_Array_Sorting.Task3;

/*
Сортировка выбором. Дана последовательность чисел a1 ⩽ a2 ⩽ an.
Требуется переставить элементы так,чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        int buf, n, indexMax = 0;
        int[] arr;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write n: ");
        n = scanner.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = i + 1;

        }

        System.out.println("Array: " + Arrays.toString(arr));

        for (int i = 0; i < n; i++) {

            indexMax = i;

            for (int j = i + 1; j < n; j++)
                if (arr[i] < arr[j])
                    indexMax = j;

            if (arr[i] < arr[indexMax]) {
                buf = arr[i];
                arr[i] = arr[indexMax];
                arr[indexMax] = buf;
            }


        }

        System.out.println("Sort array: " + Arrays.toString(arr));

    }

}
