package future.berlin.shape;

public  class Shape {
	
	protected double fläche;
	protected double umfang;
	protected String form;
	protected double xOrgin, yOrgin;
	

	public Shape(double x, double y) {
		this.xOrgin = x;
		this.yOrgin = y;
	}
		
	
	/**
	 * berechnet die Fläche
	 */
	public double area() {
		return this.fläche;
	}
	
	/**
	 * berechnet den Umfang
	 * @return
	 */
	public double circumference() {
		return this.umfang;
	}
	
	/**
	 * beschreibt die form
	 */
	public String form() {
		return this.form;
	}
	
	/**
	 * gibt beide Positionen (xOrgin und Yorgin) als einen String an den Aufruf zurück
	 * @return
	 */
	public  String origin(){
		return "Koordinaten sind auf x: " + this.xOrgin + ", auf y:  " + this.yOrgin;
	}
	
	public  String printOut(){
		String s = origin();
		s = s + "This is a " + this.form + "\n";
		s = s + "Fläche ist: " + this.fläche + "\n";;
		s = s + "Umfang ist: " + this.umfang + "\n";;
		
		return s; 
	}
	

	
}

