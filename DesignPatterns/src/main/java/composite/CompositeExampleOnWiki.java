package composite;

import java.util.ArrayList;
import java.util.List;

/** Client */
public class CompositeExampleOnWiki {

	public static void main(String... args) {
		
		// Initialize "leaves"
		Ellipse ellipse1 = new Ellipse();
		Ellipse ellipse2 = new Ellipse();
		Ellipse ellipse3 = new Ellipse();
		Ellipse ellipse4 = new Ellipse();
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();

		// Initialize three composite graphics
		CompositeGraphic graphic = new CompositeGraphic();
		CompositeGraphic graphic1 = new CompositeGraphic();
		CompositeGraphic graphic2 = new CompositeGraphic();

		// Composes the graphics
		graphic1.add(ellipse1);
		graphic1.add(ellipse2);
		graphic1.add(ellipse3);
		graphic1.add(circle1);

		graphic2.add(ellipse4);
		graphic2.add(circle2);

		graphic.add(graphic1); // when graphic1 holds 3 ellipses, 1 circle
		graphic.add(graphic2); // when graphic2 holds 1 ellipse, 1 circle

		// Prints the complete graphic (four times the string "Ellipse").
		graphic.print();
	}
}

/** "Component" */
interface Graphic {
	// Prints the graphic.
	public void print();
}

/** "Composite" */
class CompositeGraphic implements Graphic {

	// Collection of child graphics.
	private List<Graphic> childGraphics = new ArrayList<>();

	// Adds the graphic to the composition.
	public void add(Graphic graphic) {
		childGraphics.add(graphic);
	}

	// Removes the graphic from the composition.
	public void remove(Graphic graphic) {
		childGraphics.remove(graphic);
	}
	
	@Override // for all group of elements, it holds. 
	public void print() {
		childGraphics.forEach(Graphic::print);
	}
}

/** "Leaf" */
class Ellipse implements Graphic {

	@Override
	public void print() {
		System.out.println("Ellipse");
	} 	
}

/** "Leaf" */
class Circle implements Graphic {
	@Override
	public void print() {	
		System.out.println("Circle");
	}
}
