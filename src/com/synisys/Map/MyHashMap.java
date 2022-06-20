package com.synisys.Map;

import java.util.Collections;
import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Vahe");
        hashMap.put(2, "Gagik");
        hashMap.put(1, "vsfsf");
        System.out.println(hashMap);
    }
}
