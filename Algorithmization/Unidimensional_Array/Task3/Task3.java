package company.Training_Java_Epam.Algorithmization.Unidimensional_Array.Task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

	int[] mas;
	int n,countZero=0,countPositive=countZero,countNegative=countZero;
	Scanner scanner = new Scanner(System.in);

	System.out.print("Введите N: ");
	n = scanner.nextInt();
	mas = new int[n];

	for (int i = 0;i < mas.length;i++) {

	    mas[i] = -10 + (int) (Math.random() * 20);

	    if (mas[i] > 0) countPositive++;
	    else if(mas[i] == 0) countZero++;
	    else countNegative++;

	    System.out.print("\t" + mas[i]);

    }

	System.out.print("\n" + "Количество отрицательных элементов: " + countNegative +
                     "\n" + "Количество положительных элементов: " + countPositive +
                     "\n" + "Количество нулевых элементов: " + countZero);

    }
}
