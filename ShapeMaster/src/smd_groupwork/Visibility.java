package smd_groupwork;

public abstract class Visibility {

		public boolean inBackground = false;
		
		public void changeVisibility() {
			inBackground = !inBackground;
		}
		
		public boolean isVisible() {
			return !inBackground;
			
		}

	


}
