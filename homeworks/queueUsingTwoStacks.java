import java.util.*;
import java.lang.*;
import java.io.*;
/* Write your Analysis (What is the problem):
The probelm is to implement a queue using two stacks while also
implementing the proper methods needed to manipulate the stacks.
*/

/* Write your Design (How to solve the problem):
I plan on first writing out the constructor and then identifing all of the other
aspects of the my queue class. Within the default constructor I plan on adding two
seperate strings stacks. Then in the other methods I want to use the built in string
methods within java to manipulate the stack.
*/
public class MyQueue{
    private int maxCapacity = 4;
    private Stack<String> stack1;
	private Stack<String> stack2;
    
    public MyQueue(){
        //define the stacks
        stack1 = new Stack<String>();
        stack2 = new Stack<String>();
    }
    
    public int size(){
        //add the size of both the stacks to get the total size
        int totSize = stack1.size() + stack2.size();
        return totSize;
    }
    //function to insert into the stack
    public void insert(String value){
        if(value != null &&! value.equals(" ") &&! value.equals("")){
            //check that queue is not full
            if(!isFull()){
                //add to the first stack
                stack1.push(value);
            
            }
        
        }
    }
    
    public String remove(){
        if(!isEmpty()){
            //trasfer the values from stack1 to stack2
            shiftStacks();
            //pop from stack2
            return stack2.pop();
        }
        return null;
    }
    //shift the stacks
    private void shiftStacks(){
        //loop until the stack1 is empty
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        
    } 
    //test if the stack is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    //test if the stack is full
    public boolean isFull(){
        return (size() >= maxCapacity);
    }
    
    @Override //[QueueSize:Full/Empty:QueueElementsList]
	public String toString(){
		shiftStacks();
		StringBuilder sb = new StringBuilder("[");
		sb.append(this.size()).append(":");
		if(this.isEmpty())
			sb.append("Empty").append(":");
		else if (this.isFull())
			sb.append("Full").append(":");
		while(!isEmpty()){
			sb.append(this.remove());
			if(this.size()!=0) sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}   
}

