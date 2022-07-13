package rashmi;
import java.util.Scanner;

class Node {
	Node next;
	int data;
}
class Linked {
	// It rearrange the Linked list inplace
	public Node rearrangeLinkedList(Node head) {
		if (head == null || head.next == null || head.next.next == null) {
			return head;
		}
		Node middleNode = getMiddleNode(head);
		Node nextList = middleNode.next;
		middleNode.next = null;
		Node reversedList = reverse(nextList);
		Node firstList = head;
        Node finalList = new Node();
		Node node = finalList;

		while (firstList != null || reversedList != null) {
			if (firstList != null) {
				node.next = firstList;
				node = node.next;
				firstList = firstList.next;
			}
			if (reversedList != null) {
				node.next = reversedList;
				node = node.next;
				reversedList = reversedList.next;
			}
		}
		return finalList.next;
	}
	public Node getMiddleNode(Node node) {
		Node slow, fast;
		slow = fast = node;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public Node reverse(Node node) {
		if (node == null || node.next == null) {
			return node;
		}
		Node prev, next;
		prev = next = null;

		while (node != null) {
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
		}
		return prev;
	}
	// getNewNode() method to generate a new node
	public Node getNewNode(int key) {
		Node a = new Node();
		a.next = null;
		a.data = key;
		return a;
	}
	// add method is used to insert the element in Linked List
	public Node add(int key, Node node) {
		if (node == null)
			return getNewNode(key);
		else
			node.next = add(key, node.next);
		return node;
	}
	// It'll print the complete linked list
    public void printList(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		printList(node.next);
	}
}
public class ShuffledElements {
	public static void main(String[] args) {
		Linked a = new Linked();
		Node head = null;
		head = a.add(1, head);
		head = a.add(2, head);
		head = a.add(3, head);
		head = a.add(4, head);
		head = a.add(5, head);
		head = a.add(6, head);
		head = a.add(7, head);
		head = a.add(8, head);
		head = a.add(9, head);
		head = a.add(10, head);

		System.out.println("Given lists are:");
        a.printList(head);
        a.rearrangeLinkedList(head);
		System.out.println("\nRearrange lists are:");
	    a.printList(head);
	}
}
