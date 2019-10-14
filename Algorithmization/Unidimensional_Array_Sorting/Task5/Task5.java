package epam.Training_Java_Epam.Algorithmization.Unidimensional_Array_Sorting.Task5;

/*
5. Сортировка вставками. Дана последовательность чисел a1,a2,...an.
Требуется переставить числа в порядке возрастания.
Делается это следующим образом.
Пусть a1,a2,...ai- упорядоченная последовательность, т. е. a1 ⩽a2 ⩽ an.
Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции
 */

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        int n;
        int[] arr;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write n: ");
        n = scanner.nextInt();
        arr = new int[n];

        System.out.println("Array: ");

        for (int i = 0; i < n; i++) {

            arr[i] = n - i;
            System.out.print(arr[i] + "\t");

        }

        sort(arr);


    }

    public static void sort(int[] arr) {

        int[] sortArr = new int[arr.length];

        for (int j = 0; j < arr.length; j++)
            for (int i = 0; i < arr.length - 1; i++) {



            }

    }

    public static void find(int[] sourceArr, int[] sortArr, int firstIndex, int lastIndex) {


    }

}
