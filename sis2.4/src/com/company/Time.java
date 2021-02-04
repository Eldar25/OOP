package com.company;

public class Time implements Comparable{
    int hour;
    int minute;
    int second;
    boolean universal;
    public Time() {}
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    boolean convert;
    public String toUniversal() {
        if (universal==false && convert==true) {
            hour+=12; convert =false;
        } universal = true;
        String outtime = "";
        outtime += hour < 10 ?  "0"+hour +":" : hour+":";
        outtime += minute < 10 ? "0"+minute+":": minute+":";
        outtime += second < 10 ? "0"+second: second+":";
        return outtime;
    }
    public String toStandard() {
        String outtime = "";
        universal = false;
        if (hour>12) {
            convert=true;
            hour-=12;
        }
        outtime += hour < 10 ?  "0"+hour +":" : hour+":";
        outtime += minute < 10 ? "0"+minute+":": minute+":";
        outtime += second < 10 ? "0"+second: second+":";
        if (convert==true) outtime+=" PM";
        else outtime+=" AM";
        return outtime;
    }
    public void Add(Time t2) {
        toUniversal();
        hour += t2.hour;
        if (second+t2.second >= 60) {
            minute += (t2.second+second)/60;
            second = (second+t2.second)%60;
        }else second+=t2.second;
        if (minute+t2.minute >= 60) {
            hour += (t2.minute+minute)/60;
            minute = (minute+t2.minute)%60;
        }else minute+=t2.minute;
        if (hour+t2.hour>=24)
            hour = hour -24;
    }

    public int compareTo(Object arg0) {
        Time t = (Time) arg0;
        if(this.hour > t.hour)
            return 1;
        else if (this.hour < t.hour)
            return -1;
        else {
            if (this.minute > t.minute)
                return 1;
            else if (this.minute < t.minute)
                return -1;
            else {
                if (this.second > t.second)
                    return 1;
                else if (this.second < t.second)
                    return -1;
            }
        }
        return 0;
    }
    public String toString() {
        return hour + " " + minute + " " + second;
    }
}