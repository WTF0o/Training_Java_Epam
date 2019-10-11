package epam.Training_Java_Epam.Algorithmization.Unidimensional_Array.Task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] mas;
        int n;
        int k;
        int sum=0;

        System.out.print("Введите размерность массива: ");
        n = scanner.nextInt();
        mas = new int[n];

        System.out.print("Введите число k: ");
        k = scanner.nextInt();

        System.out.print("Массив: ");

        for (int i=0;i<mas.length;i++){

            mas[i] =(int) (Math.random()*10);
            if(mas[i]%k==0)
                sum+=mas[i];
            System.out.print(mas[i]+" ");

        }

        System.out.printf("\n"+"Сумма элементов кратных %d = %d",k,sum);

    }
}
