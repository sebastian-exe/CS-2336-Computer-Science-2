import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * convert MaxHeap to a complete MyBST
 */
/* Write your Analysis (What is the problem):
The problem is to read in a max heap and then convert it to a completed
Binary tree. A complete binary tree means that it has no jumps going from
the left to the right.
*/

/* Write your Design (How to solve the problem):
Based on the instructions, the plan is to have to functions. One to convert
the elements from the heap into an array list, and then have another function
to convert that array list into a completed binary search tree. To be able to 
complete this I first must have the convert function read in the numbers from
the heap and then place them into an array list. After that I plan on converting
the array list into a binary search tree using recusive calls and a high, low, and 
mid pointer.
*/

class Solution{
    public static void convert(MaxHeap maxHeap, MyBST bst){
          ArrayList<Integer> arr = new ArrayList<Integer>();
            // Write your code here, you can add more methods
            int heapSize = maxHeap.getSize();
        
	       for(int i = 0; i < heapSize; i++){
               //remove from the heap and add to array list
              int node = (int)maxHeap.remove();
              arr.add(node);
           }
       
        buildTree(bst, arr, 0, arr.size());
        
	}
    //method to build the tree
    public static void buildTree(MyBST bst,ArrayList<Integer> arr, int low, int high){
        int mid = (low + high)/2;
        //base case
        if(high == low){
            return;
        }
        
        //insert to tree
        bst.insert(arr.get(mid));
        //call recursively 
        buildTree(bst, arr, low, mid); //left
        buildTree(bst, arr, mid +1, high); //right
        
        
    }     
}

