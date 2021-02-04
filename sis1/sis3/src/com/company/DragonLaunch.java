package com.company;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> launchStudents;

    public DragonLaunch() {
        launchStudents = new Vector<Person>();
    }

    public void kidnap (Person p) {
        launchStudents.addElement(p);
    }

    public boolean willDragonEatOrNot() {
        int cnt = 0;
        for (int i = 0; i < launchStudents.size(); i++) {
            if (launchStudents.get(i).getGender() == Gender.BOY)
                cnt++;
            else
                cnt--;
            if (cnt < 0)
                return true;
        }
        return cnt != 0;

    }
}
