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
        int money = 30;

        Solution solution = new Solution();
        solution.solution(tickets, roll, shop, money);
    }

    public int solution(String[] tickets, int roll, String[][] shop, int money) {
        int answer = 0;

        Map<String, Integer> ticketPrices = new HashMap<>();

        for (String ticket : tickets) {
            String name = ticket.trim().substring(0, ticket.length() - 1);
            int price = Integer.parseInt(ticket.trim().substring(ticket.length() - 1));
            ticketPrices.put(name, price);
        }

        for (String[] display : shop) {
            int totalPrice = getTotalCost(display, ticketPrices);
            if (totalPrice <= money) {
                answer += totalPrice / roll;
                money -= totalPrice;
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