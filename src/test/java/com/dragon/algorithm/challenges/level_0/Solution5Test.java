package com.dragon.algorithm.challenges.level_0;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@Slf4j
public class Solution5Test {

    Solution5 solution5;

    @BeforeEach
    protected void setUp() throws Exception {
        solution5 = new Solution5();
    }

    @Test
    public void testSolution() {
        //given
        String[] A = { "hello", "apple", "atat", "abc" };
        String[] B = { "ohell", "elppa", "tata", "abc" };
        int[] results = { 1, -1, 1, 0 };
        int[] answers1 = new int[4];
        int[] answers2 = new int[4];

        //when
        for(int i = 0; i < 4; i++){
            answers1[i] = solution5.solution1(A[i], B[i]);
            answers2[i] = solution5.solution2(A[i], B[i]);

        }

        //then
        assertArrayEquals(results, answers1);
        log.info("answers1 => " + Arrays.toString(answers1));
        assertArrayEquals(results, answers2);
        log.info("answers1 => " + Arrays.toString(answers2));
    }
}
