import java.util.*;
import java.lang.*;
import java.io.*;
class HW2_P2{
    public void printAlphabets(char ch){
/* Write your Analysis (What is the problem):
The problem is to print out the alphabet until a desired
letter.
*/
/* Write your Design (How to solve the problem):
I plan on setting up a flag to test if the character
is an upper case or lower case letter. Once that has
been decided, I have a character initialized for loop
to print out the values up to the character
*/
		//write your code here
        //testing flag to see if the char is upper or lower
        boolean test = Character.isUpperCase(ch);
        if(test == false){
            //for loop for lower case
            for(char i = 'a'; i <= ch; i++){
                System.out.print(i);
                System.out.print(" ");
                
                }
        }
        else if(test == true){
            //for loop for upper case
            for(char j = 'A'; j <= ch; j++){
                System.out.print(j);
                System.out.print(" ");
            }
        }
	}
}
class DriverMain{
	public static void main(String args[]) throws java.lang.Exception {
        char inputChar = (char) System.in.read();
		HW2_P2 hw2P2  = new HW2_P2();
        hw2P2.printAlphabets(inputChar);

	}
}

