package com.dragon.algorithm.challenges.level_0;

import com.dragon.algorithm.util.StringArrayConverter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class Solution7Test {

    Solution7 solution7;

    @BeforeEach
    protected void setUp() throws Exception {
        solution7 = new Solution7();
    }

    //array	result
    //[7, 77, 17]	4
    //[10, 29]	0

    @ParameterizedTest
    @CsvSource(value={"'7, 77, 17', 4", "'10, 29', 0"})
    public void testSolution(@ConvertWith(StringArrayConverter.class) String[] result, int n) {
        //given
        int[] array = Arrays.stream(result).mapToInt(Integer::parseInt).toArray();
        //when
        int answer = solution7.solution(array);

        //then
        assertEquals(answer, n);
        log.info("answer => " + answer);
    }
}
