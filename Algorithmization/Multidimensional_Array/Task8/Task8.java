package epam.Training_Java_Epam.Algorithmization.Multidimensional_Array.Task8;

/*
В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        int r1,r2,n,m,buffer;
        int arr[][];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write rows and columns: ");
        n = scanner.nextInt();
        m = scanner.nextInt();
        arr = new int[n][m];

        System.out.print("Write r1 and r2: ");
        r1 = scanner.nextInt() - 1;
        r2 = scanner.nextInt() - 1;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){

                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j]);

            }

            System.out.println();

        }

        System.out.println("________________________");

        //swap colums
        for(int i = 0; i < n; i++){

            buffer = arr[i][r1];
            arr[i][r1] = arr[i][r2];
            arr[i][r2] = buffer;

        }

        for(int i = 0; i < n; i++){

            for(int j = 0; j < m; j++){

                System.out.print(arr[i][j]);

            }

            System.out.println();

        }

    }

}
