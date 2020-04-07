package future.berlin.shape;

public class Square extends Rectangle {

	
	public Square(double x, double y, double xSeite) {
		super(x, y, xSeite, xSeite);
		super.area();
		super.circumference();
	}

}
