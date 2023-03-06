package com.dragon.algorithm.challenges.level_0;

import lombok.extern.slf4j.Slf4j;

/**
 * title   : 다음에 올 숫자
 * level    : LV.0
 * url  : https://school.programmers.co.kr/learn/courses/30/lessons/120924
 */
@Slf4j
public class Solution2 {
    public int solution(int[] common) {
        int answer = 0;

        //등차수열
        if(common[1] - common[0] == common[2] - common[1]) {
            answer = common[common.length - 1] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }

        return answer;
    }
}
