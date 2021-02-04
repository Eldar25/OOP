package com.company;

import java.io.Serializable;
import java.util.Objects;

public class Textbook implements Serializable {
    private int isbn;
    private String title;
    private String author;

    public Textbook() {

    }

    public Textbook(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Textbook))
            return false;
        Textbook tb = (Textbook) o;
        if (this.isbn != tb.isbn)
            return false;
        if (!this.title.equals(tb.title))
            return false;
        if (!this.author.equals(tb.author))
            return false;
        return true;
    }

    public int hashCode() {
        return Objects.hash(isbn, title, author);
    }

    public String toString() {
        return isbn + " " + title + " " + author;
    }
}
