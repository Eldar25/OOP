package com.company;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String adminFile = "C:\\OOP\\lab6.1\\src\\com\\company\\admin.txt";
        String objectsFile = "C:\\OOP\\lab6.1\\src\\com\\company\\objects.txt";
        System.out.println(deHash(adminFile));
        init(adminFile, objectsFile);

    }

    static void init(String file, String objectsFile) throws IOException, ClassNotFoundException {
        ArrayList<Course> courses = new ArrayList<Course>();
        System.out.println("Welcome to the program!");
        System.out.println("Are you user or admin?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.equals("Admin")) {
            System.out.print("Enter the password: ");
            String pass = br.readLine();
            if (pass.equals(getPasswordHash(file))) {
                System.out.println("Successfully logged in as admin");
                adminLogin(file);
                while (true) {
                    System.out.println("Enter the title: ");
                    String title = br.readLine();
                    System.out.println("Enter instructor's first name: ");
                    String firstName = br.readLine();
                    System.out.println("Enter textbook title: ");
                    String bookTitle = br.readLine();
                    Course course = new Course();
                    Instructor instructor = new Instructor();
                    Textbook textbook = new Textbook();
                    textbook.setTitle(bookTitle);
                    instructor.setFirstName(firstName);
                    course.setTitle(title);
                    course.setInstructor(instructor);
                    course.setTextbook(textbook);
                    courses.add(course);
                    appendText(file, course);
                    System.out.println("Wanna add another course?");
                    String temp = br.readLine();
                    if (temp.equals("Yes"))
                        continue;
                    else if (temp.equals("No"))
                        break;
                }
                serialize(courses, objectsFile);
            }
            else
            {
                System.out.println("Incorrect password");
                System.exit(0);
            }
        }

        if(str.equals("User")) {
            System.out.println("Do you want to retrieve data?");
            if (br.readLine().equals("Yes")) {
                deserealize(objectsFile);

            }
        }
        br.close();
    }

    static String getPasswordHash(String filename) {
        BufferedReader reader;
        String hashPassword = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            reader.readLine();
            hashPassword  = reader.readLine().substring(10);
            reader.close();
        } catch (Exception e) {

        }
        return hashPassword;
    }

    static String deHash(String filename) {
        String temp = getPasswordHash(filename);
        String password = "";
        int k = 30;
        for (char x : temp.toCharArray()) {
            password += x + k;
            k += 3;
        }
        return password;
    }

    static void adminLogin(String filename) {
        try {
            File file = new File(filename);
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            String currentTime = formatter.format(date);
            br.write(currentTime + " admin logged into a system");
            br.newLine();
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void appendText(String filename, Course course) {
        try {
            File file = new File(filename);
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            String currentTime = formatter.format(date);
            br.write(currentTime + " admin added new course " + course.getTitle());
            br.newLine();
            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void serialize(ArrayList<Course> courses, String filename) {

        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject(courses);
            out.close();
            fos.close();
            System.out.println("Object(s) have been serialized");

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    static void deserealize(String filename) throws ClassNotFoundException {
        ArrayList<Course> tempArray = null;
        try {

            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            tempArray = (ArrayList<Course>) in.readObject();
            System.out.println(tempArray.size());
            in.close();
            file.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        for (Course course : tempArray) {
            System.out.println(course);
        }

    }

}
