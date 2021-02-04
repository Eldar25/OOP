package com.company;

import java.io.Serializable;
import java.util.Objects;


    public class Instructor implements Serializable {
        private String firstName;
        private String lastName;
        private String department;
        private String email;

        public Instructor() {

        }

        public Instructor(String firstName, String lastName, String department, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.department = department;
            this.email = email;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (!(o instanceof Instructor))
                return false;
            Instructor ins = (Instructor) o;
            if (!this.firstName.equals(ins.firstName))
                return false;
            if (!this.lastName.equals(ins.lastName))
                return false;
            if (!this.department.equals(ins.department))
                return false;
            if (!this.email.equals(ins.email))
                return false;
            return true;
        }

        public int hashCode() {
            return Objects.hash(firstName, lastName, department, email);
        }

        public String toString() {
            return firstName + " " + lastName + " " + department + " " + email;
        }
    }

