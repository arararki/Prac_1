package ru.mirea.prac1;

public class Ball {
    private String color;
    private int size;
    private String type;

    public Ball(String c, int s,String t) {
        this.color = c;
        this.size = s;
        this.type = t;
    }
    public Ball() {
        color = "Error";
        size = 0;
        type = "Error";
    }
    public void setColor(String c) { this.color = c; }
    public void setSize(int s) { this.size = s; }
    public void setType(String t) { this.type = t; }
    public String getColor() { return color; }
    public int getSize() { return size; }
    public String getType() { return type; }
    public String toString() { return "Color: " + this.color+", size: "+this.size+" Type: "+this.type; }
}