
    // Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveDuplicatesFromSortedList {

    // Function to remove duplicates
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip the duplicate
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Helper function to create a linked list from array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Main function to test
    public static void main(String[] args) {
        // Example input: [1, 1, 2, 3, 3]
        int[] input = {1, 1, 2, 3, 3};

        // Create linked list
        ListNode head = createList(input);

        System.out.println("Original List:");
        printList(head);

        // Remove duplicates
        head = deleteDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}
