package epam.Training_Java_Epam.Basics_of_software_code_development.Branch.Task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        short a,b;

        System.out.print("Введите два угла: ");

        a = scanner.nextShort();
        b = scanner.nextShort();

        if(180 - (a + b) > 0)
            System.out.print((180 - (a + b) == 90 ? "Треугольник прямоугольный" : "Треугольник непрямоугольный"));
        else
            System.out.print("Это не треугольник!");

    }
}
