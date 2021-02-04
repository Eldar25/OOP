package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

            File file = new File("C:\\OOP\\lab6.2\\src\\com\\company\\scores.txt");

            BufferedReader sc = new BufferedReader(new FileReader(file));
            ArrayList <Student> array = new ArrayList<Student>();

            String st;
            int maxScore = 0;
            int minScore = 100;
            int avgScore = 0;

            while ((st = sc.readLine()) != null) {
                String[] arr = st.split(" ");
                String name = arr[0];
                String surname = arr[1];
                int points = Integer.parseInt(arr[2]);
                maxScore = Math.max(maxScore, points);
                minScore = Math.min(minScore, points);
                avgScore = avgScore+points;

                array.add(new Student(name, surname, points));
            }

            File file1 = new File("C:\\OOP\\lab6.2\\src\\com\\company\\grades.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file1));

            for (Student s:array) {
                s.setMaxScore(maxScore);
                writer.write(s.toString() + "\n");
                writer.newLine();
            }
            writer.write("Max score = " + maxScore +"\n");
            writer.newLine();
            writer.write("Min score = " + minScore+"\n");
            writer.newLine();
            avgScore = avgScore/array.size();
            writer.write("Avg score = " + avgScore+"\n");

            writer.close();

            sc.close();






































    }
}
