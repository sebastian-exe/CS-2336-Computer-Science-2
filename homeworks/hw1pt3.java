/*Write a program that prompts the user to enter a positive three-digit integer and determines whether it is a palindrome number. A palindrome number is the same from right to left and left to right.
 
If the number is not a positive three-digit integer, program will return "Invalid"
 
//Hint:  The positive three-digit number is palindrome if “ number / 100 “ is equal to “ number %  10 “.
 */

import java.util.*;
import java.lang.*;
import java.io.*;
class ProblemSolution{
    public String isPalindrome(){
        Scanner input = new Scanner(System.in);
		// write your code here
        int num = 0;
        //input validation for the three digit number
        num = input.nextInt();
        if(num < 100 || num > 999){
        return "Invalid";
        }
        //validation for palindrome
        if((num/100) == (num % 10)){
        return "Palindrome";
        }else{
        return "Not palindrome";
        }
	}
}


