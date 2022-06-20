package com.synisys.List;

public interface MyList<T> {
    void add(T obj);

    void add(int index, T obj);

    void set(int index, T obj);

    T get(int index);

    void remove(int index);

    void remove(T obj);

    int size();
}
