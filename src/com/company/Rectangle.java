package com.company;

public class Rectangle extends Shape {

    //4. Create a class named Rectangle, which inherits from Shape.
    // Rectangle should have (2) properties (in addition to the 2 it inherits from Shape):
    // width (a double) and length (a double).
    // Rectangle should have a constructor which sets all of its properties, using super() to set its inherited properties
    // Rectangle should also have (2) methods: getArea() which returns the Rectangle's area, and get Perimeter()
    // which returns the Rectangle's perimeter.
    // Rectangle should override Shape's printShape() method and
    // should print out a Rectangle's color, whether or not it is filled, its perimeter and its area.

    private double length;
    private double width;

    public Rectangle(String shapeColor, boolean isFilled, double length, double width){
        super(shapeColor, isFilled);
        this.length = length;
        this.width= width;
    }

    public void setLength(double length){

        this.length = length;
    }
    public double getLength(){
        return length;
    }

    public void setWidth(double width){

        this.width = width;

    }

    public double getWidth(){

        return width;

    }

    public double getArea(){

        return length * width;
    }

    public double getPerimeter(){

        return 2 * (length + width);

    }


    @Override
   public void printShape(){

        System.out.println("The rectangle's color is "  + getShapeColor() + ".\n" +
                "Is the rectangle filled in? " + isFilled() + ". \n" +
                "The area of the rectangle is " + getArea() + ". \n" +
                "The perimeter of the rectangle is " + getPerimeter() + ".");
    }

}
