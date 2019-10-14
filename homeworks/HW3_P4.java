import java.util.*;
import java.lang.*;
import java.io.*;

//--------Analysis and Design----------------------
/* Write your Analysis (What is the problem):
The problem is to test the sides of the triangles and see if
the sides are valid. If they are not valid then set the values
to 1. Once all the values are set to a valid value, calculate 
the area and perimeter of the triangle.



Design a Triangle class that extends(inherits) from GeometricObject. The class contains:
 
Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
A no-arg (default) constructor that creates a default triangle with default side values.
A constructor that creates a triangle with the specified side1, side2, and side3.
Note : first determine whether three lengths form a triangle. If not, just use default values for all the sides.
The accessor(getters and setters) methods for all three data fields.
A method named getArea() that returns the double area of this triangle.
A method named getPerimeter() that returns the double perimeter of this triangle.
A method named toString() that returns a string description for the triangle.
The toString() method return example:
                        "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3  + " " + super.toString(); (in java)
                        "Triangle: side1 = " + side1_string  + " side2 = " + side2_string + " side3 = " + side3_string   + " " + Geometric::toString(); (in cpp) // 
NOTE - The side values should be one decimal place only (please see the sample input, output examples).
CPP: In cpp you have to convert the side values from double to string. 
 
*/

/* Write your Design (How to solve the problem):
The design is to create some constructors to make sure the 
values are correct and then write the correct getters and setters
and send the sides through the appropirate functions.

*/
//--------Write your code here---------------------
public class Triangle extends GeometricObject{
	
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
	
	//default constructor
	Triangle(){
		
		
		//creation of triangle
		side1 = 0.0;
		side2 = 0.0;
		side3 = 0.0;
	}
	
	//second default constructor
	Triangle(double a, double b, double c){
		//input a validation
        if((a + b) > c && (a + c) > b && (c + b) > a){
        //if the values are valid
    		side1 = a;
    		side2 = b;
    		side3 = c;
        }
        else{
        	side1 = 1.0;
    		side2 = 1.0;
    		side3 = 1.0;
          }
       
        }
	

	//getter methods
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	//setter methods
	
	public void setSide1() {
		this.side1 = side1;
	}
	
	public void setSide2() {
		this.side2 = side2;
	}
	
	public void setSide3() {
		this.side3 = side3;
	}
	

	
	//function to find the perimeter
	public double getPerimeter() {
		return(side1 + side2 + side3);	
	}
	
	
	 /* method to calculate area of triangle */
 public double getArea() {
    double p = getPerimeter() / 2.0;
    return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
    }

	
	
	public String toString() {
		
		return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3  + super.toString(); 
	}
}






