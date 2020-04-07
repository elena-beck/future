package future.berlin.shape_beispiel;

public class Shape 
{
	protected double fläche;
	protected double umfang;
	protected String form;
	private double xOrgin, yOrgin;
	
	public Shape(double x, double y, String form) 
	{
		this.xOrgin = x;
		this.yOrgin = y;
		this.form=form;
	}
	
	public void origin(){
		System.out.println("Koordinaten sind auf x: " + this.xOrgin + ", auf y: " + this.yOrgin);
	}
	
	public void to_String()
	{
		System.out.println(" Ausgabe: "+this.form+" hat eine Fläche von "+this.fläche+" und einen Umfang von "+this.umfang);
	}
	
	public void setxOrigin(double x) 
	{
		this.xOrgin = x;
	}
	
	public void setyOrigin(double y) 
	{
		this.yOrgin = y;
	}
}
