package epam.Training_Java_Epam.Algorithmization.Unidimensional_Array.Task8;

/*
Дана последовательность целых чисел a1,a2 .. an.
Образовать новую последовательность, выбросив из исходной те члены, которые равны
min( a1,a2 ... an )
 */

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] masSource,masResult;
        int n,coincidences = 0 ,min = 0;

        System.out.print("Введите n: ");
        n = scanner.nextInt();
        masSource = new int[n];

        System.out.println("Исходный массив:");
        for (int i = 0 ; i < masSource.length;i++){

            masSource[i] = (int) (Math.random() * 10);
            if(i == 0) min = masSource[0];
            else if(min > masSource[i]) min = masSource[i];
            System.out.print("\t" + masSource[i]);

        }

        //Ищем количество повторяющихся элементов
        for (int i = 0 ; i < masSource.length;i++)
            if(min == masSource[i]) coincidences++;

        masResult = new int[n - coincidences];
        System.out.println("\n" + "Финальный массив: ");
        for (int i = 0 , g = 0; i < masSource.length;i++){

           if (min != masSource[i]) {

               masResult[g] = masSource[i];
               System.out.print("\t" + masResult[g]);
               g++;

           }

        }

    }
}
