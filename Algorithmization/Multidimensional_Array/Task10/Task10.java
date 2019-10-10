package company.Training_Java_Epam.Algorithmization.Multidimensional_Array.Task10;

public class Task10 {

    public static void main(String[] args) {

        final int SIZE_ARRAY = 4;
        int arr[][] = new int[SIZE_ARRAY][SIZE_ARRAY];

        for(int i = 0; i < SIZE_ARRAY; i++){

            for(int j = 0; j < SIZE_ARRAY; j++){

                arr[i][j] = -10 + (int) (Math.random() * 20);
                System.out.print(arr[i][j] + "\t");

            }

            System.out.println();

        }

        System.out.print("\n" + "positive numbers main dioganal: ");

        for(int i = 0; i < SIZE_ARRAY; i++){

            for(int j = 0; j < SIZE_ARRAY; j++) {

                if ((i == j && arr[i][j] >= 0) || (SIZE_ARRAY - i - 1  == j && arr[i][j] >= 0)) System.out.print(arr[i][j] + "\t");

            }

        }



    }

}
