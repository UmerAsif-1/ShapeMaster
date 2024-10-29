package smd_groupwork;

public class ShapeAdapter extends Visibility implements ShapeBasic {
	
	private ShapeSpecial specialShape;
	
	

	public ShapeAdapter(ShapeSpecial specialShape) {
        this.specialShape = specialShape;
    }

	@Override
	public void draw() {
		  // Delegate the drawing to the ShapeSpecial instance if it's available
        if (specialShape != null) {
            specialShape.drawShape();
        } else {
            System.out.println("No special shape to draw.");
        }
    }

	@Override
	public void grow() {
		// Print the name of the shape followed by ", cannot grow"
        if (specialShape != null) {
            System.out.println(printText() + ", cannot grow");
        } else {
            System.out.println("This shape is not supported, cannot grow");
        }
    }

	@Override
	public String printText() {
		// Check if the shape is a known type (Triangle or ShapeDiamond)
        if (specialShape instanceof ShapeDiamond) {
            return "ShapeDiamond";
        } else if (specialShape instanceof Triangle) {
            return "Triangle";
        } else {
            return "This shape is not supported";
        }
    }

	@Override
	public boolean isVisible() {
		return super.isVisible(); // Uses inherited method from Visibility
    }

}
