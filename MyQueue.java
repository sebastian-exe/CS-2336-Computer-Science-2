package List;
//Sebastian Moreno, SXS17103, 2336.006

public class MyQueue<E extends Comparable<E>> {
	
	
	MyLinkedList<E> link;
	
	MyQueue(){
		link = new MyLinkedList<>();
	}

	public void dequeue() {
		link.removeFirst();
	}
	
	public void enqueue(E element) {
		
		link.addLast(element);
		
	}
	
	public void queue_print() {
		link.print();
	}
}
