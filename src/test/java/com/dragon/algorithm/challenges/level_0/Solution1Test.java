package com.dragon.algorithm.challenges.level_0;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class Solution1Test {

    Solution1 solution1;

    @BeforeEach
    protected void setUp() throws Exception {
        solution1 = new Solution1();
    }

    @Test
    public void testSolution() {
        //given
        String[] babbling1 = { "aya", "yee", "u", "maa", "wyeoo" };
        String[] babbling2 = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };

        //when
        int result1 = solution1.solution(babbling1);
        log.info("babbling1 Result => " +  solution1.solution(babbling1));
        int result2 = solution1.solution(babbling2);
        log.info("babbling2 Result => " +  solution1.solution(babbling2));

        //then
        assertEquals(1, result1);
        assertEquals(3, result2);
    }
}
