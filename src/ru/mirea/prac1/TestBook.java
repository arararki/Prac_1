package ru.mirea.prac1;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Twenty Thousand Leagues Under the Sea",244 , "Science fiction", 1);
        Book book2 = new Book("Alice in Wonderland", 208,"Fantasy", 34);
        System.out.println(book1);
        System.out.println(book2);
    }
}