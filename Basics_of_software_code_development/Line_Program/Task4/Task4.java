package epam.Training_Java_Epam.Basics_of_software_code_development.Line_Program.Task4;

/*
4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
 */

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double r;

        System.out.print("Введите число:");

        r = scanner.nextDouble();
        r = Math.rint(r) / 1000 + (r - (int)r) * 1000;

        System.out.println();
        System.out.printf("R=%8.3f",r);

    }
}
