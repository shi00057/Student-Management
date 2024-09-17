/*
 * File name: Student.java
 * Author: KAI
 * Course: CST_8284_322_OOP
 * Assignment: Assignment_2
 * Date: 2024-07-11
 * Professor: Saad Inshi
 * Purpose: Complete the task of Assignment_2. 
 * This Java program manages student records at a university, 
 * sorting them by grade using arrays and ArrayLists in the StudentManager class.
 */
package Assignment_2;

/**
 * Represents a student with a name, ID, email, and grade.
 * Implements the Comparable interface to facilitate sorting by grade.
 * @author KAI
 * @version 1.0
 * @since 2024-07-11
 * @see Comparable Used for comparing students based on their grades.

 */
public class Student implements Comparable<Student> {
    private String name;    // The name of the student
    private int id;         // The ID of the student
    private String email;   // The email of the student
    private double grade;   // The grade of the student

    /**
     * Constructs a Student with the specified name, id, email, and grade.
     * 
     * @param name the name of the student
     * @param id the ID of the student
     * @param email the email of the student
     * @param grade the grade of the student
     */
    public Student(String name, int id, String email, double grade) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.grade = grade;
    }

    /**
     * Retrieves the name of the student.
     * 
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     * 
     * @param name the new name of the student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the ID of the student.
     * 
     * @return the ID of the student
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the student.
     * 
     * @param id the new ID of the student
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retrieves the email of the student.
     * 
     * @return the email of the student
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the student.
     * 
     * @param email the new email of the student
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retrieves the grade of the student.
     * 
     * @return the grade of the student
     */
    public double getGrade() {
        return grade;
    }

    /**
     * Sets the grade of the student.
     * 
     * @param grade the new grade of the student
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * Compares this student to another student by grade.
     * 
     * @param other the other student to compare to
     * @return a negative integer, zero, or a positive integer as this student's grade
     *         is less than, equal to, or greater than the other student's grade
     */
    @Override
    public int compareTo(Student other) {
        return Double.compare(this.grade, other.grade);
    }

    /**
     * Returns a string representation of the student.
     * 
     * @return a string representation of the student
     */
    @Override
    public String toString() {
        return String.format("Student|name='%s' id=%d email='%s' grade=%.1f", name, id, email, grade);
    }
}
