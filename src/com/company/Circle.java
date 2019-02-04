package com.company;

public class Circle extends Shape {


    // Circle should override Shape's printShape() method and should print out a Circle's color,
    // whether or not it is filled, its perimeter and its area.

    private double radius;

    public Circle(String shapeColor, boolean isFilled, double radius) {
        super(shapeColor, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea(){

       return Math.PI * (Math.pow(radius, 2));

    }

    public double getPerimeter(){

        return (2 * (Math.PI*radius));
    }

    @Override
    public void printShape(){
        System.out.println("The circle's color is  " + getShapeColor() + ". \n" +
                "Is the circle filled in? " + isFilled() + ". \n" +
                "The circumference of the circle is " + getPerimeter() + ".\n" +
                "The area of the circle is " + getArea() + ".");



    }

}
