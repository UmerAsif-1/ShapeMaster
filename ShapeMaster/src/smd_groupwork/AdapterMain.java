package smd_groupwork;


public class AdapterMain {
    public static void main(String[] args) {
    	
        // object to manage shapes
        ShapeDrawer drawer = new ShapeDrawer();

        // Create a visible Rectangle object & adding it to the drawer
        Rectangle visibleRectangle1 = new Rectangle();  
        drawer.addBasicShape(visibleRectangle1);

        //Create a hidden Rectangle object and add it to the drawer
        Rectangle hiddenRectangle = new Rectangle();
        // No need to call changeVisibility(), it remains in the background by default
        hiddenRectangle.changeVisibility();
        drawer.addBasicShape(hiddenRectangle);
        
        // Add a visible Circle
        Circle visibleCircle = new Circle();
        drawer.addBasicShape(visibleCircle);

        //  Create a hidden Circle object and add it to the drawer
        Circle hiddenCircle = new Circle(); 
        // need to call changeVisibility(), it should be visible by default
        hiddenCircle.changeVisibility(); // Make it invisible
        drawer.addBasicShape(hiddenCircle);
        
        // Create a second visible Rectangle object & adding it to the drawer
        Rectangle visibleRectangle2 = new Rectangle();  
        drawer.addBasicShape(visibleRectangle2);
     
        // Add a triangle which is visible with color "Other color" using ShapeAdapter
        Triangle visibleTriangle = new Triangle();
        ShapeAdapter triangleAdapter = new ShapeAdapter(visibleTriangle); 
        visibleTriangle.setColor("Other color");
        drawer.addBasicShape(triangleAdapter);
        
        // Add a diamond shape which is visible with color "PURPLE" using ShapeAdapter
        ShapeDiamond purpleDiamond = new ShapeDiamond("PURPLE");
        ShapeAdapter purpleDiamondAdapter = new ShapeAdapter(purpleDiamond);
        drawer.addBasicShape(purpleDiamondAdapter);

        // Add a diamond shape which is in the background with color "somethingElse" using ShapeAdapter
        ShapeDiamond hiddenDiamond = new ShapeDiamond("somethingElse");
        ShapeAdapter hiddenDiamondAdapter = (new ShapeAdapter(hiddenDiamond));
        drawer.addBasicShape(hiddenDiamondAdapter);
        hiddenDiamondAdapter.changeVisibility();
        // Add a diamond shape with values 4.0 and 4.0, in the background, with color "Yellow" using ShapeAdapter
        ShapeDiamond yellowDiamond = new ShapeDiamond(4.0, 4.0, "Yellow");
        ShapeAdapter yellowDiamondAdapter = (new ShapeAdapter(yellowDiamond));
        drawer.addBasicShape(yellowDiamondAdapter);
        yellowDiamondAdapter.changeVisibility();

        // Add a triangle with values 6.0, 6.0, and 6.0, in the background, with color "Blue" using ShapeAdapter
        Triangle blueTriangle = new Triangle(6.0, 6.0, 6.0);
        ShapeAdapter blueTriangleAdapter = new ShapeAdapter(blueTriangle);
        blueTriangle.setColor("Blue");
        drawer.addBasicShape(blueTriangleAdapter);
        blueTriangleAdapter.changeVisibility();

        // Add a diamond shape with values 1.0 and 1.0, visible, with color "Green" using ShapeAdapter
        ShapeDiamond greenDiamond = new ShapeDiamond(1.0, 1.0, "Green");
        ShapeAdapter greenDiamondAdapter = new ShapeAdapter(greenDiamond);
        drawer.addBasicShape(greenDiamondAdapter);

        // Add a brush stroke which is in the background
        BrushStroke hiddenBrushStroke = new BrushStroke();
        hiddenBrushStroke.changeVisibility();
        drawer.addBasicShape(hiddenBrushStroke);

        // Add a brush stroke which is visible with color "someColor"
        BrushStroke someColorBrush = new BrushStroke();
        someColorBrush.setColor("someColor");
        drawer.addBasicShape(someColorBrush);

        // Add a brush stroke which is visible and has color "RED"
        BrushStroke redBrush = new BrushStroke();
        redBrush.setColor("RED");
        drawer.addBasicShape(redBrush);

        // Draw the shapes on the drawer
        drawer.draw();
        System.out.println();

        // Grow the shapes in the drawer
        drawer.grow();
        System.out.println();

        // Show visibility and details of each shape
        drawer.showVisibility();
    }
}