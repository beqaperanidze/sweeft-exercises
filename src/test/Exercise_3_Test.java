package test;
import main.Exercise_3;
import main.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise_3_Test {

    @Test
    void returnsNullForEmptyList() {
        assertNull(Exercise_3.reverseList(null));
    }

    @Test
    void returnsSingleElementList() {
        ListNode head = new ListNode(1);
        ListNode result = Exercise_3.reverseList(head);
        assertEquals(1, result.val);
        assertNull(result.next);
    }

    @Test
    void returnsReversedListForMultipleElements() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = Exercise_3.reverseList(head);
        assertEquals(5, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(1, result.next.next.next.next.val);
        assertNull(result.next.next.next.next.next);
    }

    @Test
    void returnsReversedListForTwoElements() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        ListNode result = Exercise_3.reverseList(head);
        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
        assertNull(result.next.next);
    }
}