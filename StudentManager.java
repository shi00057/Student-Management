/*
 * File name: StudentManager.java
 * Author: Kai
 * Course: CST_8284_322_OOP
 * Assignment: Assignment_2
 * Date: 2024-07-11
 * Professor: Saad Inshi
 * Purpose: Complete the task of Assignment_2. 
 * This Java program manages student records at a university, 
 * sorting them by grade using arrays and ArrayLists in the StudentManager class.
 */
package Assignment_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Manages a list of students.
 * @author Kai
 * @version 1.0
 * @since 2024-07-11
 * @see Student Represents the student entity managed by this class.
 * @see Comparable Used for comparing students based on their grades.
 */
public class StudentManager {
    private List<Student> students;  // List to store the students

    /**
     * Constructs a StudentManager with an empty list of students.
     */
    public StudentManager() {
        this.students = new ArrayList<>();
    }

    /**
     * Adds a student to the list.
     *
     * @param student the student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Removes a student from the list.
     *
     * @param student the student to be removed
     */
    public void removeStudent(Student student) {
        students.remove(student);
    }

    /**
     * Sorts the students in the list by grade.
     */
    public void sortStudents() {
        Collections.sort(students);
    }

    /**
     * Displays the list of students.
     */
    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    /**
     * Returns the list of students.
     *
     * @return the list of students
     */
    public List<Student> getStudents() {
        return students;
    }
}
