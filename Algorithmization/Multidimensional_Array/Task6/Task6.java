package epam.Training_Java_Epam.Algorithmization.Multidimensional_Array.Task6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        int[][] arr;

        System.out.print("Write n: ");
        n = scanner.nextInt();
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i < n - i){

                    if (i <= j && j < (n - i)) arr[i][j] = 1;
                    else arr[i][j] = 0;
                    System.out.print(arr[i][j]);

                }
                else{

                    if (i >= j && j >= ((n - 1) - i )) arr[i][j] = 1;
                    else arr[i][j] = 0;
                    System.out.print(arr[i][j]);

                }

            }

            System.out.println();

        }
    }

}

