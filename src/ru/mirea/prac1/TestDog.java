package ru.mirea.prac1;
import java.lang.*;

    public class TestDog {
        public static void main(String[] args) {
            Dog dog1 = new Dog("Oki",5, "Poodle");
            Dog dog2 = new Dog("Gaf", 8,"Dachshund");
            Dog dog3 = new Dog("Leek",13,"Siberian husky");
            dog3.setAge(1);
            System.out.println(dog1);
            System.out.println(dog2);
            System.out.println(dog3);
        }
    }