package com.dragon.algorithm.challenges.level_0;

import lombok.extern.slf4j.Slf4j;

/**
 * title   : 문자열 밀기
 * level    : LV.0
 * url  : https://school.programmers.co.kr/learn/courses/30/lessons/120921
 *
 *
 */
@Slf4j
public class Solution5 {
    public int solution1(String A, String B) {
        int answer = 0;

        StringBuffer sb = new StringBuffer(A);

        for(int i = 0; i <= A.length(); i++) {

            if(sb.toString().equals(B)) {
                return i;
            }

            sb.insert(0, sb.substring(sb.length() - 1, sb.length()));
            sb.delete(sb.length() - 1, sb.length());
        }

        return -1;
    }

    public int solution2(String A, String B) {
        String tempStr = B.repeat(3);
        return tempStr.indexOf(A);
    }
}
