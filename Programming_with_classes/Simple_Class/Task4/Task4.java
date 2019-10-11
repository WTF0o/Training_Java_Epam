package epam.Training_Java_Epam.Programming_with_classes.Simple_Class.Task4;


import java.util.GregorianCalendar;

public class Task4 {

    public static void main(String[] args) {

        Train[] trains = new Train[5];

        System.out.println("All trains: ");
        for (int i = 0; i < 5; i++){

            trains[i] = new Train
                    ((int) (Math.random() * 10),new GregorianCalendar(2019,10,11,(int) (Math.random() * 10),0,0)
                    ,"Station " + (int) (Math.random() * 10));
            trains[i].getInfoTrain(trains[i].getNumberTrain());
        }

        trains = Train.sortNumberTrain(trains);
        System.out.println("\nSorted by number: ");
        for (int i = 0; i < 5; i++){
            trains[i].getInfoTrain(trains[i].getNumberTrain());
        }

        trains = Train.sortDestination(trains);
        System.out.println("\nSorted by destination: ");
        for (int i = 0; i < 5; i++){
            trains[i].getInfoTrain(trains[i].getNumberTrain());
        }


    }

}
