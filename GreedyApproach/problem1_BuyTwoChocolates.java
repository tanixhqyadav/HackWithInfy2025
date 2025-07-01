import java.util.*;
public class problem1_BuyTwoChocolates {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 4, 5};
        int money = 7;
        System.out.println(maxChocolates(prices, money));
    }

    public static int maxChocolates(int[] prices, int money) {
        int n = prices.length;
        if (n < 2) return 0;

        // Sort the prices
        java.util.Arrays.sort(prices);

        if (prices[0] + prices[1] <= money) {
            return 2; // Can buy two chocolates
        } else {
            return 0; // Cannot buy two chocolates
        }
    }
}