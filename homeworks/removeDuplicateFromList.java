import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;
/* Write your Analysis (What is the problem):
The probelm is to remove the duplicates and then return the new length of it
without the duplicates.
*/

/* Write your Design (How to solve the problem):
I plan keeping an interger number and assigning it to null. After that
I plan on keeping an output number and setting that to zero. After that I want to
loop throught the and check for the duplicates, removing the duplicates. Once the 
duplicates are accounted for I will return the new length back from the function.
*/

class ProblemSolution{
    public static int removeDuplicate(List<Integer> list){
       Integer number = null;
       int newLength =0;
       Iterator<Integer> itr = list.iterator();
       while(itr.hasNext()) {
            Integer nextNum = itr.next();
            if (nextNum.equals(number)) {
                itr.remove();
            } else {
                number = nextNum;
               newLength++;
            }
       }
        return newLength;  
    }
}
