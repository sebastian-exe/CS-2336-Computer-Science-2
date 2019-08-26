/*Write a program that prompts the user to enter a Social Security Number in the format DDD-DD-DDDD, where D is a digit. Your program should check whether the input is valid.
 */

import java.util.*;
import java.lang.*;
import java.io.*;
class ProblemSolution{
    public boolean isValid(){
        // Write your code here 
        String ssn;
        // Read the SSN
        Scanner input = new Scanner(System.in);
        
        //set the string equal to the keyboard input
        ssn = input.nextLine();
    
        boolean isValid = 
            (ssn.length() == 11) &&
            (Character.isDigit(ssn.charAt(0))) && 
            (Character.isDigit(ssn.charAt(1))) &&
            (Character.isDigit(ssn.charAt(2))) &&
            (ssn.charAt(3) == '-') &&
            (Character.isDigit(ssn.charAt(4))) &&
            (Character.isDigit(ssn.charAt(5))) &&
            (Character.isDigit(ssn.charAt(7))) &&
            (ssn.charAt(6) == '-') &&
            (Character.isDigit(ssn.charAt(8))) &&
            (Character.isDigit(ssn.charAt(9))) &&
            (Character.isDigit(ssn.charAt(10)));
            
        if(isValid){
        return true;
        }
        else{
        return false;
        }
    
        
     
    }
    
}






