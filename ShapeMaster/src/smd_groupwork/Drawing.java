package smd_groupwork;

import java.util.ArrayList;
import java.util.List;

public abstract class Drawing<T> {
	
	// List to hold the elements of any type 
	public List<T> shapes = new ArrayList<>();
	
	// To add an element to the list
	public void addBasicShape(T element) {
		if (element != null) {
            shapes.add(element); // Add element it's not null
        }
		
	}
	
	// Method to return a new list of all elements in the Drawing
	public List<T> getBasicShape(){

	// Return a new list containing everything
		return new ArrayList<>(shapes); 
	}

	// Abstract method for draw
    public abstract void draw();

}
