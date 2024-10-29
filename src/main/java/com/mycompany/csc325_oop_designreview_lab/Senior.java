package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student{
    /**
     * Constructor for Senior that calls the constructor from Student.
     * This also ensures the senior student has a minimum of 85 credits.
     *
     * @param name the name of the senior
     * @param age the age of the senior
     * @param credits the number of credits the senior has
     * @throws IllegalArgumentException if credits are less than 85
     */
    public Senior(String name, short age, int credits) {
        super(name, age);
        if (credits < 85) {
            throw new IllegalArgumentException("Seniors must have at least 85 credits.");
        }
        setCredits(credits);
    }

    /**
     *
     * @return toString method of the description of the Senior
     */

    @Override
    public String toString() {
        return "Senior " + getName() + " is " + getAge() + " years old, lives at " + getAddress() +
                ", has a GPA of " + getGPA() + ", and has earned " + getCredits() + " credits.";
    }

}
