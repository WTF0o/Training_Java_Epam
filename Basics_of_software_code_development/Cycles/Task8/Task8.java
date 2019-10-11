package epam.Training_Java_Epam.Basics_of_software_code_development.Cycles.Task8;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n,m;
        StringBuilder strN = new StringBuilder();
        StringBuilder strM = new StringBuilder();

        System.out.print("Введите n и m: ");

        n = scanner.nextInt();
        m = scanner.nextInt();

        while (n>0 || m>0){

            if(n!=0) {

                strN.append(" " + n % 10);
                n/=10;

            }


            if(m!=0){

                strM.append(" "+m % 10);
                m/=10;

            }

        }

        strM.reverse();
        strN.reverse();

        System.out.print("n: "+strN+"\n"+"m: "+strM);

    }
}
