package dsa.util;

import java.util.ArrayList;

public class BinaryTree {

	TNode root;
	
	public BinaryTree(int key) {
		 this.root.setKey(key);
	}
	public BinaryTree() {
		this.root = new TNode(0);
	}
	public void addNode(int value) {
		TNode temp = root;
		TNode pr = null;
		while(temp!=null) {
			pr=temp;
			if(temp.getKey()>value) {
				temp = temp.left;
			}
			else {
				temp = temp.right;
			}
		}
//		System.out.println(pr.getKey());
		if(pr.getKey()==0) {
			pr.setKey(value);
		}
		else if(pr.getKey()>value) {
			pr.left = new TNode(value);
		}
		else {
			pr.right = new TNode(value);
		}
	}
	public void deleteNode(int value) {
		
		
	}
	public boolean searchTree(int value) {
		TNode temp = this.root;
		while(temp!=null) {
			if(temp.getKey()==value) {
				return true;
			}
			else if(temp.getKey()>value){
				temp =temp.left;
			}
			else {
				temp = temp.right;
			}
		}
		return false;
	}
	public static void inOrder(TNode root) {
		if (root == null)
	        return;
	    else {
	        inOrder(root.left);
	        System.out.print( root.getKey() +" ");
	        inOrder(root.right);
	    }
	}
	public static void preOrder(TNode root) {
		if (root == null)
	        return ;
	    else {
	    	System.out.print( root.getKey() +" ");
	        preOrder(root.left); 
	        preOrder(root.right);
	    }
	}
	public static ArrayList<Integer> preOrder(TNode root,ArrayList<Integer> arr) {
		if (root == null)
	        return arr;
	    else {
//	    	System.out.print( root.getKey() +" ");
	    	arr.add(root.getKey());
	        preOrder(root.left,arr); 
	        preOrder(root.right,arr);
	        return arr;
	    }
	}
	
	
	
}
