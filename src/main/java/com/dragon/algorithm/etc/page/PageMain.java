package com.dragon.algorithm.etc.page;

import java.util.List;

/*
 * 대량 데이터 DB에 저장하는 경우
 * 해당 알고리즘을 통해 count 단위로 분할 요청을 넣어 볼 수 있겠다.
 */

public class PageMain {
    public static void main(String[] args) {

        // 대량 데이터 생성
        PageData pageData = new PageData();
        List<String> array = pageData.makeTestArray(5432);

        // 한번에 조회할 개수
        int count = 1000;
        // 페이지 수
        int page = array.size() / count;
        // 잔여 데이터
        int remain = array.size() % count;
        // 커서
        int cursor = 0;

        // 페이지 데이터 출력
        for (int i = 1; i <= page; i++) {
            int limit = i * count - 1;
            System.out.print("cursor => " + cursor + ", limit => " + limit);
            System.out.print(" | ");
            System.out.println("array => start : " + array.get(cursor) + ", end : " + array.get(limit));
            cursor += count;
        }

        // 나머지 데이터 출력
        if (remain > 0) {
            System.out.print("cursor => " + cursor + ", limit => " + array.size());
            System.out.print(" | ");
            System.out.println("array => start : " + array.get(cursor) + ", end : " + array.get(array.size() - 1));
        }
    }
}
