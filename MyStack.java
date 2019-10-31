package List;
//Sebastian Moreno, SXS17103, 2336.006

public class MyStack<E extends Comparable<E>>{

MyLinkedList<E> link = new MyLinkedList<>();
	
	public void stack_push(E element) {
		link.addFirst(element);
	}


	public void stack_pop(){
		link.removeFirst();
	}
	
	public E stack_pick() {
		return link.getFirst();
	}
	
	public void stack_print() {
		link.print();
	}
	
}
