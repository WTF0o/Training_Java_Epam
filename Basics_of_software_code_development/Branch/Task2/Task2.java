package epam.Training_Java_Epam.Basics_of_software_code_development.Branch.Task2;

/*
2. Найти max{min(a, b), min(c, d)}.
 */

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a,b,c,d;
        double minAB,minCD;

        System.out.print("Введите a,b: ");

        a = scanner.nextDouble();
        b = scanner.nextDouble();

        System.out.print("Введите c,d: ");

        c = scanner.nextDouble();
        d = scanner.nextDouble();

        minAB=(a > b ? b : a);
        minCD=(c > d ? d : c);

        System.out.print("Max:" + (minAB > minCD ? minAB : minCD));



    }
}
