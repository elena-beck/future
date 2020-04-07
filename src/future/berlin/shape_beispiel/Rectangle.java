package future.berlin.shape_beispiel;

public class Rectangle extends Shape{
	
protected double xSeitenLänge, ySeitenLänge; 
	
	
	public Rectangle(double x, double y, String form, double xSeitenLänge, double ySeitenLänge) {
		super(x, y, form);
		this.xSeitenLänge = xSeitenLänge;
		this.ySeitenLänge = ySeitenLänge;
		this.area();
		this.circumference();
		
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
