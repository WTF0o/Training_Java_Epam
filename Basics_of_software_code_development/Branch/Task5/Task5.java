package epam.Training_Java_Epam.Basics_of_software_code_development.Branch.Task5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x;

        System.out.print("Введите x: ");
        x = scanner.nextInt();

        if(x <= 3)
            System.out.print("F(x)="+(Math.pow(x,2) - 3 * x + 9));
        else if(x>3)
            System.out.print("F(x)="+( 1 / (Math.pow(x,3) + 6)) );

    }
}
