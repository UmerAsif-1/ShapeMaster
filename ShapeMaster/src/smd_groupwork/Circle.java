package smd_groupwork;

public class Circle extends Visibility implements ShapeBasic {

	@Override
	public void draw() {
		System.out.println("This is a circle");

	}

	@Override
	public void grow() {
		System.out.println("Growing the size of the circle");

	}

	@Override
	public String printText() {
		// TODO Auto-generated method stub
		return "Circle";
	}

	@Override
	public boolean isVisible() {
		
		return super.isVisible();
	}

}
