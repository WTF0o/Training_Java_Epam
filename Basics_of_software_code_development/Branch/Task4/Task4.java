package company.Training_Java_Epam.Basics_of_software_code_development.Branch.Task4;

import java.io.Console;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x,y,z,a,b;


        System.out.print("Введите x,y,z: ");

        x = scanner.nextInt(); //Ширина кирпича
        y = scanner.nextInt(); //Высота кирпича
        z = scanner.nextInt(); //Длинна кирпича

        System.out.print("Введите A,B: ");

        a = scanner.nextInt(); //Высота отверстия
        b = scanner.nextInt(); //Ширина отверстия

        if ((a>=y && b>=x) || (a>=y && b>=z) || (a>=x && b>=z))
            System.out.print("Кирпич пройдет");
        else
            System.out.print("Кирпич не пройдет");


    }
}
