package smd_groupwork;

public class AdapterMain {
    public static void main(String[] args) {
    	
        // object to manage shapes
        ShapeDrawer drawer = new ShapeDrawer();

        // Create a visible Rectangle object & adding it to the drawer
        Rectangle visibleRectangle1 = new Rectangle(); 
        visibleRectangle1.changeVisibility(); 
        drawer.addBasicShape(visibleRectangle1);

        //Create a hidden Rectangle object and add it to the drawer
        Rectangle hiddenRectangle = new Rectangle();
        // No need to call changeVisibility(), it remains in the background by default
        drawer.addBasicShape(hiddenRectangle);
        
        // Add a visible Circle
        Circle visibleCircle = new Circle();
        visibleCircle.changeVisibility(); // Make it visible
        drawer.addBasicShape(visibleCircle);

        //  Create a hidden Circle object and add it to the drawer
        Circle hiddenCircle = new Circle(); 
        // No need to call changeVisibility(), it remains in the background by default
        drawer.addBasicShape(hiddenCircle);
        
        // Create a second visible Rectangle object & adding it to the drawer
        Rectangle visibleRectangle2 = new Rectangle(); 
        visibleRectangle2.changeVisibility(); 
        drawer.addBasicShape(visibleRectangle2);

        // Step 6: Test drawing all shapes
        drawer.draw(); 
        System.out.println();

        // Step 7: Test growing all shapes
        drawer.grow();
        System.out.println(); 

        // Step 8: Test showing visibility and details of each shape
        drawer.showVisibility();
    }
}

