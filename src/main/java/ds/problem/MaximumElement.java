package ds.problem;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Node> stack = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            switch (sc.nextInt()) {
                case 1:
                    int element = sc.nextInt();
                    max = Math.max(element, max);
                    Node node = new Node(element, max);
                    stack.push(node);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }

                    if (stack.isEmpty()) {
                        max = Integer.MIN_VALUE;
                    } else {
                        max = stack.peek().getMaxValue();
                    }
                    break;
                case 3:
                    System.out.println(stack.peek().getMaxValue());
                    break;
                default:
                    break;
            }
        }
    }
}

class Node {
    private final int value;
    private final int maxValue;

    public Node(int value, int maxValue) {
        this.value = value;
        this.maxValue = maxValue;
    }

    public int getValue() {
        return value;
    }

    public int getMaxValue() {
        return maxValue;
    }
}
