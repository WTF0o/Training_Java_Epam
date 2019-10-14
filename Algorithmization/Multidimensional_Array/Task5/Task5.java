package epam.Training_Java_Epam.Algorithmization.Multidimensional_Array.Task5;

/*
 Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
|1  2   3  ... 1    1   1|
|2  2   2  ... 2    2   0|
|3  2   3  ... 3    0   0|
|.  .   .  .   .    .   .
 .  .   .   .  .    .   .
 .  .   .    . .    .   .
|n-1 n-1 0 ... 0    0   0|
|n  0   0  ... 0    0   0|
 */

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int[][] arr;

        System.out.print("Write n: ");
        n = scanner.nextInt();
        arr = new int[n][n];

        for (int i = 0; i < n; i++){

            for(int j= 0; j < n; j++){

                if(j < n - i) arr[i][j] = i + 1;
                else arr[i][j] = 0;

                System.out.print(arr[i][j]);

            }

            System.out.println();

        }

    }

}
