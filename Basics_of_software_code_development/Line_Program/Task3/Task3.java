package epam.Training_Java_Epam.Basics_of_software_code_development.Line_Program.Task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double result,x,y;

        System.out.print("Введите x,y: ");
        x=scanner.nextInt();
        y=scanner.nextInt();


        result=((Math.sin(x) + Math.cos(y) / Math.cos(x) - Math.sin(y))) * Math.tan((x*y));

        System.out.println();
        System.out.print("result=" + result);

    }
}
