package linked_list;

public class LinkedListExample {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class IntLinkedList {
        private Node headNode;

        public IntLinkedList(Node headNode) {
            this.headNode = null;
        }

        public void add(int data) {
            Node newNode = new Node(data);

            if (headNode == null) {
                headNode = newNode;
                return;
            }

            Node currentNode = headNode;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

        public void delete(int key) {
            if (headNode == null) return;

            if (headNode.data == key) {
                headNode = headNode.next;
            }

            Node current = headNode;
            Node prev = null;

            while (current != null && current.data != key) {
                prev = current;
                current = current.next;
            }

            if (current == null) return;

            prev.next = current.next;
        }
    }

    public static void main(String[] args) {

    }
}
