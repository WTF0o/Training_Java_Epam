package company.Training_Java_Epam.Algorithmization.Unidimensional_Array.Task10;


import java.util.Arrays;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] mas;
        int n;
        boolean evenNumbers;

        System.out.print("Введите n: ");
        n = scanner.nextInt();
        mas = new int[n];

        System.out.println("Исходный массив");
        for (int i = 0; i < mas.length; i++){

            mas[i] = (int) (Math.random() * 10);
            System.out.print("\t" + mas[i]);

        }

        evenNumbers = (n % 2 == 0) ? true : false;

        //Удаляем каждый 2 элемент массива
        for (int i = 0, g = 0; i < mas.length; i+=2,g++)
            mas[g] = mas[i];
        mas = Arrays.copyOf(mas,(evenNumbers) ? mas.length / 2 : mas.length / 2 + 1  );

        //Добавляем 0 на место удаленных элементов
        mas = Arrays.copyOf(mas,(evenNumbers) ?  mas.length * 2: mas.length * 2 - 1 );
        System.out.println();
        for (int i:mas) {
            System.out.print("\t" + i);
        }
    }
}
