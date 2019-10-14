package epam.Training_Java_Epam.Basics_of_software_code_development.Cycles.Task5;

/*
5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:
an = 1/2n + 1/3n
 */

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        double e,a = 0;
        int n,number = 2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write n: ");
        n = scanner.nextInt();

        System.out.print("Write e: ");
        e = scanner.nextDouble();

        while (a <= e){

            a += Math.abs(1 / Math.pow(number,n));
            ++number;
            System.out.println(a);

        }

    }

}
