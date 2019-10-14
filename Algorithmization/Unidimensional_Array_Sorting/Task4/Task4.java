package epam.Training_Java_Epam.Algorithmization.Unidimensional_Array_Sorting.Task4;

/*
4. Сортировка обменами. Дана последовательность чисел
a1 ⩽ a2 ⩽ an.Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа
ai и ai+1.Если ai > ai+1, то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

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
