package com.company;

enum Gender {
    BOY,
    GIRL
}

public class Person {
    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }
}
