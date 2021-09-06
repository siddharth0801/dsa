package dsa.util;

public class TNode {

	private int key;
    TNode left, right;
 
    public TNode(int item){
        setKey(item);
        left = right = null;
    }

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	
	
}
