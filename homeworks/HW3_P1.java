/*
HW3_P1 - Student list using array
Given a Student class, create a class with following characteristics:
The class name should be ClassRoom.
Private variable students array to maintain the list of Student objects.
Function addStudent with input parameter name (string) and rollNo(int) adds a new student in “students” list. 
Method getAllStudents should return all the students in ClassRoom.
 
Input
    Jack
    1
    Jones
    2
    Marry
    3
 
    where,
First & Second line represent a student’s name and roll number. And so on.
 
Output
    1 - Jack 
    2 - Jones
    3 - Marry
 
*/

import java.util.*;
/* Write your Analysis (What is the problem):
The probelm is to fill out the students array with the 
students name and their information
*/

/* Write your Design (How to solve the problem):
I plan on filling in the provided methods with the correct 
attributes to be able to correctly add the information needed
and then set the information to the correct index of the array.
*/
	

class Student {
	private String name;
	private int rollNo;
	
    //return name
	public String getName() {return name;}
    
    //set the name of the read in student in the arry                        
	public	void setName(String name) {
        this.name = name;
    }
    
    //return the student roll number
	public int getRollNo() {return rollNo;}
    
    //set the student roll number
	public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
};

class ClassRoom {

	private int i;
	private Student[] students = new Student[10];

	public void addStudent(String name, int rollNo) {
        //create the new instance of the student
        students[i] = new Student();
        
        //set the name and number for the student index
        students[i].setName(name);
        students[i].setRollNo(rollNo);
        
        //increment the index for the next student
        i++;
    }
	public Student[] getAllStudents() {return students;}
};


