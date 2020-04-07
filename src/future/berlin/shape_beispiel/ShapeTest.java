package future.berlin.shape_beispiel;


public class ShapeTest {
	public static void main( String[] args ) 
	{
		Circle Kreis1 = new Circle (40, 40, 50,"Kreis");
		Kreis1.to_String();
		Rectangle Rectangle1 = new Rectangle (40, 40, "Rectangle", 20, 20);
		Rectangle1.to_String();
	}
}
