import java.util.*;
import java.lang.*;
import java.io.*;
//toChars() method is already implemented, so please do not change it
/* Write your Analysis (What is the problem):
the problem is to make the methods print out the correct 
output based on the input
*/

/* Write your Design (How to solve the problem):
My gameplan is to write the functions to do the appropirate
returns. 
*/

class MyString {

	private char[] chars;

	public MyString(char[] chars) {
        this.chars = chars;
	}
    
    public char[] toChars() { //Do not change this method
        return chars;
    }
    
	public int length() {
        //return the length of the characters
        return chars.length;
	}

	public char charAt(int index) {
        return chars[index];
    }

	public MyString substring(int begin, int end) {
		
        int len = end - begin;
        char arr[] = new char[len];
        
        
        for(int i = 0; i < len; i++) {
        	arr[i] = chars[begin];
        	begin++;
        }
        return new MyString(arr);
       
	}

	//check if the two strings equal eachother
	public boolean equals(MyString s){
		//first check if they are the same length
		int len = length();
		if(len != s.length()) {
			return false;
		}
		//if they are the same length, check the characters
		else {
			for(int i = 0; i < len; i++) {
				if(chars[i] != s.chars[i]) {
					return false;
				}
			}
		}
		return true;
	}

	public MyString toLowerCase() {
		int len = length();
		//make a new array with the length
		char arr[] = new char[len];
		
		for(int i = 0; i < len; i++) {
			//convert every letter to its lower case ASCII value
			arr[i] = (char)(chars[i]+32);
		}
		return new MyString(arr);
	}

    //convert an int type to MyString type
	public static MyString valueOf(int i) {
		int num = i;
		int len = 0;
		while (num > 0) {
		num = num / 10;
		len++;

			}
		char arr[] = new char[len];
		num = i;

		for (int j = len - 1; j >= 0; j--) {
		arr[j] = (char)((num % 10) + '0');

		num = num / 10;
		}

		return new MyString(arr);
		}

		
		}
	 


