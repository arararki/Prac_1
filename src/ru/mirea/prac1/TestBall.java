package ru.mirea.prac1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Green", 46, "Basketball");
        Ball b2 = new Ball("Red", 43, "Volleyball");
        Ball b3 = new Ball("Blue", 34,"Football");
        b1.setColor("Black");
        b3.setType("Basketball");
        b2.setSize(54);
        System.out.println(b1);
        System.out.println(b2);
    }
}