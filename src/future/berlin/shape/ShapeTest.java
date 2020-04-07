package future.berlin.shape;

public class ShapeTest {
	
	public static void main( String[] args ) {
		
		// "Rectangle"
		Rectangle rectangle = new Rectangle (20, 30, 40, 50);
		rectangle.area();
		rectangle.circumference();
		System.out.println(rectangle.printOut());
		
		//"Circle"
		Circle circle = new Circle (40, 40, 50);
		circle.area();
		circle.circumference();
		System.out.println(circle.printOut());
		
		//"Square"
		Square square = new Square (30, 40, 50);
		square.area();
		square.circumference();
		System.out.println(square.printOut());
		
		
		
	}
}
