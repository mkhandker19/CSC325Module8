package com.mycompany.csc325_oop_designreview_lab;
/**
 * The Freshman class represents a freshman student and gets its methods and properties from the Student class.
 */
public class Freshman extends Student{
    /**
     * This is my constructor for Freshman class that calls the constructor from Student.
     *
     * @param name which is the name of the freshman
     * @param age which is the age of the freshman
     */
    public Freshman(String name, short age, int credits) {
        super(name, age);
        setCredits(credits);
    }

    /**
     *
     * @return toString method of the description of the Freshman
     */

    @Override
    public String toString() {
        return "Freshman " + getName() + " is " + getAge() + " years old, lives at " + getAddress() +
                ", has a GPA of " + getGPA() + ", and has earned " + getCredits() + " credits.";
    }

}
