package epam.Training_Java_Epam.Algorithmization.Multidimensional_Array.Task9;

/*
9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */

public class Task9 {

    public static void main(String[] args) {

        final int SIZE_ARRAY = 5;
        int bufMax = 0, max = 0 , indexRowMax = 0;
        int arr[][] = new int[SIZE_ARRAY][SIZE_ARRAY];

        for(int i = 0; i < SIZE_ARRAY; i++){

            for(int j = 0; j < SIZE_ARRAY; j++){

                arr[i][j] = (int) (Math.random() * 10);
                System.out.print(arr[i][j]);

            }

            System.out.println();

        }

        for(int i = 0; i < SIZE_ARRAY; i++){

            for(int j = 0; j < SIZE_ARRAY; j++)
                bufMax += arr[j][i];


            if (max < bufMax){

                max = bufMax;
                indexRowMax = i;

            }

            bufMax = 0;

        }

        ++indexRowMax;
        System.out.println("Max column: " + indexRowMax + "\n" + "Count: " + max);

    }

}
