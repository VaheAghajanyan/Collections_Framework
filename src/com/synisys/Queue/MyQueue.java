package com.synisys.Queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {

    private List<Integer> queue = new ArrayList<>();

    public void add (Integer E) {
        queue.add(E);
    }

    public void remove () {
        queue.remove(0);
    }

    public Integer peek () {
        return queue.get(0);
    }

}
