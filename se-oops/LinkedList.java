import java.util.LinkedList;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist
{
Node head;

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}

public class CustomLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("How many elements u have to addto the linkedList: ");
        int n = scanner.nextInt();
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            linkedList.add(value);
        }

        System.out.println("Initial LinkedList: " + linkedList);

        // Adding object at specific location
        System.out.print("Enter the value to add: ");
        int value = scanner.nextInt();
        System.out.print("Enter the index to add at: ");
        int index = scanner.nextInt();
        linkedList.add(index, value);

        System.out.println("LinkedList after adding at index " + index + ": " + linkedList);

        // Remove by value
        System.out.print("Enter the value to remove: ");
        int removeValue = scanner.nextInt();
        linkedList.remove(Integer.valueOf(removeValue));

        System.out.println("LinkedList after removing " + removeValue + ": " + linkedList);

        // Return size of LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());

        scanner.close();
    }
}
