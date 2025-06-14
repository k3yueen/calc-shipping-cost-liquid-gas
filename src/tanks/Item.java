//Roza Antonevici
package tanks;

public class Item {
	
	//private item attributes
	private double length; //in m
	private double radius; //in m
	private double weight;// in kg
	private String name;
	
	//constructor
	public Item(String name,double length,double weight) {
		this.name= name;
		this.length = length;
		this.weight= weight;
	}
	// getters and setters
	public double getLength() {
		return length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double Radius) {
		this.radius = radius;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// calculates the volume of item's package
	public double getItemVolume() {
		double volume = this.getLength()*this.getRadius();
		return volume;
		
	}
	// prints specific item's information
	public void printItemInfo() {
		String str;
		str= "Item name: "+ this.name+"/nItem length: "+ this.length+"m"+"\nItem radius: "+ this.radius+"m"+
		"\nItem weight: "+this.weight+"kg"; 
		System.out.println(str);

}
	
	}
	
