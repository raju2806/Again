public class linkedlistdemo2 {


    // LinkedList class with all required functions
    static class LinkedList {
        private Node head; // The head node of the list

        // Node class to represent an element in the linked list
        private static class Node {
            Object data; // Data of the node
            Node next;   // Reference to the next node

            public Node(Object data) {
                this.data = data;
                this.next = null;
            }
        }

        // Constructor to initialize an empty list
        public LinkedList() {
            head = null;
        }

        // Method to add an element to the end of the linked list
        public void add(Object data) {
            Node newNode = new Node(data);
            if (head == null) {
                // If the list is empty, new node becomes the head
                head = newNode;
            } else {
                // Traverse to the end of the list and add the new node
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Method to print the entire linked list
        public void printList() {
            if (head == null) {
                System.out.println("Linked List is empty.");
                return;
            }
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

        // Method to find the size (number of elements) in the linked list
        public int size() {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }

        // Method to remove the first occurrence of a specified element from the list
        public boolean remove(Object data) {
            if (head == null) {
                return false; // Empty list, nothing to remove
            }

            // Special case: If the element to remove is at the head
            if (head.data.equals(data)) {
                head = head.next; // Move the head to the next node
                return true;
            }

            // Traverse through the list to find the element
            Node current = head;
            while (current.next != null) {
                if (current.next.data.equals(data)) {
                    current.next = current.next.next; // Remove the node
                    return true;
                }
                current = current.next;
            }
            return false; // Element not found
        }

        // Method to get the first element of the list
        public Object getFirst() {
            if (head == null) {
                return null; // Empty list, no first element
            }
            return head.data;
        }
    }

    // Main method to test the LinkedList
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the linked list
        list.add("Durga");
        list.add(30);
        list.add(3.14);
        list.add("Java");

        // Print the linked list
        System.out.println("Linked List:");
        list.printList();  // Output: Durga -> 30 -> 3.14 -> Java -> null

        // Get the size of the linked list
        System.out.println("Size of the linked list: " + list.size());  // Output: 4

        // Remove an element from the linked list
        System.out.println("Removing '30' from the list:");
        boolean isRemoved = list.remove(30);
        System.out.println("Element '30' removed: " + isRemoved);  // Output: true

        // Print the linked list again after removal
        list.printList();  // Output: Durga -> 3.14 -> Java -> null

        // Get the first element of the linked list
        System.out.println("First element of the list: " + list.getFirst());  // Output: Durga
    }
}
