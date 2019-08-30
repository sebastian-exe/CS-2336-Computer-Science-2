import java.util.*;

//Sebastian Moreno, SXS170103, 2336.006


/* Write your Analysis (What is the problem):
The problem is to recreate a pattern number pyramid
*/


/* Write your Design (How to solve the problem):
At first I chose to read in the number from the keyboard
buffer. Then I made a postion variable and set that
to position equal to the number  divided by 2 plus one
to achieve the number of spaces at every level of the
pyramid. Then I used three for loops, the first one
for the rows, the second one for the spaces, and the
third one for the numbers. After that I implemented a
flag to reverse the master for loop and print the
numbers backwards.
*/
public class Solution {
    public static void main(String[] args) {
        //Write your code here
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
   // System.out.println(num);
    //positon
  int p = (num/2) + 1;
  int counter = 1,  line = 1;
 // System.out.println(p);
   boolean flag = false;

   for(int i = 1; i <= num; i++){
       for(int x = 2; x <= p; x++){
       System.out.print(" ");
       }
       for(int y = 1; y <= line; y++){
           System.out.print(counter);
           System.out.print(" ");
           counter++;
       }
     System.out.print("\n");

       if(p == 1){
       flag = true;
       }
      if(flag == false){
          p--;
          line++;

      }else{
        p++;
        counter = counter - 2*(line) + 1;
        line--;
      }

   }

    }
}
