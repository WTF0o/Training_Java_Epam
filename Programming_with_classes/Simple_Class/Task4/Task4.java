package epam.Training_Java_Epam.Programming_with_classes.Simple_Class.Task4;

/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */

import java.util.GregorianCalendar;

public class Task4 {

    public static void main(String[] args) {

        Train[] trains = new Train[5];

        System.out.println("All trains: ");
        for (int i = 0; i < 5; i++){

            trains[i] = new Train
                    ((int) (Math.random() * 10),new GregorianCalendar(2019,10,11,(int) (Math.random() * 10),0,0)
                    ,"Station " + (int) (Math.random() * 10));
            System.out.println(trains[i].getInfoTrain(trains[i].getNumberTrain()));
        }

        trains = Train.sortingByNumberTrain(trains);
        System.out.println("\nSorted by number: ");
        for (int i = 0; i < 5; i++){
            System.out.println(trains[i].getInfoTrain(trains[i].getNumberTrain()));
        }

        trains = Train.sortingByDestination(trains);
        System.out.println("\nSorted by destination: ");
        for (int i = 0; i < 5; i++){
            System.out.println(trains[i].getInfoTrain(trains[i].getNumberTrain()));
        }


    }

}
