package ds.problem;

public class MergePointLinkedList {
    public static void main(String[] args) {

        SinglyLinkedListNode n1 = new SinglyLinkedListNode(1);
        SinglyLinkedListNode n2 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode n3 = new SinglyLinkedListNode(3);
        n1.next = n2;
        n2.next = n3;

        SinglyLinkedListNode n11 = new SinglyLinkedListNode(11);
        SinglyLinkedListNode n22 = new SinglyLinkedListNode(22);
        n11.next = n22;
        n22.next = n2;
        int mergeNode = findMergeNode(n1, n11);
        System.out.println(mergeNode);
    }

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode keepPointer = head2;
        while (head1 != null) {
            head2 = keepPointer;
            while (head2 != null) {
                if (head1 != head2) {
                    head2 = head2.next;
                } else {
                    return head2.data;
                }
            }
            head1 = head1.next;
        }
            return 0;
    }

    private static class SinglyLinkedListNode {
        public SinglyLinkedListNode(int data) {
            this.data = data;
        }

        int data;
        SinglyLinkedListNode next;
    }
}
