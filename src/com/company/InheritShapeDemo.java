package com.company;

public class InheritShapeDemo {

    public static void main(String[] args) {


        Circle circle = new Circle("Red", true, 5.6);
        circle.printShape();
        Rectangle rectangle = new Rectangle("Orange", false, 5.4, 7.6);
        rectangle.printShape();






    }
}
