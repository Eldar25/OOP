package com.company;

import java.io.*;
import java.util.*;

public class Main {
     static Vector names = new Vector();
     static Vector Logs = new Vector();
     static HashMap<String,String> nameandloginT = new HashMap<>();
    static HashMap<String,String> nameandloginS = new HashMap<>();


    public static void main(String[] args) throws IOException, ClassNotFoundException{
        enter();
    }

    public static  void enter()throws FileNotFoundException,IOException, ClassNotFoundException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Intranet");
        System.out.println("1)Student");
        System.out.println("2)Employee");
        System.out.println("3)Admin");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if(s.equals("Admin" )|| s.equals("3")){
            adminf();
        }else if(s.equals("Student")|| s.equals("1")){
            studentf();
        }else if(s.equals("Employee") || s.equals("2")){
            employeef();
        }else{
            System.out.println("try again!");
            System.out.println("choose from list!");
        }
    }

    public static void studentf()throws FileNotFoundException,IOException, ClassNotFoundException,NullPointerException{
        File folder = new File("C:\\OOP\\progect\\src\\com\\company\\StudentsLog");
        Scanner in = new Scanner(System.in);
        System.out.println("Write login");
        String login1 = in.next();
        String login = login1+".txt";
        int cnt = 0;
        for (File file : folder.listFiles())
        {
            if(login.equals(file.getName())){
                cnt++;
            }

            //System.out.println(file.getName());
        }

        //System.out.println(cnt);
        if(cnt == 0){
            System.out.println("login does not exist");
            System.out.println("1)Try again");
            System.out.println("2)back");
            String ac = in.next();
            if(ac.equals("1")||ac.equals("Try again")){
                studentf();
            }else{
                enter();
            }
        }
        System.out.println("Write password");
        String password = in.next();

        String adminfile = "C:\\OOP\\progect\\src\\com\\company\\StudentsLog\\"+login1+".txt";
        File file = new File(adminfile);
        Scanner filereader = new Scanner(file);
        String line = filereader.nextLine();
        String[] arr = line.split(" ");
        //System.out.println(arr[0]);
        //System.out.println(login1 + " " + password);
        if(login1.equals(arr[0])&& password.equals(arr[1])){
            //System.out.println("Yes");
            studentaction(login1);
        }else{
            System.out.println("error");
            System.out.println("try again");
            studentf();
        }
    }
    public static void studentaction(String login)throws FileNotFoundException,IOException, ClassNotFoundException,NullPointerException{

        Scanner in = new Scanner(System.in);
        Set<String> logins = nameandloginS.keySet();
        String names = nameandloginS.get(login);
        System.out.println(names);
        System.out.println("1)registerForCourse");
        System.out.println("2)viewTranscript");
        System.out.println("3)viewCourse");
        System.out.println("4)viewInfoAboutTeacher");
        System.out.println("5) back");
        String s = in.nextLine();
        if(s.equals("1")){
            File folder = new File("C:\\OOP\\progect\\src\\com\\company\\Courses");
            for (File file : folder.listFiles()){
                System.out.println(file.getName());
            }
            System.out.println("Choose course and write name of course without '.txt'");
            String nameofcourse = in.next();
            String nameofcoursetxt = nameofcourse +".txt";
            int cnt = 0;
            for (File file : folder.listFiles()){
                if(nameofcoursetxt.equals(file.getName())){
                    cnt++;
                }
            }
            if(cnt >= 1){
                String coursefile = "C:\\OOP\\progect\\src\\com\\company\\Courses\\"+nameofcourse+".txt";
                File file = new File(coursefile);
                Scanner filereader = new Scanner(file);
                String line = filereader.nextLine();
                String[] arr = line.split(" ");
                File studentpath = new File("\\OOP\\progect\\src\\com\\company\\StudentsCourse\\"+ login+".txt");
                try {
                    FileWriter writer = new FileWriter(studentpath);
                    writer.write(arr[0] + " " +arr[1] +" " +arr[2] );
                    writer.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
                System.out.println("New course was added");
                System.out.println("1)back or 2)exit");
                String s1 = in.next();
                if(s1.equals("1") || s1.equals("back")){
                    teacheractionf();
                }else{
                    enter();
                }
            }
            System.out.println("Course does not exist");
            studentaction(login);
        }else if(s.equals("2")){

        }else if(s.equals("3")){
            File folder = new File("C:\\OOP\\progect\\src\\com\\company\\Courses");
            for (File file : folder.listFiles()){
                System.out.println(file.getName());
            }
        }else if(s.equals("4")){
            System.out.println("Write name of Teacher");
            String nameofteacher = in.next();
            File fileTeacher = new File("C:\\OOP\\progect\\src\\com\\company\\Teachers\\"+nameofteacher+".txt");
            Scanner sc = new Scanner(fileTeacher);
            String line = sc.nextLine();
            sc.close();

            System.out.println(line);

        }else if(s.equals("5")){
            studentf();
        }else{
            System.out.println("No action");
            System.out.println("Try again");
            studentaction(login);
        }


    }


    public static void employeef()throws FileNotFoundException,IOException, ClassNotFoundException{
        Scanner in = new Scanner(System.in);
        System.out.println("1)Teacher");
        System.out.println("2)Manager");
        System.out.println("3)TechSup");
        String s = in.next();

        if(s.equals("1") || s.equals("Teacher") ){
            teacheractionf();
        }else if(s.equals("2") || s.equals("Manager")){
            managerf();
        }else if(s.equals("3") || s.equals("TechSup")){

        }else{
            System.out.println("error");
            System.out.println("try again");
            employeef();
        }


    }
    public static void managerf()throws ClassNotFoundException,IOException, ClassNotFoundException,NullPointerException{
        File folder = new File("C:\\OOP\\progect\\src\\com\\company\\ManagerLog");
        Scanner in = new Scanner(System.in);
        System.out.println("Write login");
        String login1 = in.next();
        String login = login1+".txt";
        int cnt = 0;
        for (File file : folder.listFiles())
        {
            if(login.equals(file.getName())){
                cnt++;
            }

            //System.out.println(file.getName());
        }

        //System.out.println(cnt);
        if(cnt == 0){
            System.out.println("login does not exist");
            System.out.println("1)Try again");
            System.out.println("2)back");
            String ac = in.next();
            if(ac.equals("1")||ac.equals("Try again")){
                managerf();
            }else{
                employeef();
            }
        }
        System.out.println("Write password");
        String password = in.next();

        String adminfile = "C:\\OOP\\progect\\src\\com\\company\\ManagerLog\\"+login1+".txt";
        File file = new File(adminfile);
        Scanner filereader = new Scanner(file);
        String line = filereader.nextLine();
        String[] arr = line.split(" ");
        //System.out.println(arr[0]);
        //System.out.println(login1 + " " + password);
        if(login1.equals(arr[0])&& password.equals(arr[1])){
            //System.out.println("Yes");
            manageraction(login1);
        }else{
            System.out.println("error");
            System.out.println("try again");
            teacheractionf();
        }
    }
    public static void manageraction(String login)throws ClassNotFoundException,IOException, ClassNotFoundException{
        Manager manager = new Manager();
        Scanner in = new Scanner(System.in);
        System.out.println("1)viewInfoStudents");
        System.out.println("2)viewInfoTeachers");
        System.out.println("3)Add News");
        System.out.println("4) back");
        String s = in.nextLine();
        if(s.equals("1")){
            manager.viewStudentInfo();
            System.out.println("1)back or 2)exit");
            String s1 = in.next();
            if(s1.equals("1") || s1.equals("back")){
                manageraction(login);
            }else{
                enter();
            }
        }else if(s.equals("2")){
            manager.viewTeacherInfo();
            System.out.println("1)back or 2)exit");
            String s1 = in.next();
            if(s1.equals("1") || s1.equals("back")){
                manageraction(login);
            }else{
                enter();
            }
        }else if(s.equals("3")){
            Vector nw = new Vector();
            System.out.println("Write faculty:");
            String faculty = in.next();

            System.out.println("Write new (to finish write end)");
            ArrayList<String> strings = new ArrayList<String>();

            String word ="";
            while (true){
                 word = in.next();
                if(word.equals("end")){
                    break;
                }
                strings.add(word);
                word= "";

            }

            try {
                File file =new File("C:\\OOP\\progect\\src\\com\\company\\News\\"+faculty+".txt");
                if(!file.exists())
                    file.createNewFile();
                PrintWriter pw = new PrintWriter(file);
                for(String x:strings){
                    pw.print(x+" ");
                }
                pw.close();
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("1)back or 2)exit");
            String s1 = in.next();
            if(s1.equals("1") || s1.equals("back")){
                manageraction(login);
            }else{
                enter();
            }
        }else if(s.equals("4")){
            managerf();
        }else{
            System.out.println("No action");
            System.out.println("Try again");
            manageraction(login);
        }
    }

    public static void teacheractionf()throws FileNotFoundException, IOException, ClassNotFoundException,NullPointerException{
        File folder = new File("C:\\OOP\\progect\\src\\com\\company\\TeacherLog");
        Scanner in = new Scanner(System.in);
        System.out.println("Write login");
        String login1 = in.next();
        String login = login1+".txt";
        int cnt = 0;
        for (File file : folder.listFiles())
        {
            if(login.equals(file.getName())){
                cnt++;
            }

            //System.out.println(file.getName());
        }

        //System.out.println(cnt);
        if(cnt == 0){
            System.out.println("login does not exist");
            System.out.println("1)Try again");
            System.out.println("2)back");
            String ac = in.next();
            if(ac.equals("1")||ac.equals("Try again")){
                teacheractionf();
            }else{
                employeef();
            }
        }
        System.out.println("Write password");
        String password = in.next();

        String adminfile = "C:\\OOP\\progect\\src\\com\\company\\TeacherLog\\"+login1+".txt";
        File file = new File(adminfile);
        Scanner filereader = new Scanner(file);
        String line = filereader.nextLine();
        String[] arr = line.split(" ");
        //System.out.println(arr[0]);
        //System.out.println(login1 + " " + password);
        if(login1.equals(arr[0])&& password.equals(arr[1])){
             //System.out.println("Yes");
            teacheraction(login1);
        }else{
            System.out.println("error");
            System.out.println("try again");
            teacheractionf();
        }
    }
    public static void teacheraction(String login)throws IOException, ClassNotFoundException {
        Teacher teacher = new Teacher();
        Scanner in = new Scanner(System.in);
        System.out.println("1)addCourse");
        System.out.println("2)viewStudentInfo");
        System.out.println("3)putMarks");
        System.out.println("4)sendOrder");
        System.out.println("4)addCoursesFile");
        System.out.println("5)Back");
        String s = in.nextLine();
        if(s.equals("1")|| s.equals("addCourse")){
            String name = nameandloginT.get(login);
            teacher.addCourse(name);
            System.out.println("you added new course");
            System.out.println("1)back or 2)exit");
            String s1 = in.next();
            if(s1.equals("1") || s1.equals("back")){
                teacheractionf();
            }else{
                enter();
            }
        }else if(s.equals("2")||s.equals("viewStudentInfo")){
            System.out.println(teacher.viewStudentInfo());
            System.out.println("1)back or 2)exit");
            String s1 = in.next();
            if(s1.equals("1") || s1.equals("back")){
                teacheractionf();
            }else{
                enter();
            }

        }else if(s.equals("3") || s.equals("putMarks")){
            teacher.putMarks();
            System.out.println("1)back or 2)exit");
            String s1 = in.next();
            if(s1.equals("1") || s1.equals("back")){
                teacheractionf();
            }else{
                enter();
            }


        }else if(s.equals("4")|| s.equals("sendOrder")){
            teacher.sendOrder();
            System.out.println("1)back or 2)exit");
            String s1 = in.next();
            if(s1.equals("1") || s1.equals("back")){
                teacheractionf();
            }else{
                enter();
            }

        }else if(s.equals("5")||s.equals("Back")){
            teacheractionf();
        }
        else{
            System.out.println("Try again");
            teacheraction(login);
        }

    }

    public static void adminf()throws FileNotFoundException ,IOException , ClassNotFoundException{
        String adminfile = "C:\\OOP\\progect\\src\\com\\company\\adminfile.txt";
        Scanner in = new Scanner(System.in);
        File file = new File(adminfile);
        Scanner filereader = new Scanner(file);
        String line = filereader.nextLine();
        String[] arr = line.split(" ");
        filereader.close();
        System.out.println("Write login and password ");
        String log = in.next();
        String pass = in.next();
        if(log.equals(arr[0])&& pass.equals(arr[1])){
            // System.out.println("Yes");
            adminAction();
        }else{
            System.out.println("error");
            System.out.println("try again");
            adminf();
        }
    }
    public static void adminAction() throws IOException ,ClassNotFoundException{
        Scanner in = new Scanner(System.in);
        Admin admin = new Admin();
        System.out.println("1) addUser");
        System.out.println("2) removeUser");
        System.out.println("3) seeLogin");
        System.out.println("4) back");
        String action = in.next();
        if(action.equals("addUser")){
            System.out.println("1) Student");
            System.out.println("2) Teacher");
            System.out.println("3) Manager");
            String typeOfUser = in.next();
            if(typeOfUser.equals("Student")){
                createStudent();

            }else if(typeOfUser.equals("Teacher")){
                createTeacher();

            }else if(typeOfUser.equals("Manager")){
                createManager();

            }
        }else if(action.equals("removeUser")){
            removeStudent();
            System.out.println("1)back or 2)exit");
            String s1 = in.next();
            if(s1.equals("1") || s1.equals("back")){
                adminAction();
            }else{
                enter();
            }
        }else if(action.equals("seeLogin")){
            admin.seeLog(Logs);
            System.out.println("1)back or 2)exit");
            String s1 = in.next();
            if(s1.equals("1") || s1.equals("back")){
                adminAction();
            }else{
                enter();
            }

        }else if(action.equals("back") || action.equals("4")){
            enter();
        }
        else{
            System.out.println("unidentified action!");
            System.out.println("try again");

            adminAction();
        }

    }
    public static void createManager()throws FileNotFoundException,IOException,ClassNotFoundException,NullPointerException{
        Scanner in = new Scanner(System.in);
        System.out.println("Write new Login:");
        String newlogin = in.next();
        System.out.println("Write new password:");
        String newpassword = in.next();
        File file = new File("C:\\OOP\\progect\\src\\com\\company\\ManagerLog\\"+newlogin+".txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(newlogin + " " + newpassword + " " + ";");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Write name:");
        String name = in.next();

        File fileTeachers= new File("C:\\OOP\\progect\\src\\com\\company\\Managers\\"+name+".txt");
        try {
            FileWriter writer = new FileWriter(fileTeachers);
            writer.write(name + " ");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("do you want to 1)back or 2)go out ");
        String ch = in.next();
        if(ch.equals("back") || ch.equals("1") ){
            adminAction();
        }else{
            enter();
        }
    }

    public static void createTeacher()throws FileNotFoundException,IOException,ClassNotFoundException,NullPointerException{
        Scanner in = new Scanner(System.in);
        System.out.println("Write new Login:");
        String newlogin = in.next();
        System.out.println("Write new password:");
        String newpassword = in.next();
        File file = new File("C:\\OOP\\progect\\src\\com\\company\\TeacherLog\\"+newlogin+".txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(newlogin + " " + newpassword + " " + ";");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Write name:");
        String name = in.next();
        System.out.println("Write subject:");
        String subject = in.next();
        nameandloginT.put(name,newlogin);
        File fileTeachers= new File("C:\\OOP\\progect\\src\\com\\company\\Teachers\\"+name+".txt");
        try {
            FileWriter writer = new FileWriter(fileTeachers);
            writer.write(name + " "+subject);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("do you want to 1)back or 2)go out ");
        String ch = in.next();
        if(ch.equals("back") || ch.equals("1") ){
            adminAction();
        }else{
            enter();
        }
    }

    public static void removeStudent()throws IOException ,ClassNotFoundException{
        Admin admin =new Admin();
        admin.removeUser(names , Logs);
        adminAction();
    }

    public static void createStudent()throws FileNotFoundException,IOException,ClassNotFoundException,NullPointerException{
        Scanner in = new Scanner(System.in);
        Admin admin = new Admin();
        System.out.println("Write new Login:");
        String newlogin = in.next();
        System.out.println("Write new password:");
        String newpassword = in.next();
        admin.addUser(newlogin,newpassword);
        System.out.println("User was added ");
        System.out.println("Write name:");
        String name = in.next();
        System.out.println("Write surname:");
        String surname = in.next();
        System.out.println("Write id like (18BD111365):");
        String id = in.next();
        System.out.println("Write faculty:");
        String faculty = in.next();
        System.out.println("Write specialty:");
        String specialty = in.next();
        System.out.println("Write yearofstudy:");
        String yearofstudy = in.next();

        names.addElement(name);
        Logs.addElement(newlogin);
        nameandloginS.put(name,newlogin);
        //System.out.println(names.toString() + " " + Logs.toString());
        File fileStudent = new File("C:\\OOP\\progect\\src\\com\\company\\Students\\"+name+".txt");
        Student student = new Student( name , surname ,  id ,  faculty, specialty,  yearofstudy);
        admin.addUserStudent(student);
        try {
            FileWriter writer = new FileWriter(fileStudent);
            writer.write(name + " "+surname + " "+id   + " "+faculty+ " "+specialty+ " "+yearofstudy);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("do you want to 1)back or 2)go out ");
        String ch = in.next();
        if(ch.equals("back") || ch.equals("1") ){
            adminAction();
        }else{
            enter();
        }
    }

}
