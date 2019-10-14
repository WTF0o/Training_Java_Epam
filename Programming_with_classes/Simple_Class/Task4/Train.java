package epam.Training_Java_Epam.Programming_with_classes.Simple_Class.Task4;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class Train implements Comparable<Train> {

    private int numberTrain;
    private GregorianCalendar departureTime;
    private String destination;

    public Train(int numberTrain, GregorianCalendar departureTime, String destination) {
        this.numberTrain = numberTrain;
        this.departureTime = departureTime;
        this.destination = destination;
    }

    public Train() { }

    public String getInfoTrain(int numberTrain){

        return "Number train " + numberTrain + ", destination " + destination
                + ", departure time " + departureTime.getTime();

    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public GregorianCalendar getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(GregorianCalendar departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public static Train[] sortingByNumberTrain(Train[] trains){

        Train buf;

        for(int i = 0; i < trains.length; i++)
            for(int j = 0; j < trains.length - 1; j++)
                if(trains[j].numberTrain > trains[j + 1].numberTrain){

                    buf = trains[j];
                    trains[j] = trains[j + 1];
                    trains[j + 1] = buf;

                }

        return trains;

    }

    public static Train[] sortingByDestination(Train[] trains){

        Arrays.sort(trains);
        return trains;

    }

    public int compareTo(Train train) {

        int result = this.destination.compareTo(train.destination);
        if(result == 0) result = this.departureTime.compareTo(train.departureTime);
        return result;

    }

}
