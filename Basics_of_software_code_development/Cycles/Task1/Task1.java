package epam.Training_Java_Epam.Basics_of_software_code_development.Cycles.Task1;

/*
1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.print("Введите число: ");
        number = scanner.nextInt();
        for (int i=1;i < number;i++)
            sum+=i;

        System.out.print("Сумма: " + sum);

    }
}
