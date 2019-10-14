package epam.Training_Java_Epam.Algorithmization.Multidimensional_Array.Task11;

/*
11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
 */

public class Task11 {

    public static void main(String[] args) {

        int arr[][] = new int[10][20];
        int countСoincidences = 0;

        for(int i = 0; i < 10; i++){

            for(int j = 0; j < 20; j++){

                arr[i][j] = (int) (Math.random() * 15);
                System.out.print(arr[i][j] + "\t");

            }

            System.out.println();

        }

        System.out.print("\n" + "index row: ");

        for(int i = 0; i < 10; i++){

            for(int j = 0; j < 20; j++) {

                if(arr[i][j] == 5) ++countСoincidences;

            }

            if(countСoincidences >= 3) System.out.print(i + 1 + " ");
            countСoincidences = 0;

        }

    }

}
