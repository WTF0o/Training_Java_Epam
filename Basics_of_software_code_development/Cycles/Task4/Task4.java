package epam.Training_Java_Epam.Basics_of_software_code_development.Cycles.Task4;

public class Task4 {

    public static void main(String[] args) {

        int sum=1;
        for(int i=1;i<200;i++)
            sum*=Math.pow(i,2);

        System.out.print("Сумма: "+sum);

    }
}
