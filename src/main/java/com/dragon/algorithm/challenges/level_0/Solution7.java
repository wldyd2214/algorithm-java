package com.dragon.algorithm.challenges.level_0;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * title   : 7의 개수
 * level    : LV.0
 * url  : https://school.programmers.co.kr/learn/courses/30/lessons/120912
 *
 *
 */
@Slf4j
public class Solution7 {
    static final String LIKE_NUM = "7";
    public int solution(int[] array) {
        return (int) Arrays.stream(
                        Arrays.stream(array)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining())
                                .split("")
                )
                .filter(s -> s.equals(LIKE_NUM))
                .count();
    }
}
