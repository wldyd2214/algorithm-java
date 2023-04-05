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

@Slf4j
public class Solution6Test {

    Solution6 solution6;

    @BeforeEach
    protected void setUp() throws Exception {
        solution6 = new Solution6();
    }

    @ParameterizedTest
    @CsvSource(value={"abc1Addfggg4556b, 6, 'abc1Ad, dfggg4, 556b'", "abcdef123, 3, 'abc, def, 123'"})
    public void testSolution(String my_str, int n, @ConvertWith(StringArrayConverter.class) String[] result) {
        //given
        //when
        String[] answer = solution6.solution(my_str, n);
        log.info("answer => " + Arrays.toString(answer));
        log.info("result => " + Arrays.toString(result));

        //then
        assertArrayEquals(result, answer);
    }
}
