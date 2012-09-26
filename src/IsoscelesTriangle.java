import java.awt.Graphics;
import java.awt.Polygon;



public class IsoscelesTriangle extends Shape {
	private Polygon triangle;
	
	/**
	 * Create an Isosceles Triangle object
	 * @param x Top x position
	 * @param y Top y position
	 * @param base Length of the base of the triangle
	 * @param height Height of the triangle
	 */
	public IsoscelesTriangle(int x, int y, int base, int height){
		triangle = new Polygon();
		triangle.addPoint(x, y);
		triangle.addPoint( ( x - ( base / 2 ) ), ( y + height ) );
		triangle.addPoint( ( x + ( base / 2 ) ), ( y + height ) );
	}
	
	public void draw(Graphics g, boolean fill){
		if (fill) {
			g.fillPolygon(triangle);
		}else {
			g.drawPolygon(triangle);
		}
	}
}
