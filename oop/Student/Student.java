package oop.Student;

public class Student {
    public int Id; // 0
    public String name; // null
    public String last; // null
    public String email; // null
    public String phone; // null
    public String address; // null
    public String city; // null
    public Double gpa; // 0.0
    // default default constructor
    // default constructor

    public Student() {
        System.out.println("Default constructor called.");
        this.Id = 12;
        this.name = "uknown";
        this.last = "uknown";
        this.email = "username@gmail.com";
        this.phone = "+213-xxxxxxx";
        this.address = "uknown";
        this.city = "uknown";
        this.gpa = 0.0;
    }

    // constructor with parameters
    public Student(int id, String name, String last, String email, String phone, String address, String city,
            Double gpa) {
        this.Id = id;
        this.name = name;
        this.last = last;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.gpa = gpa;

    }

    public void presentCourse() {
        System.out.println("I am " + name + " " + last + " and I am taking a course.");
    }

    public void printInfo() {
        System.out.println("Student ID: " + Id);
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + last);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("City: " + city);
        System.out.println("GPA: " + gpa);
        System.out.println("===================================");
    }

}