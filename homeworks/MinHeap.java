package test;
import java.io.*;

class MinHeap<E extends Comparable<E>> {
	private java.util.ArrayList<E> list = new java.util.ArrayList<>();

	/** Create a default heap */
	public MinHeap() {
	}

	/** Create a heap from an array of objects */
	public MinHeap(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			add(objects[i]);
	}

	/** Add a new object into the heap */
	public void add(E newObject) {
        //write your code here
        //check value is not less than current minimum
        list.add(newObject);
        int currentIndex = list.size() -1;
        
        while(currentIndex > 0){
            int parentIndex = (currentIndex -1)/2;
            
            System.out.println("This is the vlaue of the current" + list.get(currentIndex));
            System.out.println("This is the value of the parent" + list.get(parentIndex));
            //System.out.println(list.get(currentIndex));
            int thing = (list.get(currentIndex).compareTo(list.get(parentIndex)));
            System.out.print("This is the value of thing: ");
            System.out.println(thing);
            //swap if the current object is greater than the parent
            if(thing < 0){
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
            }
            else{
                break;
            }
            currentIndex = parentIndex;
            
            }            
        }
    
    
    /** Remove the root from the heap */
	public E remove() {
    
        //write your code here
        //test if the list size is equal to zero
        if(list.size()== 0){
            return null;
        }
        
        E removeObject = list.get(0);
        list.set(0, list.get(list.size()-1));
        list.remove(list.size()-1);
        int currentIndex = 0;
        
        while(currentIndex < list.size()) {
        	int leftIndex = (2 * currentIndex) +1;
        	int rightIndex = (2 * currentIndex) + 2;
        	
        	//find the max between two children nodes
        	
        	if(leftIndex >= list.size()){
        		break;
        	}
        	int maxIndex = leftIndex;
        	int testSwap = (list.get(maxIndex).compareTo(list.get(rightIndex)));
        	if(rightIndex < list.size()) {
        		//swap if the current node is less than the maximum 
        		if(testSwap > 0) {
        			E temp = list.get(maxIndex);
        			list.set(maxIndex, list.get(currentIndex));
        			list.set(currentIndex, temp);
        		}
        		else {
        			//if there is no need to enter the swap then the values are already in their correct position
        			break;
        		}
        	}
        	
        }
        return removeObject;
        
    }
    
    /** Get the number of nodes in the tree */
	public int getSize() {
		return list.size();
	}
    
    public void print(){
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
	}
    
}

