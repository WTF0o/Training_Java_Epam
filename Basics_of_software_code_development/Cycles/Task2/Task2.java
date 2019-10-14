package epam.Training_Java_Epam.Basics_of_software_code_development.Cycles.Task2;

/*
Вычислить значения функции на отрезке [а,b] c шагом h:
y = (x,x > 2
    (-x,x ⩽ 2
 */

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a,b,h;

        System.out.println("Введите начало и конец отрезка");
        System.out.print("A = ");
        a = scanner.nextInt();

        System.out.print("B = ");
        b = scanner.nextInt();

        System.out.print("Введите шаг вычисления значений функции H = ");
        h = scanner.nextInt();

        for (int i = a; i <= b ; i+=h) {
            if(i>2){
                System.out.print(i + " ");
            } else{
                System.out.print(-i + " ");
            }

        }

    }
}
