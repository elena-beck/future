package future.berlin.shape_beispiel;

public class Square extends Rectangle {

	
	public Square(double x, double y, String form, double xSeite) {
		super(x, y, form, xSeite, xSeite);
		this.xSeitenLänge = xSeite;
		this.ySeitenLänge = xSeite;
		
	}

}