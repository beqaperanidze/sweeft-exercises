package main;

public class Exercise_3 {
    //მოცემულია ერთმიმართულებიანი linked list-ის თავი. დაწერეთ ფუნქცია, რომელიც დააბრუნებს
    //შეტრიალებულ ვერსიას. ListNode reverseList(ListNode head);
    //მაგ. head = 1->2->3->4->5, result = 1<-2<-3<-4<-5.

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
