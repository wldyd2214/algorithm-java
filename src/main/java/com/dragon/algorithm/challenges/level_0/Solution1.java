package com.dragon.algorithm.challenges.level_0;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * title   : 옹알이(1)
 * level    : LV.0
 * url  : https://school.programmers.co.kr/learn/courses/30/lessons/120956
 */
@Slf4j
public class Solution1 {

    String[] talks = { "aya", "ye", "woo", "ma" };

    public int solution(String[] babbling) {

        int answer = 0;

        for(String str : babbling){
            // if(str.matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
            //     answer++;
            // }

            for(String talk : talks){
                if(str.contains(talk)){
                    str = str.replace(talk, " ");
                }
            }

            if(str.trim().equals("")){
                answer++;
            }
        }

        return answer;
    }
}
