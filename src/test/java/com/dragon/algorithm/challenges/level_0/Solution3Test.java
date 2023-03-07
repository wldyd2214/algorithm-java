package com.dragon.algorithm.challenges.level_0;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class Solution3Test {

    Solution3 solution3;

    @BeforeEach
    protected void setUp() throws Exception {
        solution3 = new Solution3();
    }

    @Test
    public void testSolution() {
        //given
        int num = 3;
        int totla = 12;
        int[] result = { 3, 4, 5 };

        //when
        int[] answer = solution3.solution(num, totla);
        log.info("answer => " +  Arrays.toString(answer));

        //then
        assertArrayEquals(result, answer);
    }
}
