import java.awt.Graphics;


public class Square extends Shape {
	int x;
	int y;
	int width;
	int height;
	
	/**
	 * Create a square object
	 * @param x Top left x position
	 * @param y Top left y position
	 * @param width Width
	 * @param height Height
	 */
	public Square(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}

	
	@Override
	public void draw(Graphics g, boolean fill){
		if (fill){
			g.fillRect(x, y, width, height);
		}else {
			g.drawRect(x, y, width, height);
		}
		
	}
}
