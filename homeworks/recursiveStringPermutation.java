import java.util.*;
import java.lang.*;
import java.io.*;
//write your analysis here
//The problem is to print out all the different combinations 
//of a string.

//write your design here
//basically, I plan on calling the displayPermutation function 
//recursively with a incrementing through the string of both 
// the second and first string. These will happen within the recursive
//call. I also need to include a base case for when the second string is 
//empty
class AllPermutation{
    public static void displayPermuation(String s) {
        //write your code here
        displayPermuation("", s);
    }
    public static void displayPermuation(String s1, String s2) {
        //write your code here
        //base case
        //if string 2 is empty, print out string 1
        if(s2.isEmpty()){
            System.out.println(s1);
        }else{
            for(int i = 0; i < s2.length(); i++){
                //recursive call
                displayPermuation(s1 + s2.charAt(i), s2.substring(0, i)+ s2.substring(i+1));
            }
        }
    }
}

//Do not change the Driver class
class DriverMain{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
        AllPermutation.displayPermuation(input.nextLine());
	}
}

