//Roza Antonevici
package tanker;

public class Truck {
	
	//private attributes
		private double length;
		private double radius;
		private boolean small;
	
	//constructor
	public Truck (double length, double radius, boolean small) {
		this.length=length;
		this.radius=radius;
		this.small=small; //true if the container is small
			
	}
	//generated getters and setters

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getRadius() {
		return radius;
	}
	
	public boolean isSmall() {
		return small;
	}

	public void setSmall(boolean small) {
		this.small = small;
	}

	//calculates  volume
	public double getVolume() {
		double volume;
		volume= this.length * this.radius;
		return volume;
		
	}
	
	//prints truck info
	public void printTruckInfo() {
		String str;
		str= "Truck length: "+ this.length+"m"+"\nRadius: "+ this.radius+"m"+"\nVolume: "+this.getVolume()+"m3"; 
		System.out.println(str);
		
	}
		

}
