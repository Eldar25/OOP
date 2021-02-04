package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager(2, "Asan", 78, 2001, "TTT");
        HashSet<Employee> h = new HashSet<Employee>();
        Vector<Employee> manager1 = new Vector<Employee>();
        Employee Asan = new Employee("Asan", 78, 2001, "TTT");
        Employee Tima = new Employee("Tima", 39, 2001, "KKK");
        Employee Roma = new Employee("Roma", 23, 2001, "AAA");
        Employee Sanya = new Employee("Sanya", 24, 2001, "EEE");
        h.add(Asan);
        h.add(Tima);
        h.add(Roma);
        h.add(Sanya);
        manager1.add(Asan);
        manager1.add(Tima);
        manager1.add(Roma);
        manager1.add(Sanya);
        Iterator<Employee> i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        for (int j = 0; j < manager1.size(); j++) {
            System.out.println(manager1.get(j));
        }
        // write your code here
    }
}
