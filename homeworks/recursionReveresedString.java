import java.util.*;
import java.lang.*;
import java.io.*;
/* Write your Analysis (What is the problem):
The probelm is write a recursive function that 
returns a reversed string of the string inputed.
*/

/* Write your Design (How to solve the problem):
I plan on writing a string that will reverse the string that
is entered by using a recursive method. The method will first 
test out a base case and see if the length of the string is
equal to 1. Then it will. Call the reversed function passing in
different lengths of the string entered using the built in java
function ".substring" in the recursive call.
*/
class ReverseString{
     public static String reverse(String str){
         String reverse = "";
        //write your code here
        //Base case
         if(str.length() == 1){
             return str;
         }else{
             //includes the recursive and reorders the string
             reverse += str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
             return reverse;
             
         }
         
        
	}
}
class DriverMain{
	public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print(ReverseString.reverse(input.nextLine()));
	}
}

