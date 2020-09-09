package ru.mirea.prac1;
import java.lang.*;

public class Dog {
    private String name;
    private String breed;
    private int age;
    public Dog(String n, int a, String b){
        name = n;
        age = a;
        breed = b;
    }
    public Dog(String n, String b){
        name = n;
        age = 0;
        breed = b;
    }
    public Dog(){
        name = "";
        age = 0;
        breed = "";
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public void setBreed(String breed) {this.breed = breed; }
    public String getBreed(String breed) {return breed; }
    public int getAge() {return age; }
    public String toString(){
        return this.name+", age "+this.age+", breed "+this.breed; }
}