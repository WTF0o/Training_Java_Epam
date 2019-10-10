package company.Training_Java_Epam.Programming_with_classes.Simple_Class.Task3;

public class Task3 {

    public static void main(String[] args) {

        Student[] students = new Student[10];

        for(int i = 0; i < students.length; i++){

            students[i] = new Student();
            int[] a = new int[5];
            students[i].setFio("Test");
            students[i].setNumberGroup(i);

            for (int j = 0; j < 5; j++){
                a[j] = (int) (Math.random() * 100);
            }
            students[i].setProgress(a);

        }

        Student.printStudents(students);

    }


}
