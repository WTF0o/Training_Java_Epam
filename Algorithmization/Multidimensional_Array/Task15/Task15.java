package company.Training_Java_Epam.Algorithmization.Multidimensional_Array.Task15;

public class Task15 {

    public static void main(String[] args) {

        final int SIZE_ARRAY = 5;
        int max = 0;
        int arr[][] = new int[SIZE_ARRAY][SIZE_ARRAY];

        System.out.println("Source array: ");

        for(int i = 0; i < SIZE_ARRAY; i++){

            for(int j = 0; j < SIZE_ARRAY; j++){

                arr[i][j] = (int) (Math.random() * 10);
                if (max < arr[i][j]) max = arr[i][j];
                System.out.print(arr[i][j] + "\t");

            }

            System.out.println();

        }

        System.out.println("\n" + "Result array: ");


        for (int i = 0; i < SIZE_ARRAY; i++) {

            for (int j = 0; j < SIZE_ARRAY; j++) {

                if (arr[i][j] % 2 != 0) {
                    arr[i][j] = max;
                }
                System.out.print(arr[i][j] + "\t");

            }

            System.out.println();

        }

    }

}
