package com.datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExamples {
    public static void main(String[] args) {
        //creating of an array list
        ArrayList<String> cats = new ArrayList<>();
        cats.add("Nancy");
        cats.add("Darcy");
        cats.add("Meatball");
        cats.add("Chichi");
        System.out.println(cats);

        Collections.shuffle(cats);
        System.out.println(cats);

        Collections.sort(cats);
        System.out.println(cats);
        System.out.println(cats.get(3));

       cats.remove(2);
       cats.set(1, "Kotka");
       cats.set(2, "Mishka");
       cats.set(2, "Minka");
       Collections.sort(cats);
        System.out.println(cats);
    }
}
