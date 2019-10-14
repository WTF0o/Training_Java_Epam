package epam.Training_Java_Epam.Programming_with_classes.Simple_Class.Task3;

/*
3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {

        Student[] students = new Student[10];

        for(int i = 0; i < students.length; i++){

            students[i] = new Student();
            students[i].setFio("Test");
            students[i].setNumberGroup(i);

            int[] assessments = new int[5];
            for (int j = 0; j < 5; j++){
                assessments[j] = (int) (Math.random() * 100);
            }
            students[i].setProgress(assessments);

        }

        ArrayList<Student>  excellentStudents = Student.findExcellentStudents(students);
        for (Student excellentStudent: excellentStudents)
            System.out.println("Excellent student " + excellentStudent.getFio() + " group " + excellentStudent.getNumberGroup());

    }


}
