package linked_list;

public class LinkedListExample {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node headNode;

        LinkedList() {
            this.headNode = null;
        }

        public void createLinkedList() {
            Node node1 = new Node(10);
            this.headNode = node1;

            Node node2 = new Node(20);
            node1.next = node2;

            Node node3 = new Node(30);
            node2.next = node3;
        }

        public void append(Node newNode) {
            Node current = this.headNode;

            if (current == null) {
                this.headNode = newNode;
            } else {
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.createLinkedList();
    }
}
