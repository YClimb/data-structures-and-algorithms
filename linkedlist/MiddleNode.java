package linkedlist;

/**
 * 求链表的中间节点
 * 给出任意单向链表，找出并返回该链表的中间节点。
 *
 * @author yclimb
 * @date 2020/8/28
 */
public class MiddleNode {
    public static void main(String[] args) {
        int length = 10;
        // 单链表循环赋值
        Node head = new Node(0);
        Node cur = head;
        for (int i = 1; i < length; i++) {
            Node tmp = new Node(i);
            cur.setNext(tmp);
            cur = tmp;
        }
        // 读取node链表
        Node tmp = head;
        while (null != tmp) {
            System.out.println(tmp.getData());
            tmp = tmp.getNext();
        }
        System.out.println("---");
        // 获取中间节点，二次循环方式获取
        Node mid = getMiddleNode(head);
        System.out.println(mid.getData());
        System.out.println("---");
        // 快慢指针方式获取
        Node mid2 = getMiddleNode2(head);
        System.out.println(mid2.getData());
    }

    /**
     * 二次循环方式
     * @param head h
     * @return Node
     */
    public static Node getMiddleNode(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        // 先得到node长度length
        int l = 0;
        Node tmp = head;
        while (tmp != null) {
            l++;
            tmp = tmp.getNext();
        }
        // 循环链表，length/2则为中间节点
        Node cur = head;
        int m = 0;
        while (cur != null) {
            if (l / 2 == m) {
                return cur;
            }
            m++;
            cur = cur.getNext();
        }
        return head;
    }

    /**
     * 快慢指针方式
     * 1.定义两个指针fast和slow。
     * 2.slow一次遍历一个节点，fast一次遍历两个节点，
     * 3.由于fast的速度是slow的两倍，所以当fast遍历完链表时，slow所处的节点就是链表的中间节点。
     *
     * PS:火柴棍燃烧例子,设一根a=1,一根b=2,a燃烧时间需要1,求10a长度b要燃烧多久;
     * 解:10a=10/b/a=10/2/1=5
     *
     * @param head h
     * @return Node
     */
    public static Node getMiddleNode2(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.getNext();
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return fast == null ? slow : slow.getNext();
    }

    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
