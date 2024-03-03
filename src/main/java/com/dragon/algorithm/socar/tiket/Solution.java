package sample.cafekiosk.spring.api.controller.product;

import java.util.*;

class Ticket {
    private String name;
    private int price;

    public Ticket(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Shop {
    private List<String[]> displays;

    public Shop(List<String[]> displays) {
        this.displays = displays;
    }

    public List<String[]> getDisplays() {
        return displays;
    }
}

class Solution {

    public static void main(String[] args) {
        String[] tickets = { "A 1", "B 2", "C 5", "D 3" };
        int roll = 10;
        String[][] shop = { {"B", "C", "B", "C"}, {"A", "A", "A", "B"}, {"D", "D", "C", "D"} };
        int money = 100;

        Solution object = new Solution();

        System.out.println("출력 => " + object.solution(tickets, roll, shop, money));
    }

    public int solution(String[] tickets, int roll, String[][] shop, int money) {
        int answer = 0;

        Map<String, Integer> ticketPrices = new HashMap<>();

        // 티켓의 이름과 가격을 저장
        for (String ticket : tickets) {
            // trim 메소드 순서가 잘못 됨.
            // String name = ticket.trim().substring(0, ticket.length() - 1);
            String name = ticket.substring(0, ticket.length() - 1).trim();
            // trim 메소드가 없어도 됨.
            // int price = Integer.parseInt(ticket.trim().substring(ticket.length() - 1));
            int price = Integer.parseInt(ticket.substring(ticket.length() - 1));
            ticketPrices.put(name, price);
        }

        // 상점에서 골드 티켓을 살 수 있는 경우의 수를 계산
        for (String[] display : shop) {

            // 해당 상점에서 살 수 있는 상품의 totalCost 구함
            int totalCost = getTotalCost(display, ticketPrices);

            if (totalCost <= money) {
                answer += totalCost / roll;
                money -= totalCost;
            } else {
                int normalTicketCount = money / roll;
                answer += normalTicketCount;
                money -= normalTicketCount * roll;
            }
        }

        return answer;
    }

    private int getTotalCost(String[] display, Map<String, Integer> ticketPrices) {
        int totalCost = 0;
        for (String ticket : display) {
            totalCost += ticketPrices.get(ticket);
        }
        return totalCost;
    }
}