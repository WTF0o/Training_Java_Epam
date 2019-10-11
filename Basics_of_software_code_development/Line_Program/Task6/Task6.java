package epam.Training_Java_Epam.Basics_of_software_code_development.Line_Program.Task6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte x,y;
        boolean result=false;

        System.out.print("Введите x,y:");

        x = scanner.nextByte();
        y = scanner.nextByte();


        if ((y < 0) && (y >= -3)){

            if ((x <= 4) && (x >= -4))
                result = true;
        }
        else if (y >= 0){

            if ((x <= 2) && (x >= -2))
                result = true;

        }
        else
            result = false;

        System.out.print(result);

    }
}
