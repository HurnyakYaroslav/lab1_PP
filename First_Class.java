package com.first_package;

public class First_Class {
    public int i;
    public char j;
    public static void main(String[] args){
        First_Class obj = new First_Class();
        System.out.print("змінна типу int: ");
        System.out.println(obj.i);
        System.out.print("змінна типу char: ");
        System.out.println(obj.j);
//!!!не виводить значення неініціалізованої змінної типу char
    }
}
