package com.synisys.Comporator;

import java.util.Comparator;

public class NameComporator implements Comparator<Human_Comparable> {
    @Override
    public int compare(Human_Comparable o1, Human_Comparable o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
