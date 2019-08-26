/*Write a program that prompts the user to enter two strings and reports whether the second string is a substring of the first string.
 */

import java.util.*;

//Your program will be evaluated by this DriverMain class and several test cases.
public class DriverMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         //write your code here
        String s1, s2;
        
        //read in both strings
       s1 = input.nextLine();
       s2 = input.nextLine();
        
        //check the substring
        if(s1.indexOf(s2) != -1){
            System.out.printf("s2 is a substring of s1");
        }else{
        System.out.printf("s2 is not a substring of s1");
        }
     
    }
}






