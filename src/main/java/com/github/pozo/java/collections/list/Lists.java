package com.github.pozo.java.collections.list;

import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        listOf_withIndex_onEach_filter();
    }

    public static void listOf_withIndex_forEach() {
        List<String> list = Arrays.asList("aaa", "bbb");

        list.forEach(System.out::println);
    }

    public static void listOf_withIndex_onEach_filter() {
        List<String> list = Arrays.asList("aaa", "bbb");

        list.stream()
                .map(it -> it.substring(2))
                .filter(it -> it.startsWith("a"))
                .forEach(System.out::println);
    }
}
