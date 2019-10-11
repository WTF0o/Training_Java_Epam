package epam.Training_Java_Epam.Algorithmization.Multidimensional_Array.Task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] mas;
        int n, m, k, p;

        System.out.print("Введите количество строк: ");
        n = scanner.nextInt();
        System.out.print("Введите количество колонок: ");
        m = scanner.nextInt();
        mas = new int[n][m];

        System.out.print("Введите какую строку вывести: ");
        k = scanner.nextInt();
        System.out.print("Введите какую колоноку вывести: ");
        p = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            for (int g = 0; g < m; g++) {

                mas[i][g] = (int) (Math.random() * 10);
                System.out.print("\t" + mas[i][g]);

            }
            System.out.println();
        }

        System.out.println("\n" + "Строка: ");


        for (int i = k-1; i < k; i++) {

            for (int g = 0; g < m; g++) {

                System.out.print("\t" + mas[i][g]);

            }
        }

        System.out.println("\n" + "Колонка: ");

        for (int i = p-1; i < p; i++) {

            for (int g = 0; g < n; g++) {

                System.out.print("\t" + mas[g][i]);

            }
        }
    }
}
