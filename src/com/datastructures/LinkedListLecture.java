package com.datastructures;

import java.util.LinkedList;

public class LinkedListLecture {
    public static void main(String[] args) {
        LinkedList<String> flowers = new LinkedList<>();
        flowers.add("Violet");
        flowers.add("Daisy");
        flowers.add("Orchid");
        System.out.println(flowers);
        boolean exists = flowers.contains("Orchids");
        flowers.addLast("Poppy");
        System.out.println(flowers.size());
        System.out.println(flowers);
        System.out.println(exists);

    }
}
