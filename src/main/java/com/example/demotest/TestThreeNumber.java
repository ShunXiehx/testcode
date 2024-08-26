package com.example.demotest;

import java.util.ArrayList;
import java.util.List;

public class TestThreeNumber {
    public static final int end = Integer.MAX_VALUE;
    public static final int start = end - 100;

    public static void main(String[] args) {
        int count = 0;
        System.out.println(end);
        System.out.println(start);

        for (int i=start; i < end; i++) {
            System.out.println("---------" + i);
            System.out.println(start);
            count++;
            System.out.println(count);
        }
        System.out.println(count);
    }
}
