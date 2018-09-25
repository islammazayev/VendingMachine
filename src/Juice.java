import Util.Section;

public class Juice extends Product{
	
	public Juice(String Name, double Price, Section juice) {
		super(Name, Price);
		this.section = juice;

	}
	
	public void Info()
	{
		System.out.println("\nSection: " + section 
				+ "\nName: " + name 
				+"\nPrice: " + price);
	}

}
