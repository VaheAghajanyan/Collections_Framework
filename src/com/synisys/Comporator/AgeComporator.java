package com.synisys.Comporator;

import java.util.Comparator;

public class AgeComporator implements Comparator<Human_Comparable> {
    @Override
    public int compare(Human_Comparable o1, Human_Comparable o2) {
        return o1.getAge() - o2.getAge();
    }
}
