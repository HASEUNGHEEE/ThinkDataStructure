package linkedlist;

public class ListNode {
    /*
    * linkedList.ListNode 객체에는 두 개의 인스턴스 변수가 있습니다.
    * data 변수는 어떤 Object에 대한 참조고,
    * next 변수는 리스트에서 다음 노드에 대한 참조입니다.
     */
    public Object data;
    public ListNode next;

    public ListNode() {
        this.data = null;
        this.next = null;
    }

    public ListNode(Object data) {
        this.data = data;
        // 리스트의 마지막 노드에서 관례상 next 변수는 null 입니다.
        this.next = null;
    }

    public ListNode(Object data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        return "linkedList.ListNode(" + data.toString() + ")";
    }
}
