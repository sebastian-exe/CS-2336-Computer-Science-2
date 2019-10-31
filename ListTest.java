package List;
//Sebastian Moreno, SXS17103, 2336.006
public class ListTest {
	public static void main(String[] args) {
		//testing for the string version of an array list
		
		 System.out.println("Now printing out a string Array List");
		MyArrayList<String> myArrayList = new MyArrayList<>();
		 myArrayList.print();
		 myArrayList.add("a");
		 myArrayList.add("b");
		 myArrayList.print();
		 myArrayList.add("c");
		 myArrayList.add("d");
		 myArrayList.print();
		 myArrayList.add("e");
		 myArrayList.add("f");
		 myArrayList.print();
		 
		 //removes the letter f
		 myArrayList.remove();
		 myArrayList.print();
		 
		 //remove the letter b
		 myArrayList.remove("b");
		 myArrayList.print();
		 
		 //remove the letter a
		 myArrayList.remove("e");
		 myArrayList.print();
		 
		 
		 System.out.println("\n");
		 System.out.println("Now printing out an integer Array List");
		 MyArrayList<Integer> myArrayListInt = new MyArrayList<>();
		 myArrayListInt.add(1);
		 myArrayListInt.add(2);
		 myArrayListInt.add(3);
		 myArrayListInt.add(4);
		 myArrayListInt.print();
		 
		 
		 System.out.println("\n");
		 System.out.println("Now printing out a string Linked List");
		 //testing for the string of a linked list
		 MyLinkedList<String> myLink = new MyLinkedList<>();
		 myLink.addFirst("O");
		 myLink.addFirst("L");
		 myLink.addFirst("L");
		 myLink.addFirst("E");
		 myLink.addFirst("H");
		 
		 myLink.print();
		 
		 myLink.remove("H");
		 
		 myLink.print();
		 
		 myLink.remove("E");
		 
		 myLink.print();
		 //testing the search for a string linked list
		 System.out.print(myLink.search("L"));
		 
		//testing for the integer of a linked list
		 System.out.println("\n");
		 System.out.println("Now printing out an integer linked list:");
		 MyLinkedList<Integer> intLink1 = new MyLinkedList<>();
		 
		 intLink1.addFirst(1);
		 intLink1.addFirst(2);
		 intLink1.addFirst(3);
		 intLink1.addFirst(4);
		 intLink1.addFirst(5);
		 intLink1.addLast(8);
		 intLink1.print();
		 //testing the search for an integer
		 System.out.print(intLink1.search(4));

		 
		 //tests for the string stack
		 System.out.println("\n");
		 System.out.println("Now printing out a stack of strings:");
		 MyStack<String> stack = new MyStack<>();
		 stack.stack_push("A");
		 stack.stack_push("B");
		 stack.stack_push("C");
		 
		 //print the stack
		 stack.stack_print();

		 stack.stack_pop();
		 
		 //print the stack
		 stack.stack_print();
		 
		 stack.stack_pop();
		 
		//print the stack
		 stack.stack_print();
		 
		 System.out.println("\n");
		 System.out.println("Now printing out a stack of integers:");
		 MyStack<Integer> stackInt = new MyStack<>();
		 stackInt.stack_push(10);
		 stackInt.stack_push(20);
		 stackInt.stack_push(30);

		//print the stack
		 stackInt.stack_print();
		 
		 System.out.println("\n");
		 System.out.println("Now printing out a queue of strings");
		 //test for the string queue version
		 MyQueue<String> queue = new MyQueue<>();
		 queue.enqueue("M");
		 queue.enqueue("O");
		 queue.enqueue("M");
		  queue.queue_print();
		  
		 //testing the dequeue function
		 queue.dequeue();
		 queue.queue_print();
		 
		 System.out.println("\n");
		 System.out.println("Now printing out a queue of integers");
		 //Test for the integer queue version
		 MyQueue<Integer> queueInt = new MyQueue<>();
		 queueInt.enqueue(1);
		 queueInt.enqueue(2);
		 queueInt.enqueue(3);
		 
		 queueInt.queue_print();
		 
	}

}
