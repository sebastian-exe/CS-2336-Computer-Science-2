import java.util.*;
import java.lang.*;
import java.io.*;
// all the classes in this Solution.java file have to be default visibility. 
// Do NOT change the visibility to public.
// DO not change anything in the Person class Please.


/*For the Person class, create two subclasses named Student and Employee.
Make Faculty and Staff subclasses of Employee.
A person has a name.
A student has a class status varibale of type int with possible 4 status options (1 = FRESHMAN, 2 = SOPHOMORE, 3 = JUNIOR, or 4 = SENIOR).
An employee has a salary (int)
A faculty member has a rank (int).
A staff member has a title (string).
All classes need to have parameterized/custome constructors to set all the variables.*/
class Person{
	private String name;
    //private int status, do i have to put the status here too?
    //or is it inherited from the driver file
	public Person(String name){
		this.name = name;
	}
	
	String getName() {
		return name;
	}
  
	@Override
	public String toString() {
		return this.getClass().getName() + " name is " + this.name;
	}
}

// Please write your code here 

//code for the student class
class Student extends Person{
	 String stuStatus;
	 
    public Student(String name, int status){
    	super(name);
       
        switch(status){
            case 1:
                stuStatus = "FRESHMAN";
                break;
            case 2: 
                stuStatus = "SOPHMORE";
                break;
            case 3:
                stuStatus = "JUNIOR";
                break;
            case 4:
                stuStatus = "SENIOR";
                break;
        }
        
    }
    
     @Override
	public String toString() {
		return this.getClass().getName() + " name is " + getName()
        + " and status is "+ this.stuStatus;
	}
}

//code for the employee class
class Employee extends Person{
	
	int salary = 0; // variable for employee salary
	
	//example for employee class -- Employee name is Emma and salary is 200
	
	//create constructor for employee
	public Employee(String name, int salary) {
		super(name);
		
		//can i do a this salary, wanna assign the variable salary from the employee class to tha to of the passed parameter?
		this.salary = salary;
		
	}
	@Override
	public String toString() {
		return  super.toString()+ " and salary is " + salary;
	}


	
}

	//create the subclass for faculty 
	class Faculty extends Employee {
		
		int rank = 0; //variable for the employee rank
		public Faculty(String name, int salary, int rank) {
			super(name, salary);
			this.rank = rank;
			
		}
		@Override
		public String toString() {
			return super.toString() + " and rank is " + rank;
		}


	}
	
	//subclass of employee for staff 
	class Staff extends Employee {
		String title;
		
		//constructor for the staff
		public Staff(String name, int salary, String title) {
			
			//connect to the super constructor
			super(name, salary);
			//set the title
			this.title = title;	
		}
		//create the string to print, overriding the previous toString call
		@Override
		public String toString() {
			return super.toString() + " and title is " + title;
		}
	}

