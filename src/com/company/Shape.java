package com.company;

public class Shape {


    private String shapeColor;
    private boolean isFilled;

    public Shape(String shapeColor, boolean isFilled) {

        this.shapeColor = shapeColor;

        this.isFilled = isFilled;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public void printShape(){

        System.out.println("The shape is " + shapeColor + " in color. \n Is it filled in? " + isFilled + ".");


    }




}
