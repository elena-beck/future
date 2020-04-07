package future.berlin.shape;

public class Circle extends Shape{
	
	protected double radius;
	protected double pi = 3.14;
	
	
	
	public Circle(double x, double y, double radius ) {
		super(x, y);
		this.form = "CIRCLE";
		this.radius = radius;
	}

	/**
	 * berechnet die Fläche
	 */
	public double area() {
	
		this.fläche = this.pi*this.radius*this.radius;
		return this.fläche;
	}
	
	/**
	 * berechnet den Umfang
	 * @return
	 */
	public  double circumference() {
		this.umfang = 2*this.pi*this.radius;
		return this.umfang;
	}
	
}
