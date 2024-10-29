package smd_groupwork;

import java.text.DecimalFormat;


public class ShapeDiamond implements ShapeSpecial, CanBeColored {
	private double a = 2.0;
    private double b = 2.0;
    private String color = "No Color"; // Default color
    private static DecimalFormat df2 = new DecimalFormat("#.##");

 // Constructor with one parameter for color
    public ShapeDiamond(String color) {
        this.color = setColor(color); // Set color using the setColor method
    }

    // Constructor with two parameters for sides
    public ShapeDiamond(double a, double b) {
        this.a = (a >= 2.0) ? a : 2.0; // Set side a with minimum value
        this.b = (b >= 2.0) ? b : 2.0; // Set side b with minimum value
    }

    // Constructor with three parameters for sides and color
    public ShapeDiamond(double a, double b, String color) {
        this(a, b); // Call the two-parameter constructor
        this.color = setColor(color); // Set color using the setColor method
    }
 // Method to calculate the area of the diamond
    @Override
    public double calculateArea() {
        return (a * b) / 2; // Area formula for a diamond (rhombus)
    }

    // Method to calculate the perimeter of the diamond
    @Override
    public double calculatePerimeter() {
        return 2 * (a + b); // Perimeter formula
    }

    // Method to draw the shape (output the details)
    @Override
    public void drawShape() {
        System.out.println("This is a diamond shape with area: " + df2.format(calculateArea()) +
                " and perimeter: " + df2.format(calculatePerimeter()) + ". Color: " + getColor());
    }

    // Method to set the color of the shape
    @Override
    public String setColor(String color) {
        if (color != null && (color.equals("Blue") || color.equals("Green") || 
                              color.equals("Red") || color.equals("Yellow"))) {
            this.color = color;
        }
        return this.color;
    }

    // Method to get the color of the shape
    @Override
    public String getColor() {
        return color.equals("No Color") ? "The shape is not colored" : color;
    }
}