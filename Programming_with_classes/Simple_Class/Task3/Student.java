package epam.Training_Java_Epam.Programming_with_classes.Simple_Class.Task3;

import java.util.ArrayList;

public class Student {

    private String fio;
    private int numberGroup;
    private int[] progress = new int[5];

    public Student(String fio, int numberGroup, int[] progress) {
        this.fio = fio;
        this.numberGroup = numberGroup;
        this.progress = progress;
    }

    public Student() {}

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public int[] getProgress() {
        return progress;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }

    public static ArrayList<Student> findExcellentStudents(Student[] students){

        ArrayList<Student> excellentStudentsList = new ArrayList<>();

        for (Student student:students) {
            boolean excellentStudent = true;

            for (int assessment:student.progress)
                if(assessment < 9){

                    excellentStudent = false;
                    break;

                }

            if(excellentStudent)
                excellentStudentsList.add(student);

        }

        return excellentStudentsList;

    }

}
