package epam.Training_Java_Epam.Algorithmization.Unidimensional_Array_Sorting.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int buf, n, coutPermutation = 0;
        int[] arr;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write n: ");
        n = scanner.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = n - i ;

        }

        System.out.println("Array: " + Arrays.toString(arr));

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n - 1; j++)
                if (arr[j] > arr[j + 1]){

                    buf = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buf;
                    ++coutPermutation;

                }


        System.out.println("Sort array: " + Arrays.toString(arr));
        System.out.println("Cout permutation: " + coutPermutation);

    }

}
