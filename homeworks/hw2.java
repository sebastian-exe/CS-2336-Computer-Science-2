/*Write a program that prompts the user to enter
the distance to drive,
the fuel efficiency of the car in miles per gallon,
and the price per gallon,
and displays the cost of the trip.*/
import java.util.*;
import java.lang.*;
import java.io.*;
class ProblemSolution{
    public double getCost(){
        Scanner input = new Scanner(System.in);
        // write your code here
        //data types
        double distance = 0.0, mpg = 0.0, price = 0.0, getCost = 0.0;
        
        //scanner
        Scanner keyboard = new Scanner(System.in);
        
        //prompt and read in the total distance 
        //System.out.println("Please enter the total distance to drive");
        distance = keyboard.nextDouble();
        
        //prompt and read in the total mpg
        //System.out.println("Please enter the fuel efficiency of the car in miles per gallon");
        mpg =  keyboard.nextDouble();
    
        //prompt and read in the price per gallon
        //System.out.println("Please enter the price per gallon");
        price = keyboard.nextDouble();
        
        getCost = (distance / mpg)*price;
        return getCost;
        
	}
}


