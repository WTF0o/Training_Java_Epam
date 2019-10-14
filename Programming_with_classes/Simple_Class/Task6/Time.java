package epam.Training_Java_Epam.Programming_with_classes.Simple_Class.Task6;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time() {

    }

    public Time(int hours, int minutes, int seconds) {

        if(hours < 24) this.hours = hours;
        else this.hours = 0;

        if(minutes < 60) this.minutes = minutes;
        else this.minutes = 0;

        if(seconds < 60) this.seconds = seconds;
        else this.seconds = 0;

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {

        if(hours < 24) this.hours = hours;
        else this.hours = 0;

    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {

        if(minutes < 60) this.minutes = minutes;
        else this.minutes = 0;

    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {

        if(seconds < 60) this.seconds = seconds;
        else this.seconds = 0;

    }

    public void addHours(int addedHours){

        if(hours + addedHours < 24) hours = hours + addedHours;
        else{

            int factor = (hours + addedHours) / 24;
            hours = (hours + addedHours) - 24 * factor;

        }

    }

    public void addMinutes(int addedMinutes){

        if(minutes + addedMinutes < 60) minutes = minutes + addedMinutes;
        else{

            int addedHours = (int) (Math.floor(minutes + addedMinutes)/60);
            addHours(addedHours);
            minutes = (minutes + addedMinutes) - 60 * addedHours;

        }

    }

    public void addSeconds(int addedSeconds){

        if(seconds + addedSeconds < 60) seconds = seconds + addedSeconds;
        else{

            int addedMinutes = (int) (Math.floor(seconds + addedSeconds)/60);
            addMinutes(addedMinutes);
            seconds = (seconds + addedSeconds) - 60 * addedMinutes;

        }

    }


}
