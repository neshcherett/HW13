package com.tneshcheret;

public class Main {

    public static void main(String[] args) {
        IntList list = new IntList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(68);
        list.add(50);
        System.out.println(list.toString());
        System.out.println(list.get(2));
        list.set(2,100);
        System.out.println(list.toString());
        System.out.println(list.size());
    }
}
