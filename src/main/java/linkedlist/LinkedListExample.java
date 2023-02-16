package linkedlist;

public class LinkedListExample {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        // linkedList.ListNode 객체들을 연결하는 방법
        node1.next = node2;
        node2.next = node3;
        node3.next = null; // 마지막 노드에서 next 필드는 null

        // 노드와 링크를 동시에 생성합니다.
        ListNode node0 = new ListNode(0, node1);
        System.out.println(node0);
    }

}
