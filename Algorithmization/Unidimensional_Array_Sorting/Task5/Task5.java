package company.Training_Java_Epam.Algorithmization.Unidimensional_Array_Sorting.Task5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        int n;
        int[] arr;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write n: ");
        n = scanner.nextInt();
        arr = new int[n];

        System.out.println("Array: ");

        for (int i = 0; i < n; i++) {

            arr[i] = n - i;
            System.out.print(arr[i] + "\t");

        }

        sort(arr);


    }

    public static void sort(int[] arr) {

        int[] sortArr = new int[arr.length];

        for (int j = 0; j < arr.length; j++)
            for (int i = 0; i < arr.length - 1; i++) {



            }

    }

    public static void find(int[] sourceArr, int[] sortArr, int firstIndex, int lastIndex) {


    }

}
