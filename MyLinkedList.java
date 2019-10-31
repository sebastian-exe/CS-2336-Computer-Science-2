package List;
//Sebastian Moreno, SXS17103, 2336.006
public class MyLinkedList<E extends Comparable<E>> {
	private MyNode<E> first;
	private MyNode<E> last;
	//for the size of the linked list
	private int size;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	//add element to the beginning of our linked list
	public void addFirst(E s) {
		MyNode<E> newNode = new MyNode<>(s);
		if(isEmpty()) { // the first element 
			first = newNode;
			last = newNode;
			
		}else {
			//adds an element to the list
			newNode.next = first;
			
		}
		first = newNode;
		//increment the size 
		size++;
	}
	

//function to add to the end of the linked list
 public void addLast(E s) {
	MyNode<E> mynewnode = new MyNode<E>(s);
	if(isEmpty()) {
		
		first = mynewnode;
	}else {
		last.next = mynewnode;
	}
	last = mynewnode;
	size++;
}

 
	//function remove the first node of the linked list
	public void removeFirst(){
		if(!isEmpty()){
			E temp = first.element;
			if(first == last){ //only one element left in the list
				first = last = null;
				
			}else{
				first = first.next;
		
			}
			size--;
			System.out.println(temp + " is Removed!");
		}else{
			System.out.println("List is empty");
		}	 
	 }
	
	//function that removes the last function
	public void removeLast() {
		if(!isEmpty()) {
			E temp = first.element;
			if(first == last) {
				first = last = null;
			}else {
				MyNode<E> prev = first; 
				while(prev.next != last) {
					prev = prev.next;
				}
				prev.next = null;
				last = prev;
			}
			size--;
			System.out.println(temp + " is Removed!");
			}else {
				System.out.println("List is empty");
			}
		}
	
	//function that searches the key
	public boolean search(E key) {
		MyNode<E> pointer = first;
		while(pointer != null && pointer.element.equals(key)) {
			pointer = pointer.next;
	}
		return pointer != null;
	}
	
	//remove function
	public void remove(E key) {
		if(search(key)) {
			MyNode<E> prev = first;
			MyNode<E> curr = first;
			if(!isEmpty()) {
			while(curr != null && !curr.element.equals(key)) {
				prev = curr;
				curr = curr.next;
			}
			if(curr == first) removeFirst();				
			else if(curr == last) removeLast();
			else {
				prev.next = curr.next;
				size--;
				System.out.print(key + " is removed!");

			} 
		}else {
		System.out.print(key + " is not in the list!");
		
			}
		}
	}
	 
	//print function
public void print(){
		//set up the linked list and start it at the head
		MyNode<E> ptr = first;
		if(!isEmpty()){
			System.out.print(" | ");
			while(ptr!=null){
				//print out the current element
				System.out.print(ptr.element + " | ");
				//move the pointer to the next element of the linked 
				ptr = ptr.next;
			}
			System.out.println(" ");

		}
	}


public E getFirst() {
	
	return first.element;
}
	
class MyNode<E extends Comparable<E>>{
	
	E element;
	MyNode<E> next;
	
	MyNode(E element){
		this.element = element;
		
		}
	
	 }
}
