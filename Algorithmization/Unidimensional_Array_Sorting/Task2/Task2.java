package epam.Training_Java_Epam.Algorithmization.Unidimensional_Array_Sorting.Task2;

/*
2. Даны две последовательности
a1 ⩽ a2 ⩽ an и b1 ⩽ b2 ⩽ bm
. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int buf,n,m;
        int[] arr1,arr2,arrResult;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write n: ");
        n = scanner.nextInt();
        arr1 = new int[n];

        for (int i = 0; i < n; i++){

            arr1[i] = i + 1;

        }

        System.out.print("Write m: ");
        m = scanner.nextInt();
        arr2 = new int[m];

        for (int i = 0; i < m; i++){

            arr2[i] = i + 1;

        }

        arrResult = new int[arr1.length + arr2.length];

        System.out.println("Array1: " + Arrays.toString(arr1));

        System.out.println("Array2: " + Arrays.toString(arr2));

        System.arraycopy(arr1,0,arrResult,0,arr1.length);
        System.arraycopy(arr2,0,arrResult,arr1.length,arr2.length);

        for (int k = 0;k < arrResult.length;k++)
            for (int i = 0;i < arrResult.length - 1;i++)
                if(arrResult[i] > arrResult[i+1]){

                    buf = arrResult[i];
                    arrResult[i] = arrResult[i+1];
                    arrResult[i+1] = buf;

                }

        System.out.println("Result: " + Arrays.toString(arrResult));

    }

}
