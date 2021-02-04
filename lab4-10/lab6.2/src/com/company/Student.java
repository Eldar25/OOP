package com.company;

public class Student {
    String name;
    String surname;
    int points;
    int maxScore;
    int minScore;
    int avgScore;

    Student(String name, String surname, int points) {
        this.name = name;
        this.surname = surname;
        this.points = points;
    }

    void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    String getPoints() {
        if (maxScore - 10 <= points) return "A";
        if (maxScore - 20 <= points) return "B";
        if (maxScore - 30 <= points) return "C";
        if (maxScore - 40 <= points) return "D";
        return "F";
    }
    @Override
    public String toString() {
        String points = getPoints();
        return name + " " + surname + " " + points;
    }
}
