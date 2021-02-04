package com.company;
import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException,NullPointerException {

        try {
            File file =new File("ne.txt");
            if(!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            for(int i = 0 ; i < 3; i++) {
                pw.println("lol");
            }
            pw.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
