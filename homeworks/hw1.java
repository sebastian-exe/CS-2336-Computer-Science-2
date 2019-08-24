import java.util.*;
import java.lang.*;
import java.io.*;

/* Write your Analysis (What is the problem):
The problem is to parse an integer and add up al;
the individual parts of it as separate ints
*/

/* Write your Design (How to solve the problem):
I'm going to read in the number, then validate it to make 
sure that it is inbetween 99 and 999, after that I plan on.
getting the remained of the number to the 10th and setting that
equal to a second integer. I want to do this to parse out 
the digit.
*/

class ProblemSolution{
    public int sum(){
        // Write your code here
        int a, b, sum = 0;
    
        // Read number
        Scanner input = new Scanner(System.in);
        //read in the number     
        a = input.nextInt();
        
        //input validation
        if(a < 100 || a > 999){
        
        return -1;
        }
       
        //perform the calculation
        while(a > 0)
        {
            b = a % 10;
            sum = sum + b;
            a = a / 10;
        }
        return sum;
    }
}