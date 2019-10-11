package epam.Training_Java_Epam.Algorithmization.Multidimensional_Array.Task4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int[][] arr;

        System.out.print("Write n: ");
        n = scanner.nextInt();
        arr = new int[n][n];

        for (int i = 0; i < n; i++){

            for(int j= 0; j < n; j++){

                if(i % 2 == 0) arr[i][j] = j + 1;
                else arr[i][j] = n - j;

                System.out.print(arr[i][j]);

            }

            System.out.println();

        }

    }

}
