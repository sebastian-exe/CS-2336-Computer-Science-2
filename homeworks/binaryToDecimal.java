import java.util.*;
import java.lang.*;
import java.io.*;
/* Write your Analysis (What is the problem):
The problem is to write a recursive method that parses a string
and then if the string is valid, converts the binary contents 
to decimal. RECURSIVE
*/
/* Write your Design (How to solve the problem):
I plan to have three test cases, the first one checks to see if 
the user entered a string that is empty. If it is empty return the 
0. The second test case will use a helper method to validate if the 
contents of the string entered is a binary number. If it is the second
test case will convert it from binary to decimal, else it will return 
the non binary input.
*/
class BinaryToDecimal{

  // You can add more methods
    public static boolean validateString(String binaryString){
        for(int i = 0; i < binaryString.length(); i++){
            if(binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1')
                return false;
        }
        return true;
    }
    
    public static int binaryToDecimal(String binaryString){
//write your code here
        
        //base case:
        if(binaryString.isEmpty()){
            return 0;
        }
        //if the number is valid, convert to binary
        else if(validateString(binaryString)){
            int binaryNumVersion = binaryString.charAt(0) - '0';
            
            int pow = (int)(Math.pow(2, binaryString.length() -1));
            //recursive call 
            return binaryToDecimal(binaryString.substring(1)) + (binaryNumVersion * pow);
        }
        //if the number doesn't fall into any of the test cases above,
        //return the integer because it can't be converted to binary.
        else {
            return Integer.parseInt(binaryString);
        }
		
	}
}
class DriverMain{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
        System.out.print(BinaryToDecimal.binaryToDecimal(input.nextLine()));
	}
}

