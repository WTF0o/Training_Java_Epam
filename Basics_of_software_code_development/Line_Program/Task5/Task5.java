package epam.Training_Java_Epam.Basics_of_software_code_development.Line_Program.Task5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int time,hour,min,sec;

        System.out.print("Введите число:");

        time = scanner.nextInt();
        hour = time / 3600;
        min = (time - hour*3600) / 60;
        sec = (time - hour*3600) - min * 60;

        System.out.println();
        System.out.printf("%d час(а/ов), %d минут(ы), %d секунд(ы)",hour,min,sec);
    }
}
