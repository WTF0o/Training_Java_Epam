package company.Training_Java_Epam.Algorithmization.Multidimensional_Array.Task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] mas;
        int n, m;

        System.out.print("Введите количество строк: ");
        n = scanner.nextInt();
        System.out.print("Введите количество колонок: ");
        m = scanner.nextInt();
        mas = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int g = 0; g < m; g++) {

                mas[i][g] = (int) (Math.random() * 10);
                System.out.print("\t" + mas[i][g]);

            }
            System.out.println();
        }

        System.out.println("______________________________");

        for (int i = 0; i < m; i++) {

            if (mas[0][i] > mas[n-1][i]) {

                for (int g = 0; g < n; g++) {

                    System.out.print("\t" + mas[g][i]);

                }
                System.out.println();

            }
        }

    }
}
