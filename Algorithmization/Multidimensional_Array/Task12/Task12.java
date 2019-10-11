package epam.Training_Java_Epam.Algorithmization.Multidimensional_Array.Task12;

public class Task12 {

    public static void main(String[] args) {

        final int SIZE_ARRAY = 5;
        int buf;
        int arr[][] = new int[SIZE_ARRAY][SIZE_ARRAY];

        for(int i = 0; i < SIZE_ARRAY; i++){

            for(int j = 0; j < SIZE_ARRAY; j++){

                arr[i][j] = (int) (Math.random() * 15);
                System.out.print(arr[i][j] + "\t");

            }

            System.out.println();

        }

        System.out.println("\n" + "ascending order: ");

        for (int k = 0; k < SIZE_ARRAY; k++) {

            for (int i = 0; i < SIZE_ARRAY; i++) {

                for (int j = 0; j < SIZE_ARRAY - 1; j++) {

                    if (arr[i][j] < arr[i][j + 1]) {
                        buf = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = buf;
                    }

                }


            }

        }


        for(int i = 0; i < SIZE_ARRAY; i++){

            for(int j = 0; j < SIZE_ARRAY; j++)
                System.out.print(arr[i][j] + "\t");

            System.out.println();

        }

        System.out.println("\n" + "descending order: ");


        for (int k = 0; k < SIZE_ARRAY; k++) {

            for (int i = 0; i < SIZE_ARRAY; i++) {

                for (int j = 0; j < SIZE_ARRAY - 1; j++) {

                    if (arr[i][j] > arr[i][j + 1]) {
                        buf = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = buf;
                    }

                }


            }

        }


        for(int i = 0; i < SIZE_ARRAY; i++){

            for(int j = 0; j < SIZE_ARRAY; j++)
                System.out.print(arr[i][j] + "\t");

            System.out.println();

        }
    }

}
