package com.company;
enum Gender {
    BOY,
    GIRL
}

public class Person {
    private Gender gender;

     Person(Gender gender) {
        this.gender = gender;
    }

     Gender getGender() {
        return gender;
    }

}
