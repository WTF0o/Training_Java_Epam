package company.Training_Java_Epam.Basics_of_software_code_development.Cycles.Task7;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        int n,m,count;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n и m: ");

        n = scanner.nextInt();
        m = scanner.nextInt();

        for (;n<m;n++){

            count=0;
            System.out.printf("Делители для числа %d: ",n);

            for (int i=1;i<n;i++){

                if(n%i==0 && i!=1 && n!=i) {
                    count++;
                    System.out.print(i + " ");
                }

            }

            if(count == 0)
                System.out.print("Для данного числа нет делителя");

            System.out.println();

        }

    }
}
