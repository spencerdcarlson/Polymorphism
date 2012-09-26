import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JApplet;


@SuppressWarnings("serial")
public class Main extends JApplet {
	private List<Shape> shapes = new ArrayList<Shape>();
	
	public void init(){
		// Create Shapes
		Shape square = new Square(5, 5, 50,50);
		Shape circle = new Circle(100,5,50,50); 
		Shape triangle = new IsoscelesTriangle(70,50,100,50);
		
		// Create Triforce
		Shape triforce = new Triforce(200, 200, 100, 50);
		triforce.setShapeColor(Color.YELLOW);
		
		// Add shapes to arrayList
		shapes.add(triangle);
		shapes.add(square);
		shapes.add(circle);
		shapes.add(triforce);
		
	}
	
	@Override
	public void paint(Graphics g){
		// Set Color and draw background 
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		// Draw every shape in the arrayList
		// Polymorphism: The same message call ( .draw ) executes different code depending on the child type 
		for(Shape s: shapes){
			g.setColor(s.shapeColor);
			s.draw(g,false);
		}
	}
}
