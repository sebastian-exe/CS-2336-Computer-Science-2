import java.util.*;
import java.lang.*;
import java.io.*;
//HW4_P2 RECURSIVE
/* Write your Analysis (What is the problem):
The problem is to read in a value, and input validate if the
number is less than or equal to zero, return an empty string.
Once the number has passed the input validation, I want to 
recursively call a method to transfor the number from an int 
binary string representing that integer in binary.
*/

/* Write your Design (How to solve the problem):
My design is to create a recursive method that takes in an
integer value and return the binary equivalent as a string.
I will acomplish this by calling the method recursively 
and dividing the value by 2, then adding the value modulus 
2, and returning those combined.
*/

class DecimalToBinary{
    public static String decimalToBinary(int value){
        //Write your code here
    
        String binary = "";
        //input validation for negative numbers
        //base case:
        if(value <= 0){
        return "";
        }
        //recursive call
		return decimalToBinary(value/2) + value % 2;
	}
}

class DriverMain{
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
		System.out.print(DecimalToBinary.decimalToBinary(input.nextInt()));
	}
}

