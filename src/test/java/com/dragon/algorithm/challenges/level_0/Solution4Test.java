package com.dragon.algorithm.challenges.level_0;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class Solution4Test {

    Solution4 solution4;

    @BeforeEach
    protected void setUp() throws Exception {
        solution4 = new Solution4();
    }

    @Test
    public void testSolution() {
        //given
        int[] M = { 2, 2, 1 };
        int[] N = { 2, 5, 1 };
        int[] results = { 3, 9, 0 };
        int[] answers = new int[3];

        //when
        for(int i = 0; i < 3; i++){
            answers[i] = solution4.solution(M[i], N[i]);
            log.info("answers[i] => " +  answers[i]);
        }

        //then
        assertArrayEquals(results, answers);
    }
}
