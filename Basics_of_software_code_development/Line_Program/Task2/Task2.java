package epam.Training_Java_Epam.Basics_of_software_code_development.Line_Program.Task2;

/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
((𝑏 + √𝑏²+4ac) / 2a) -  𝑎³𝑐 + 𝑏−²
 */
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double a,b,c,z;

        System.out.print("Введите a,b,c: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();

        z=((b + Math.sqrt(Math.pow(b,2) + 4 * a * c) )/ 2 * a) - Math.pow(a,3) * c + Math.pow(b,-2);

        System.out.println();
        System.out.print("z=" + z);

    }
}
