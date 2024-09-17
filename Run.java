/*
 * File name: Run.java
 * Author: Guoakai, 040946936
 * Course: CST_8284_322_OOP
 * Assignment: Assignment_2
 * Date: 2024-07-11
 * Professor: Saad Inshi
 * Purpose: Complete the task of Assignment_2. 
 * This Java program manages student records at a university, 
 * sorting them by grade using arrays and ArrayLists in the StudentManager class.
 */
package Assignment_2;

import java.util.Arrays;

/**
 * Demonstrates sorting of students using both arrays and ArrayLists.
 * @author Guokai Shi
 * @see Student Represents the student entity used in this demonstration.
 * @see StudentManager Manages the list of students and demonstrates sorting.
 * @version 1.0
 * @since 2024-07-11
 */
public class Run {
    /**
     * The main method to demonstrate polymorphism with product details.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        /*
         * Instantiate four Student objects with different values.
         */
        Student student1 = new Student("Alice", 1, "alice@example.com", 3.5);
        Student student2 = new Student("Bob", 3, "bob@example.com", 3.8);
        Student student3 = new Student("Charlie", 2, "charlie@example.com", 3.2);
        Student student4 = new Student("Diana", 4, "diana@example.com", 3.9);

        /*
         * Store these student objects in a simple array.
         */
        Student[] studentArray = { student1, 
        						   student2, 
        						   student3, 
        						   student4 };

        /*
         *  Store these student objects in an ArrayList managed by StudentManager.
         */
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);

        /*
         *  Print the contents of the array before sorting.
         */
        System.out.printf("%s%n","Array before sorting:");
        for (Student student : studentArray) {
            System.out.println(student);
        }

        /*
         *  Sort the array using Arrays.sort() method.
         *  compareTo method is overridden, 
         *  Arrays.sort() sorts based on grade in the described scenario.
         */
        Arrays.sort(studentArray);

        /*
         *  Print the contents of the array after sorting.
         */
        System.out.printf("%n%s%n","Array after sorting:");
        for (Student studentAfterSort : studentArray) {
            System.out.println(studentAfterSort);
        }

        /*
         *  Print the contents of the ArrayList before sorting.
         */
        System.out.printf("%n%s%n","ArrayList before sorting:");
        studentManager.displayStudents();

        /*
         *  Sort the ArrayList using the StudentManager class.
         */
        studentManager.sortStudents();

        /*
         *  Print the contents of the ArrayList after sorting
         */
        System.out.printf("%n%s%n","ArrayList after sorting:");
        studentManager.displayStudents();
    }
}
