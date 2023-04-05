package com.dragon.algorithm.challenges.level_0;

import lombok.extern.slf4j.Slf4j;

/**
 * title   : 잘라서 배열로 저장하기
 * level    : LV.0
 * url  : https://school.programmers.co.kr/learn/courses/30/lessons/120913
 *
 *
 */
@Slf4j
public class Solution6 {
    public String[] solution(String my_str, int n) {

        int num = my_str.length() / n;

        if((my_str.length() % n) > 0){
            num = num + 1;
        }

        String[] answer = new String[num];
        StringBuffer sb = new StringBuffer(my_str);

        for(int i = 0; i < num; i++){

            int delNum = sb.length();

            if(sb.length() >= n) {
                delNum = n;
            }

            answer[i] = sb.substring(0, delNum);
            sb.delete(0, delNum);
        }

        return answer;
    }
}
