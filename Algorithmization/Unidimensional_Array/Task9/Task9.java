package company.Training_Java_Epam.Algorithmization.Unidimensional_Array.Task9;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] mas;
        int n,number,_number,_count = 0,count = 0;

        System.out.print("Введите n: ");
        n = scanner.nextInt();
        mas = new int[n];

        for (int i = 0; i < mas.length; i++){

            mas[i] =(int) (Math.random() * 10);
            System.out.print("\t" + mas[i]);

        }

        number = mas[0];
        for (int element:mas) {

            if(number == element) count++;

        }

        for (int i = 1; i < mas.length; i++){

            _number = mas[i];
            _count = 0;

            for (int element:mas) {

                if(_number == element) _count++;

            }

            if (_count > count){

                count = _count;
                number = _number;

            }
            else if (_count == count && _number < number){

                count = _count;
                number = _number;

            }

        }

        System.out.print("\n" + "Наиболее встречающее число: " + number);

    }
}
