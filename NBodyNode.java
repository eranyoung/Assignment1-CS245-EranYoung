
//Represents a celestial body

public class NBodyNode{

	private String name = "";
	private double mass, x, y, x_veloc, y_veloc;
	private int size;

	public NBodyNode(String name, String mass, String x, String y, 
		String x_veloc, String y_veloc, String size){

		this.name = name; 
		this.mass = Double.parseDouble(mass);
		this.x = Double.parseDouble(x);
		this.y = Double.parseDouble(y);
		this.x_veloc = Double.parseDouble(x_veloc);
		this.y_veloc = Double.parseDouble(y_veloc);
		this.size = Integer.parseInt(size);
	}

	public String name(){
		return this.name;
	}

	public double getMass(){
		return this.mass;
	}

	public double getX(){
		return this.x;
	}

	public void setX(double x){
		this.x = x;
	}

	public double getY(){
		return this.y;
	}

	public void setY(double y){
		this.y = y;
	}

	public double getXVeloc(){
		return this.x_veloc;
	}

	public void setXVeloc(double x_veloc){
		this.x_veloc = x_veloc;
	}

	public double getYVeloc(){
		return this.y_veloc;
	}

	public void setYVeloc(double y_veloc){
		this.y_veloc = y_veloc;
	}

	public int size(){
		return this.size;
	}

	public String toString(){
		String output = "";
		output = output + "\n\tName: " + this.name;
		output = output + "\n\tMass: " + this.mass;
		output = output + "\n\tX Coord: " + this.x;
		output = output + "\n\tY Coord: " + this.y;
		output = output + "\n\tX Velocity: " + this.x_veloc;
		output = output + "\n\tY Velocity: " + this.y_veloc;
		output = output + "\n\tSize: " + this.size;

		return output;
	}
}