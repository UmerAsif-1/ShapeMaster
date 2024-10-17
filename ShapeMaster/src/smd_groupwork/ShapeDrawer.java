package smd_groupwork;

import java.util.ArrayList;
import java.util.List;


public class ShapeDrawer extends Drawing<ShapeBasic> {
	//Implement the draw() method
	public void draw() {
		if (shapes.isEmpty()) {
            System.out.println("Drawing is empty!");
	} else {
		for(ShapeBasic shape: shapes) {
			shape.draw();
			}
		}
	}
	//grow() method
	public void grow() {
		if (shapes.isEmpty()) {
			System.out.println("Drawing is empty!");
		} else {
			for(ShapeBasic shape:shapes) {
				shape.grow();
			}
		}
	}
	// showVisibility() method
    public void showVisibility() {
        if (shapes.isEmpty()) {
            System.out.println("Drawing is empty!");
        } else {
            int index = 1;
            for (ShapeBasic shape : shapes) {
                String visibility = shape.isVisible() ? "visible" : "in the background";
                System.out.println(index + ". shape is " + visibility + ": " + shape.printText());
                index++;
            }
            System.out.println("Total number of shapes: " + shapes.size());
        }
    }
}
