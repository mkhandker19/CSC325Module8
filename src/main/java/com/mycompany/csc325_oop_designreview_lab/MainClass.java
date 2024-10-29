/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;
import java.util.*;
/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class

		Student std1= new Student("James", (short) 20);
                // ToDo 11: Add a toString method for the Senior class

		Freshman fresh1= new Freshman("James", (short) 20, 12); // name, age, credits

                Senior std2 = new Senior("John", (short) 30, 90);

		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.


	  // The user is asked for the GPA for Student, Freshman, and Senior
	  // The GPA fields are read and placed in their respective objects

	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter the GPA for the student: ");
	 double studentGPA = input.nextDouble();
	 std1.setGPA(studentGPA);


	 System.out.print("Enter the GPA for the student: ");
	 double freshGPA = input.nextDouble();
	 fresh1.setGPA(freshGPA);

	 System.out.print("Enter the GPA for the student: ");
	 double seniorGPA = input.nextDouble();
	 std2.setGPA(seniorGPA);

		System.out.println(std1);
		System.out.println(fresh1);
		System.out.println(std2);

		// ToDo 13: add comments and explain your code

	}

}

