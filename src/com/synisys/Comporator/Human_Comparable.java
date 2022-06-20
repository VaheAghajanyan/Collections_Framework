package com.synisys.Comporator;

public class Human_Comparable implements Comparable<Human_Comparable>{

    private String name;
    private int age;

    public Human_Comparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Human_Comparable o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Human_Comparable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
