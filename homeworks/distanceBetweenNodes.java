import java.util.*;
import java.lang.*;
import java.io.*;
class MyBST {

	TreeNode root;

    
    // find the distance between two nodes with given keys a and b
    public int getDistance(int a, int b){
        //Write your code here and you can add more methods
    	if(a > b) {
    		//perform a swap
    		int temp = a;
    		a = b;
    		b = temp;
    	}
    	return dis_util(root, a, b);
    }
    
    int dis_util(TreeNode node, int a,int b) {
        //if the tree is empty return 0
    	if(node == null) {
    		return 0;
    	}
    	if(node.element > a && node.element > b) {
    		//recursively call the util function on the left side of the subtree
    		return dis_util(node.left, a, b);
    	}
    	if(node.element < a && node.element < b) {
    		return dis_util(node.right, a, b);
    	}
    	
    	if(node.element >= a && node.element <= b) {
    		//get the distance of the current root to both a and b and add them to get the final distance
    		return rootToNodeDistance(node, a) + rootToNodeDistance(node, b);
    	}
    	return 0;
    }
    
    int rootToNodeDistance(TreeNode node, int x) {
    	//if the current node is the node we are looking for
    	if(node.element == x) {
    		return 0;
    	}
    	else if(node.element > x) {
    		//recursively call the left subtree
    		return 1 + rootToNodeDistance(node.left, x);
    		
    	}
    	return 1 + rootToNodeDistance(node.right, x);
    	
    }
    
    
 //---------------DO NOT CHANGE THE GIVEM METHODS---------------------------------   
   // insert method to add elements to BST 
		public void insert(int key){
		TreeNode newNode = new TreeNode(key);
		if(root == null){
			root = newNode;
		}else{
			TreeNode current = root;
			TreeNode parent;

			while(true){
				parent = current;
				if(key ==  current.element) return; //no duplicate
				else if(key < current.element){
					current = current.left;
					if(current == null){
						parent.left = newNode;
						return;
					}
				}else{
					current = current.right;
					if(current == null){
						parent.right = newNode;
						return;
					}
				}
			}
		}

	}
    //Print the elements of the BST level by level staring from root
    public void print(){
		Queue q = new LinkedList<TreeNode>();
		if(root!= null)
			q.add(root);
		while(!q.isEmpty()){
			TreeNode current = (TreeNode) q.remove();
			System.out.print(current.element + " ");
			if(current.left != null) 
				q.add(current.left);
			if(current.right != null) 
				q.add(current.right);
		}
	}

    
	private class TreeNode {
		
		int element;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(){}
		public TreeNode(int e){
			this.element = e;
		}

	}
}

