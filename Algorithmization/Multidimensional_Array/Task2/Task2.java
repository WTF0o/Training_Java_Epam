package company.Training_Java_Epam.Algorithmization.Multidimensional_Array.Task2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] mas;
        int n, m;

        while (true) {

            System.out.print("Введите количество строк: ");
            n = scanner.nextInt();
            System.out.print("Введите количество колонок: ");
            m = scanner.nextInt();

            if (n == m) {

                mas = new int[n][m];

                for (int i = 0; i < n; i++) {

                    for (int g = 0; g < m; g++) {

                        mas[i][g] = (int) (Math.random() * 10);
                        System.out.print("\t" + mas[i][g]);

                    }
                    System.out.println();
                }

                System.out.println("______________________________");

                for (int i = 0; i < n; i++) {

                    for (int g = 0; g < m; g++) {

                        if (i == g) System.out.print("\t" + mas[g][i]);
                        else System.out.print("\t");

                    }
                    System.out.println();

                }
                break;
            }
            else System.out.println("Матрица не квадратная!");
        }
    }
}
