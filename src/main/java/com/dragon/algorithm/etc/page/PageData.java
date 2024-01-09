package com.dragon.algorithm.etc.page;

import java.util.ArrayList;
import java.util.List;

public class PageData {
    public List<String> makeTestArray(int makeSize) {

        List<String> testArray = new ArrayList<>();

        for (int i = 0; i < makeSize; i++) {
            testArray.add(String.valueOf(i));
        }

        return testArray;
    }
}
