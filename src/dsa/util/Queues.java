package dsa.util;

public class Queues {

	private Linkedlist que = new Linkedlist();
	
	public void enqueue(long value) {
		
		que.addAtTail(value);
		
	}
	public long deque() {
		return que.DeleteHead();
	}
	public void printQueue() {
		Node head = que.getHead();
		while(head!=null) {
			System.out.print(head.value+" ");
			head=head.next;
		}
	}
}
