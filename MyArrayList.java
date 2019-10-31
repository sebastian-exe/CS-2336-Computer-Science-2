package List;

//import java.util.ArrayList;

//Sebastian Moreno, SXS17103, 2336.006
public class MyArrayList<E> {
	private E[] list;
	private int capacity = 4;
	private int size;
	
	//constructor
	@SuppressWarnings("unchecked")
	MyArrayList(){
		this.list = (E[]) (new Object[capacity]);

	}
	//constructor with parameter of capacity
	MyArrayList(int capacity) {
		if (capacity > 4)
			this.capacity = capacity;
		this.list = (E[]) (new Object[capacity]);

	}
	
	//insert get size method
	public int getSize() {
		return this.size;
	}
	
	public E getElement(int index) {
		if(index > 0 && index < size) {
			return list[index];
		}
		return null;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void add(E s) {
		//will let us know if the array is reaching full capacity
		if(size >= capacity) resize(this.capacity *2);
		list[size] = s;
		size++;
		
	}
	
	public int search(E key) {
		for(int i = 0; i < size; i++) {
			if(list[i].equals(key)) return i;
		}
		return -1;
	}
	
	public void add(E s, int index) {
		if(index >= 0 && index < size){
			if(size >= capacity) resize(this.capacity *2);
			for(int k = size -1; k >= index; k--) {
				list[k-1] = list[k];
			}
			list[index] = s;
			size++;
			
			}else {
				System.out.println("index " + index + " is out of range!");
			}
			
		}
	
	public void remove(int i) {
		if(!isEmpty() && i >= 0 && i < size) {
			remove(list[i]);
	
		}
		
	}
	
	public void remove(E s) {
		int index = search(s);
		if(index != -1 ) {
			E temp = list[index];
			for(int k = index + 1; k <= size; k++) {
				list[k - 1] = list[k];
				
			}
			size--;
			if(size != 0 && capacity/size  >= 4) resize(capacity/2);
			System.out.println(temp + " removed!");
			
		}else {
			System.out.println(s + " is not in the list");
		}
	}
	
	
	//remove element from the end of the list
	public void remove(){
		if(size != 0) {
			size--;
			E temp = list[size];
			list[size]= null;
			//check if the 25% full 75% empty
			if(size != 0 && capacity/size  >= 4) resize(capacity/2);
			System.out.println(temp + " removed!");
			
		}else {
			System.out.println("List is empty");
		}
		
	}
	
	public void resize(int capacity) {
		this.capacity = capacity;
		E[] temp = list;
		list = (E[]) (new Object[capacity]);
		for(int i = 0; i < size; i++) {
			list[i] = temp[i];
		}
	}
	
	public void print() {
		System.out.print(" |");
		for(int i = 0; i < capacity; i++) {
			System.out.print(list[i] + " |");
		}
		System.out.println();
	}
	
}

