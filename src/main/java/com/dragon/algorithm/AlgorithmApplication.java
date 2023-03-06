package com.dragon.algorithm;

import com.dragon.algorithm.challenges.level_0.Solution1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class AlgorithmApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Solution1 solution = new Solution1();

        String[] babbling1 = { "aya", "yee", "u", "maa", "wyeoo" };
        log.info("babbling1 Result => ",  solution.solution(babbling1));

        String[] babbling2 = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
        log.info("babbling2 Result => ",  solution.solution(babbling2));
    }
}
