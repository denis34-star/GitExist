package ru.geekbrains.lesson1.Dao;

public class Task3 {

    public  static void main (String[] args){
        System.out.println(test (5, 2));
        System.out.println(test (5, 5));
        System.out.println(test(5,10));
        System.out.println(test(5,15));
        System.out.println(test(5,20));
    }


    public  static boolean test (int a, int b){
        return (a + b >= 10) && (a + b <= 20);
    }
}
