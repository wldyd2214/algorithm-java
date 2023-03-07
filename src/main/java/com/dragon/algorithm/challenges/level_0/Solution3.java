package com.dragon.algorithm.challenges.level_0;

import lombok.extern.slf4j.Slf4j;

/**
 * title   : 연속된 수의 합
 * level    : LV.0
 * url  : https://school.programmers.co.kr/learn/courses/30/lessons/120923
 *
 * 등차 수열의 합 공식을 응용하여 문제를 풀이
 *
 */
@Slf4j
public class Solution3 {
    public int[] solution(int num, int total) {

        int[] answer = new int[num];

        int nSum = num * (1 + num) / 2;
        int start = (total - nSum) / num;
        log.info("start => " + start);

        for(int i = 1; i <= num; i++){
            answer[i - 1] = i + start;
        }

        return answer;
    }
}
