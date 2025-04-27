package oop.Math;

public class Rectangle {
    public double length;
    public double width;
    public double area;
    public double perimeter;
    public String color;

    public void calculateArea() {
        area = length * width;
    }

    public void calculatePerimeter() {
        this.perimeter = 2 * (this.length + this.width);
    }

    public void addValue(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void printInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Color: " + color);
        System.out.println("===================================");
    }
}
