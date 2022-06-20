package com.synisys.List;

import java.util.Arrays;

public class MyLinkedList {


    private Node head;
    private int size;

    private static class Node {
        private Node next;
        private int value;

        public Node(Integer value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IllegalArgumentException("Out of bounds");
        }
    }

    public void add(Integer value) {
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        this.size++;
    }

    public void add(Integer value, int index) {
        checkIndex(index);
        Node node = new Node(value);
        if (index == 0) {
            node.setNext(head);
            head = node;
        } else {
            int i = 0;
            Node temp = head;
            while (i != index) {
                temp = temp.getNext();
                i++;
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
    }

    public String toString() {
        int[] result = new int[this.size];
        int i = 0;
        Node temp = head;
        while (temp != null) {
            result[i++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    public Integer get(int index) {
        checkIndex(index);
        Node temp = head;
        int i = 0;
        while (i != index) {
            temp = temp.getNext();
            i++;
        }
        return temp.getValue();
    }

    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            head = head.getNext();
        } else {
            Node temp = head;
            int i = 0;
            while (i != index - 1) {
                temp = temp.getNext();
                i++;
            }
            Node deleting = temp.getNext();
            temp.setNext(deleting.getNext());
            deleting.setNext(null);
        }
        this.size--;
    }

    public void reverse() {
        int[] array = new int[this.size];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            array[i] = get(j);
        }
        int i = 0;
        while (i < this.size) {
            add(array[i], i);
            i++;
        }
    }
}
