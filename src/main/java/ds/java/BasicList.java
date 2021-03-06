package ds.java;

import java.util.Objects;

public class BasicList<E> implements List<E> {
    private Node first;
    private Node last;
    private int nodeCount;

    public BasicList() {
        first = null;
        last = null;
        nodeCount = 0;
    }

    @Override
    public void add(E e) {
        Node node = new Node(e);
        if (Objects.isNull(first)) {
            first = node;
        } else {
            last.setNextNode(node);
        }
        last = node;
        nodeCount++;
    }

    @Override
    public void insert(E e, int position) {

        if (Objects.isNull(first) || position >= nodeCount) {
            throw new IllegalArgumentException("List is empty or position is incorrect");
        }
        Node currentNode = first;
        for (int i = 1; i < position; i++) {
            currentNode = currentNode.getNextNode();
        }

        Node newNode = new Node(e);
        Node nextNode = currentNode.getNextNode();
        currentNode.setNextNode(newNode);
        newNode.setNextNode(nextNode);
        nodeCount++;
    }

    @Override
    public E remove() {
        if (Objects.isNull(first)) {
            throw new IllegalStateException("List is empty");
        }
        Node node = first;
        first = first.getNextNode();
        nodeCount--;
        return node.getNodeItem();
    }

    @Override
    public E removeAt(int position) {
        if (Objects.isNull(first) || position >= nodeCount) {
            throw new IllegalArgumentException("List is empty or position is not correct");
        }
        Node currentNode = first;
        for (int i = 1; i < position; i++) {
            currentNode = currentNode.nextNode;
        }
        Node removeNode = currentNode.nextNode;
        currentNode.setNextNode(removeNode.getNextNode());
        nodeCount--;
        return removeNode.getNodeItem();
    }

    @Override
    public int size() {
        return nodeCount;
    }

    @Override
    public E get(int position) {
        if (Objects.isNull(first) || position >= nodeCount) {
            throw new IllegalArgumentException("List is empty or position is incorrect");
        }
        Node currentNode = first;
        for (int i = 1; i <= position; i++) {
            currentNode = currentNode.getNextNode();
        }
        nodeCount--;
        return currentNode.getNodeItem();
    }

    @Override
    public boolean find(E e) {
        if (Objects.isNull(first)) {
            return false;
        }
        Node currentNode = first;
        for (int i = 1; i < nodeCount; i++) {
            if (currentNode.getNodeItem().equals(e)) {
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        return false;
    }

    class Node {
        E nodeItem;
        Node nextNode;

        public Node(E nodeItem) {
            this.nodeItem = nodeItem;
        }

        public E getNodeItem() {
            return nodeItem;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }
}
