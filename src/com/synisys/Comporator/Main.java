package com.synisys.Comporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human_Comparable> list = new ArrayList<>();
        list.add(new Human_Comparable("A", 20));
        list.add(new Human_Comparable("B", 25));

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.toString());

        Collections.sort(list, new NameComporator());
        System.out.println(list.toString());
    }
}
