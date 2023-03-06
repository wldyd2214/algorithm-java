package com.dragon.algorithm.challenges.level_0;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class Solution2Test {

    Solution2 solution2;

    @BeforeEach
    protected void setUp() throws Exception {
        solution2 = new Solution2();
    }

    @Test
    public void testSolution() {
        //given
        int[] common1 = { 1, 2, 3, 4 };
        int[] common2 = { 2, 4, 8 };

        //when
        int result1 = solution2.solution(common1);
        log.info("common1 Result => " +  solution2.solution(common1));
        int result2 = solution2.solution(common2);
        log.info("common2 Result => " +  solution2.solution(common2));

        //then
        assertEquals(5, result1);
        assertEquals(16, result2);
    }
}
