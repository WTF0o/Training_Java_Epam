package epam.Training_Java_Epam.Basics_of_software_code_development.Line_Program.Task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double a,b,c,z;


        System.out.print("Введите a,b,c: ");
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();

        z=((a - 3) * b / 2) + c;

        System.out.println();
        System.out.print("z=" + z);


    }
}
