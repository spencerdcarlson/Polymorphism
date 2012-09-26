import java.awt.Graphics;



public class Circle extends Shape {
	int x;
	int y;
	int width;
	int height;
	
	/**
	 * Create a circle object
	 * @param x Top left x position
	 * @param y Top left y position
	 * @param width Width
	 * @param height Height
	 */
	public Circle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw(Graphics g, boolean fill){
		if (fill){
			g.fillOval(x, y, width, height);
		}else {
			g.drawOval(x, y, width, height);
		}
		
	}
}
