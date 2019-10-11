package epam.Training_Java_Epam.Algorithmization.Unidimensional_Array_Sorting.Task3;

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
