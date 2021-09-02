package dsa.util;

public class Linkedlist {

	private Node head=null;
	private Node tail=null;
	
	Linkedlist(){
		
	}
	public Node getHead() {
		return head;
	}
	public long DeleteHead() {
		long value = head.value;
		head=head.next;
		return value;
	}
	public void addAtTail(long value) {
		Node temp = new Node(value);
		if(head==null) {
			head=temp;
			tail=temp;
		}
		else {
			tail.next = temp;
			tail=temp;
		}
		
	}
	public void addAtHead(long value) {
		Node temp = new Node(value);
		if(head==null) {
			head=temp;
			tail=temp;
		}
		else {
			temp.next=head;
			head = temp;
		}
	}
	public void addAfter(long nvalue,long value) {
		Node temp = new Node(value);
		if(head==null) {
			head=temp;
			tail=temp;
		}
		else {
			Node cur = head;
			while(cur!=null) {
				if(cur.value==nvalue) {
					Node temp1=cur.next;
					cur.next=temp;
					temp.next=temp1;
					break;
				}
				cur=cur.next;
			}
		}
	}
	public void DeleteNode(long value) {
		Node cur = head;
		if(cur==null) {
			System.out.println("Empty List!");
		}
		else {
			Node prev = null;
			while(cur!=null) {
				if(cur.value==value) {
					if(prev==null) {
						head=head.next;
					}
					else {
						prev.next=cur.next;
					}
					break;
				}
				prev = cur;
				cur=cur.next;
				
			}
		}
	}
	public void deleteLastNode() {
		Node cur = head;
		
		while(cur.next!=tail) {
			cur=cur.next;
		}
		cur.next=null;
	}
	public void display() {      
        Node current = head;    
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
//        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {        
        	if(current.next==null) {
        		System.out.print(current.value);
        	}
        	else {
        		System.out.print(current.value + "->");
        	}
                
            current = current.next;    
        }    
        System.out.println();    
    }
	public Linkedlist reverseList() {
		Linkedlist ans = new Linkedlist();
		Node cur = head;
		
		while(cur!=null) {
			ans.addAtHead(cur.value);
			cur = cur.next;
		} 
		
		return ans;
	}
	public Node reverse(Node head) {
		if(head==null) {
			return head;
		}
		if(head.next==null) {
			return head;
		}
		Node temp = reverse(head.next);
		head.next.next = head;
		head.next=null;
		return temp;
	}
	public static Node sort(Node head) {
		if(head==null) {
			return head;
		}
		if(head.next==null) {
			return head;
		}
		Node temp = sort(head.next);
		Node t = temp;
		Node prev = null;
		while(t!=null) {
			
			if(t.value>head.value) {
				prev.next = head;
				head.next = t;
				break;
			}
			prev=t;
			t=t.next;
		}
		return temp;
	}
	
	
}
