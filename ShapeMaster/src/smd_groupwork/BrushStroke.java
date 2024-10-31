package smd_groupwork;

import java.util.Random;

public class BrushStroke extends Visibility implements ShapeBasic, CanBeColored {
	private final int thickness;
	private  String color = "Yellow";
	
	public BrushStroke() {
		Random random = new Random();
	    this.thickness = random.nextInt(10) + 1; // range 1-10
	    }

	@Override
    public void draw() {
        System.out.println("Brush strokes with thickness " + thickness);
    }

    @Override
    public void grow() {
        System.out.println("Adding some color... " + getColor());
    }

    @Override
    public String printText() {
        return "Brush Stroke";
    }

    @Override
    public String setColor(String newColor) {
    	this.color = CanBeColored.super.setColor(newColor);;
        return this.color;
    }

    @Override
    public String getColor() {
        if ("No color".equals(color)) {
            return "Out of color...";
        } else {
            return color;
        }
    }
}