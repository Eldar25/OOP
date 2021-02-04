package com.company;

import java.io.Serializable;
import java.util.Objects;


    public class Course implements Serializable {
        private String title;
        private Textbook textbook;
        private Instructor instructor;

        public Course() {

        }

        public Course(String title, Textbook textbook, Instructor instructor) {
            this.title = title;
            this.textbook = textbook;
            this.instructor = instructor;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Textbook getTextbook() {
            return textbook;
        }

        public void setTextbook(Textbook textbook) {
            this.textbook = textbook;
        }

        public Instructor getInstructor() {
            return instructor;
        }

        public void setInstructor(Instructor instructor) {
            this.instructor = instructor;
        }

        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (!(o instanceof Instructor))
                return false;
            Course c = (Course) o;
            if (!this.title.equals(c.title))
                return false;
            if (!this.textbook.equals(c.textbook))
                return false;
            if (!this.instructor.equals(c.instructor))
                return false;
            return true;
        }

        public int hashCode() {
            return Objects.hash(title, textbook, instructor);
        }

        public String toString() {
            return title + " " + textbook + " " + instructor;
        }
    }


