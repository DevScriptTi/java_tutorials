package oop;

import oop.Student.Student;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();// default constructor called.
        s1.printInfo();
        s1.Id = 1;
        s1.name = "John";
        s1.last = "Doe";
        s1.email = "John@gmail.com";
        s1.printInfo();
        Student s2 = new Student(22, "Jane", "Doe", "Jane@gmail.com", "+213-666010843", "Oeb El alwan", "oeb", 10.0);
        s2.printInfo();
        // System.out.println("Student ID: " + s1.Id);
    }

}
