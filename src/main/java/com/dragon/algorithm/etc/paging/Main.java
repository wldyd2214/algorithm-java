package com.dragon.algorithm.etc.paging;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> array = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            array.add(String.valueOf(i));
        }

        int cursor = 3;
        int page = array.size() / cursor;

        int skip = 0;

        for (int i = 1; i <= page; i++) {
            System.out.println("skip => " + skip + ", limit => " + i * cursor);
            skip += cursor;
        }

        if (array.size() % cursor > 0) {
            System.out.println("skip => " + skip + ", limit => " + array.size());
        }
    }
}
