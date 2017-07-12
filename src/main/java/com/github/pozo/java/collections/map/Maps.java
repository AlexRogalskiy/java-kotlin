package com.github.pozo.java.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        lazyMap();
    }

    static void lazyMap() {
        Map<String, List<Integer>> map = new HashMap<>();
        final ArrayList<Integer> integers = new ArrayList<>();
        integers.add(32);
        map.put("aaa", integers);

        final String key = "aaa";
        final int value = 2;

        if (!map.containsKey(key)) {
            ArrayList<Integer> listOfValues = new ArrayList<>();
            listOfValues.add(value);
            map.put(key, listOfValues);
        } else {
            map.get(key).add(value);
        }
        System.out.println(map);
    }

}
