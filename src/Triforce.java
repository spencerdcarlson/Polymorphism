import java.awt.Graphics;


public class Triforce extends Shape {
	Shape triangle1;
	Shape triangle2;
	Shape triangle3;
	
	/**
	 * Create a triforce object
	 * @param x Top x position of the top triangle
	 * @param y Top y position of the top triangle
	 * @param base Length of the base of each individual triangle
	 * @param height Height of each individual triangle
	 */
	public Triforce(int x, int y, int base, int height){
		triangle1 = new IsoscelesTriangle(x,y,base,height);
		triangle2 = new IsoscelesTriangle(x-(base/2),y+height,base,height);
		triangle3 = new IsoscelesTriangle(x+(base/2),y+height,base,height);
	}
	
	// When drawing a triforce object always fill in the triangles
	@Override
	public void draw (Graphics g, boolean fill){
		triangle1.draw(g,true);
		triangle2.draw(g,true);
		triangle3.draw(g,true);
	}
}
