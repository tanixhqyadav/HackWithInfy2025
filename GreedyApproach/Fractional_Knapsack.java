import java.util.*;
public class Fractional_KnapSack {
    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;
        double maxValue = fractionalKnapsack(values, weights, capacity);
        System.out.println("Maximum value in Knapsack = " + maxValue);
    }

    public static double fractionalKnapsack(int[] values, int[] weights, int capacity) {
        int n = values.length;
        double[][] ratio = new double[n][2];

        for (int i = 0; i < n; i++) {
            ratio[i][0] = (double) values[i] / weights[i]; // value/weight ratio
            ratio[i][1] = i; // index
        }

        // Sort by value/ ratio in descending order
        java.util.Arrays.sort(ratio, (a, b) -> Double.compare(b[0], a[0]));

        double totalValue = 0.0;

        for (int i = 0; i < n && capacity > 0; i++) {
            int index = (int) ratio[i][1];
            if (weights[index] <= capacity) {
                totalValue += values[index];
                capacity -= weights[index];
            } else {
                totalValue += ratio[i][0] * capacity; // Take the fraction of the item
                break;
            }
        }

        return totalValue;
    }
}