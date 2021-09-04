package dsa.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
//		LinkedList
		Linkedlist mylist = new Linkedlist();
		mylist.addAtTail(507);
		mylist.addAtTail(800);
		mylist.addAtTail(507432);
		mylist.addAtHead(77);
		mylist.addAtHead(789);
		mylist.addAtTail(23);
		mylist.addAfter(507, 1204);
		mylist.DeleteNode(77);
//		Linkedlist lList = new Linkedlist();
//		lList.DeleteNode(444);
		mylist.deleteLastNode();
		System.out.println("Printing list");
		mylist.display();
		System.out.println("Printed list");
		System.out.println("Printing reversed List");
		Linkedlist rev = mylist.reverseList();
//		mylist.addAtTail(159);
//		mylist.display();
		rev.display();
		System.out.println("Printed reversed List");
		System.out.println("Print reversed list using recursion");
		Node temp = rev.reverse(rev.getHead());
		while(temp!=null) {
			System.out.print(""+temp.value+" ");
			temp=temp.next;
		}
		Node list = Linkedlist.sort(rev.getHead());
		Node tt = list;
		
		while(tt!=null) {
			System.out.print(" "+list.value);
			tt = tt.next;
		}
		System.out.println("\n");
		
//		Stack
		Stacks st = new Stacks();
		st.push(14);
		st.push(15);
		st.push(16);
		st.push(789);
		st.push(14);
		st.pop();
//		System.out.println(st.peek());
		st.printStack();
		st.push(89);
//		st.printStack();
		
//		Queue
		System.out.println("Queue");
		Queues q = new Queues();
		q.enqueue(45);
		q.enqueue(80);
		q.enqueue(14);
		q.printQueue();
		q.deque();
		q.printQueue();
		
//		Binary Tree
		System.out.println("\n\nBinary Tree\n"); 
		
		BinaryTree t = new BinaryTree();
		t.addNode(50);
		t.addNode(30);
		t.addNode(70);
		t.addNode(20);
		t.addNode(40);
		t.addNode(60);
		t.addNode(80);
		BinaryTree.inOrder(t.root);
		System.out.println();
		BinaryTree.preOrder(t.root);
//		boolean ans = t.searchTree(77);
//		System.out.println("\n"+ans);
		
//		check if a preorder traversal binary tree exists.
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("\nEnter traversal : ");
////		40, 30, 35, 80, 100
//		String[] sr = br.readLine().split(" ");
//		int[] pre = new int[sr.length];
//		
//		BinaryTree bt = new BinaryTree();
//		
//		for(int i=0;i<pre.length;i++) {
//			pre[i]=Integer.parseInt(sr[i]);
//			bt.addNode(pre[i]);
//			System.out.print(pre[i]+" ");
//		}
//		System.out.println();
//		ArrayList<Integer> arr = new ArrayList<>();
//		arr = BinaryTree.preOrder(bt.root,arr);
//		System.out.println(arr);
		
//		Graph 
		System.out.println();
		graph ng = new graph(6);
		ng.addEdge(0, 1);
		ng.addEdge(1, 2);
		ng.addEdge(0, 2);
		ng.addEdge(1, 3);
		ng.addEdge(3, 5);
		ng.addEdge(3, 4);
//		ng.printGraph();
		System.out.println();
		ng.Bfs(1);
		System.out.println();
		ng.Dfs(0);
//		Sorting
		sortingTechniques srt = new sortingTechniques();
//		Bubble Sort
		System.out.println("\nSorting Algorithms..");
		int[] arrayA = {10,4,8,5,9,12,3,1};
		srt.bubbleSort(arrayA);
		
//		Merge Sort
		int[] arrayB = {10,4,8,5,9,12,3,1,15};
		srt.mergeSort(arrayB, 0, arrayB.length-1);
		srt.display(arrayB);
		
//		Quick Sort
		int[] arrayC = {10,4,8,5,6,7,9,12,3,1};
		srt.quickSort(arrayC, 0, arrayC.length-1);
		srt.display(arrayC);
		
//		Heap Sort
		int[] arrayD = {87,45,89,55,12,4,6,32};
		srt.heapSort(arrayD);
		srt.display(arrayD);
		
//		Insertion Sort
		int[] arrayE = {14,2,6,9,4,7};
		srt.insertionSort(arrayE);
		srt.display(arrayE);
		
//		Selection Sort
		int[] arrayF = {10,4,8,5,2,3,1};
		srt.selectSort(arrayF);
		srt.display(arrayF);
		
//		Binary Search
		searchAlgorithms search = new searchAlgorithms();
		System.out.println();
		search.binarySearch(arrayD, 0, arrayD.length-1, 55);
	}

}
