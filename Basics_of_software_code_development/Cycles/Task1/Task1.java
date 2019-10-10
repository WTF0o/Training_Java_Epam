package company.Training_Java_Epam.Basics_of_software_code_development.Cycles.Task1;

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
