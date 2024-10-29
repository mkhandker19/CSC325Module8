/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */

/**
 * extends Human makes the Student class a child of Human
 */
public class Student extends Human{
	// ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors
    /**
     * Constructor for Student that calls the constructor from Human
     * @param name is the name of the student
     * @param age is the age of the student
     */
    public Student(String name, short age){
        super(name, age);
    }

    /**
     * This implements the abstract method setAddress from Human
     */
    private String address;
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method is using the annotation @Override because it is from the Human class.
     * @return the address of the Student
     */
    @Override
    public String getAddress() {
        return this.address;
}
	// ToDo 3: Add a field for GPA and create a setter and a getter
    /**
     * Sets the GPA of the student
     */

    //This holds the GPA the student has earned
    private double GPA;

    public void setGPA(double GPA){
        this.GPA = GPA;
    }

    /**
     * Retrieves the GPA of the student
     * @return the GPA
    */
    public double getGPA(){
        return GPA;
    }

    //This holds the credits the student has earned
    private int credits;

    /**
     * Sets the number of credits the student has earned
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * Returns the credits the student has earned
     */
    public int getCredits() {
        return credits;
    }

    public String toString() {
        return "Student " + getName() + " is " + getAge() + " years old, lives at " + getAddress() +
                ", has a GPA of " + GPA + ", and has earned " + credits + " credits.";
    }
}
    // ToDo 4: Add comments to your code

