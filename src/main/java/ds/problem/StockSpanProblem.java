package ds.problem;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] stockPrices = new int[]{100, 80, 60, 70, 60, 75, 85};
        System.out.println(Arrays.toString(bruteForceApproach(stockPrices)));
        System.out.println(Arrays.toString(stackApproach(stockPrices)));
    }

    private static int[] bruteForceApproach(int[] stockPrices) {
        int[] stockSpan = new int[stockPrices.length];
        for (int i = 0; i < stockPrices.length; i++) {
            int span = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (stockPrices[j] < stockPrices[i]) {
                    span++;
                }
            }
            stockSpan[i] = span;
        }
        return stockSpan;
    }

    private static int[] stackApproach(int[] stockPrices) {
        int[] stockSpan = new int[stockPrices.length];
        stockSpan[0] = 1;
        Deque<Integer> stockStack = new ArrayDeque<>();
        stockStack.push(0);
        for (int i = 1; i < stockPrices.length; i++) {
            while (!stockStack.isEmpty() && stockPrices[stockStack.peek()] <= stockPrices[i]) {
                stockStack.pop();
            }
            stockSpan[i] = stockStack.isEmpty() ? i + 1 : i - stockStack.peek();
            stockStack.push(i);
        }
        return stockSpan;
    }
}
