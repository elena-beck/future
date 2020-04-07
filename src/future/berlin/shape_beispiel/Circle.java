package future.berlin.shape_beispiel;

public class Circle extends Shape {
	private double radius;
	private double pi = 3.14;
	
	public Circle(double x, double y, double radius, String form ) {
		super(x, y, form);
		this.radius = radius;
		this.area();
		this.circumference();
	}
	
	/**
	* berechnet die Fläche
	*/
	private void area() {
		this.fläche = this.pi*this.radius*this.radius;
	}
	
	/**
	* berechnet den Umfang
	* @return
	*/
	private void circumference() {
		this.umfang = 2*this.pi*this.radius;
	}
	
}
