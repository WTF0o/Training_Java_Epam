package company.Training_Java_Epam.Algorithmization.Multidimensional_Array.Task7;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n,count = 0;
        double[][] arr;

        System.out.print("Write n: ");
        n = scanner.nextInt();
        arr = new double[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                arr[i][j] = Math.sin((Math.sqrt(i) - Math.sqrt(j)) / n);
                if (arr[i][j] > 0) ++count;
                System.out.print(arr[i][j] + "\t");

            }

            System.out.println();

        }

        System.out.print(count);

    }

}
