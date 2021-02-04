package com.company;

public class Time {
    public int hours;
    public int minutes;
    public int seconds;

    public Time(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String toUniversal()
    {
        String str = "";
        if(hours < 24 && minutes < 60 && minutes > 9 && seconds < 60 && seconds > 9)
        {
            str = (hours + ":" + minutes + ":" + seconds);
        }
        else if(hours < 24 && minutes <= 9 && minutes > 0 && seconds <=9 && seconds > 0)
        {
            str = (hours + ":0" + minutes + ":0" + seconds);
        }
        else str ="Invalid";
        return str;
    }

    public String toStandard()
    {
        String str = "";
        if(hours < 24 && hours > 12 && minutes < 60 && minutes > 9 && seconds < 60 && seconds > 9)
        {
            str = (hours-12 + ":" + minutes + ":" + seconds + "PM");
        }
        else if(hours < 24 && hours > 12 && minutes <= 9 && minutes > 0 && seconds > 0 && seconds <= 9)
        {
            str = ("Standard Time " + (hours-12) + ":0" + minutes + ":0" + seconds + "PM");
        }
        else if(hours < 24 && hours < 12 && minutes < 60 && minutes > 9 && seconds < 60 && seconds > 9)
        {
            str = (hours + ":" + minutes + ":" + seconds + "AM");
        }
        else if(hours < 24 && hours < 12 && minutes <= 9 && minutes > 0 && seconds > 0 && seconds <= 9)
        {
            str = (hours + ":0" + minutes + ":0" + seconds + "AM");
        }
        else str = "Invalid";
        return str;
    }
}
