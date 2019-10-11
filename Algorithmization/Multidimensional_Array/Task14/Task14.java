package epam.Training_Java_Epam.Algorithmization.Multidimensional_Array.Task14;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        int buf,n,m,cout;
        int arr[][];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write n and m: ");
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[n][m];

        for(int i = 0; i < n; i++){

            cout = 0;

            for(int j = 0; j < m; j++){

                if (cout < i + 1){
                arr[j][i] = 1;
                ++cout;}
                else arr[j][i] = 0;

            }

        }


        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){

                System.out.print(arr[i][j]);

            }

            System.out.println();

        }


    }

}
