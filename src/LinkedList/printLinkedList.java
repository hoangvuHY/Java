package LinkedList;

import java.util.Locale;
import java.util.Scanner;

public class printLinkedList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    static class SinglyLinkedList{
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;
        public SinglyLinkedList(){
            this.head  =null;
            this.tail=null ;
        }
        public void insertNode(int newNode){
            SinglyLinkedListNode node = new SinglyLinkedListNode(newNode);
            if(head == null){
                this.head = node;
            }
            else {
                this.tail.next = node;
            }
            this.tail = node;
        }
    }
    static void printLinkedList(SinglyLinkedListNode head){
        SinglyLinkedListNode node_next = head;
        while (node_next!=null){
            System.out.println(node_next.data);
            node_next = node_next.next;
        }
    }
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        int list_count = scanner.nextInt();
        for (int i = 0; i < list_count; i++) {
            int list_item = scanner.nextInt();
            list.insertNode(list_count);
        }
            printLinkedList(list.head);
    }
}
