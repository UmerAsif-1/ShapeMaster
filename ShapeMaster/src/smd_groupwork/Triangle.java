package smd_groupwork;

import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial, CanBeColored {
	private double a = 3.0; // Default value
    private double b = 3.0; // Default value
    private double c = 3.0; // Default value
    private String color = "No color"; // Default color
    private static DecimalFormat df2 = new DecimalFormat("#.##"); // Static for decimal formatting
	
    
    // Constructor with no parameters
    public Triangle() {
        // Default values are set
    }
    
    // Constructor with color
    public Triangle(String color) {
        this.color = color;
    }
    
    // Constructor with three double parameters
    public Triangle(double a, double b, double c) {
        if (a >= 3.0 && b >= 3.0 && c >= 3.0) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    // Constructor with parameters for sides and color
    public Triangle(double a, double b, double c, String color) {
        if (a >= 3.0 && b >= 3.0 && c >= 3.0) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        this.color = color;
    }

	@Override
    public double calculateArea() {
        double p = (a + b + c) / 2; // Half perimeter
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Heron's formula
    }

	@Override
    public double calculatePerimeter() {
        return a + b + c; // Perimeter calculation
    }

	@Override
    public void drawShape() {
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        System.out.println("This is a triangle with area: " + df2.format(area) +
                           " and perimeter: " + df2.format(perimeter) + 
                           ". Color: " + color);
    }
	@Override
    public String setColor(String color) {
	    // Use the method from CanBeColored interface
	    this.color = CanBeColored.super.setColor(color);
	    return this.color;
	}

    @Override
    public String getColor() {
        return this.color;
    }

}
