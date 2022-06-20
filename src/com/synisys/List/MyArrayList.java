package com.synisys.List;

public class MyArrayList<T> implements MyList<T> {
    private Object[] items;
    private int count;

    public MyArrayList() {
        this.items = new Object[5];
    }

    private void checkSize() {
        if (count == items.length) {
            Object[] newItems = new Object[this.count * 2];
            System.arraycopy(items, 0, newItems, 0, this.count);
            this.items = newItems;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.count) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void add(T obj) {
        checkSize();
        items[count++] = obj;
    }

    @Override
    public void add(int index, T obj) {
        checkIndex(index);
        checkSize();
        for (int i = count; i > index; i--) {
            items[i] = items[i - 1];
        }
        items[index] = obj;
        count++;
    }

    @Override
    public void set(int index, T obj) {
        checkIndex(index);
        items[index] = obj;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) items[index];
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < this.count; i++) {
            items[i] = items[i + 1];
        }
        this.count--;
    }

    @Override
    public void remove(Object obj) {
        for (int i = 0; i < count; i++) {
            if (items[i].equals(obj)) {
                remove(i);
            }
        }
    }

    @Override
    public int size() {
        return this.count;
    }

    public void printAll() {
        System.out.print("{ ");
        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                System.out.print(items[i]);
            } else System.out.print(items[i] + ", ");
        }
        System.out.print(" }");
    }
}
