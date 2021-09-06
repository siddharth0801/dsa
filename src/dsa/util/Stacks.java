package dsa.util;

public class Stacks {
	
	private Linkedlist st = new Linkedlist();
	
	public void push(long value) {
		
		st.addAtHead(value);
		
	}
	public void pop() {
		
		st.DeleteNode(st.getHead().value);
		
	}
	public long peek() {
		
		return st.getHead().value;
		
	}
	public void printStack() {
		Node cur = st.getHead();
		System.out.println("---");
		while(cur!=null) {
			System.out.print(cur.value+" ");
			cur=cur.next;
		}
		System.out.println("\n---");
	}

}
