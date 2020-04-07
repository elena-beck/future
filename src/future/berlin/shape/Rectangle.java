package future.berlin.shape;

public class Rectangle extends Shape{
	
	protected double xSeitenLänge, ySeitenLänge; 
	
	
	public Rectangle(double x, double y, double xSeitenLänge, double ySeitenLänge) {
		super(x, y);
		this.form = "RECTANGLE";
		this.xSeitenLänge = xSeitenLänge;
		this.ySeitenLänge = ySeitenLänge;
		
	}
	
	public double area() {
		this.fläche = this.xSeitenLänge*this.ySeitenLänge;
		return this.fläche ;
	}
	
	public double circumference() {
		this.umfang = 2*this.xSeitenLänge + 2*this.ySeitenLänge;
		return this.umfang;
	}
	
}


