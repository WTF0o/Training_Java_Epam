package epam.Training_Java_Epam.Basics_of_software_code_development.Branch.Task3;

/*
3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x1,y1,x2,y2,x3,y3;
        boolean result;

        System.out.print("Введите x1,y1: ");

        x1 = scanner.nextInt();
        y1 = scanner.nextInt();

        System.out.print("Введите x2,y2: ");

        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        System.out.print("Введите x3,y3: ");

        x3 = scanner.nextInt();
        y3 = scanner.nextInt();

        result = (x1 - x3) / (x2 - x3) == (y1 - y3) / (y2 - y3);  //Формула

        System.out.print((result == true ? "Координаты лежат на одной прямой" : "Координаты лежат не на одной прямой"));
    }
}
