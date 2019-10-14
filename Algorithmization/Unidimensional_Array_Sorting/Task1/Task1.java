package epam.Training_Java_Epam.Algorithmization.Unidimensional_Array_Sorting.Task1;

/*
1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int k,n,m,t;
        int[] arr1,arr2,arrResult;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write count elements array1: ");
        n = scanner.nextInt();
        arr1 = new int[n];

        System.out.print("Write count elements array2: ");
        m = scanner.nextInt();
        arr2 = new int[m];
        t = n + m;
        arrResult = new int[t];

        System.out.print("Write k: ");
        k = scanner.nextInt();


        for (int i = 0; i < n; i++)
            arr1[i] = (int) (Math.random() * 10);

        System.out.println("Array1: " + Arrays.toString(arr1));

        for (int i = 0; i < m; i++)
            arr2[i] = (int) (Math.random() * 10);

        System.out.println("Array2: " + Arrays.toString(arr2));


        System.arraycopy(arr1,0,arrResult,0,k);
        System.arraycopy(arr2,0,arrResult,k,arr2.length);
        System.arraycopy(arr1,k,arrResult,k + m,arr1.length - k);

        System.out.println("Result: " + Arrays.toString(arrResult));

    }

}
