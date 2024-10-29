package smd_groupwork;

public interface CanBeColored {
	// Default implementation of setColor method
    default String setColor(String color) {
        if (color != null) {
            switch (color) {
                case "Blue":
                case "Green":
                case "Red":
                case "Yellow":
                    return color; // Return the matching color
                default:
                    return "No color"; // Return if color is invalid
            }
        }
        return "No color"; // Return if color is null
    }

    // Abstract method for getting the color
    String getColor();
}
