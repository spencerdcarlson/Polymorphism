import java.awt.Color;
import java.awt.Graphics;



public class Shape {
	
	// Default shape color
	protected Color shapeColor = Color.WHITE;
	
	// Change the default shape color
	public void setShapeColor(Color c){
		this.shapeColor = c;
	}

	/**
	 * Method to be overridden by each child class
	 * @param g Graphics object to be passed in from JApplet paint
	 * @param fill Fill in the object?
	 */
	public void draw(Graphics g, boolean fill){
	
	}
	


	
	
}
