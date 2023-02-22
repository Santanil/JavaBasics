package org.example;

public interface Lib {
    static String getGreetig(){
        int hour=java.time.LocalTime.now().getHour();

        if(hour<12)
            return "Good morning";
        else if (hour<18)
            return "Good Afternoon";
        else
            return "Good Evening";
    }
}
