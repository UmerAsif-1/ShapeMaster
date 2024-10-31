package smd_groupwork;

public interface CanBeColored {
	// Default implementation of setColor method
    default String setColor(String color) {
        if (color != null) {
        	switch (color.toLowerCase()) {
            case "blue":
                return "Blue"; // Return capitalized Blue
            case "green":
                return "Green"; // Return capitalized Green
            case "red":
                return "Red"; // Return capitalized Red
            case "yellow":
                return "Yellow"; // Return capitalized Yellow
            default:
                return "No color"; // Return if color is invalid
            }
        }
        return "No color"; // Return if color is null
    }

    // Abstract method for getting the color
    String getColor();
}
