package ru.mirea.prac1;
import java.lang.*;

public class Book {
    private String name;
    private String type;
    private int number;
    private int pages;

    public Book(String n, int p, String t, int w) {
        name = n;
        pages = p;
        type = t;
        number = w;
    }

    public Book(String n, String t,int w) {
        name = n;
        pages = 0;
        type = t;
        number = w;
    }

    public Book() {
        name = "Error";
        pages = 0;
        type = "Error";
        number = 0;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType(String type) {
        return type;
    }
    public void setName(int number) {
        this.number = number;
    }

    public int getPages() {
        return pages;
    }
    public int getnumber(int number) { return number; }

    public String toString() {
        return this.name + ", pages " + this.pages + ", type " + this.type+ " number: " +this.number;
    }
}