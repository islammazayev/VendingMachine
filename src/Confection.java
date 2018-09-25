import Util.Section;

public class Confection extends Product {
	
	public Confection(String Name, double Price, Section confection) {
		super(Name, Price);
		this.section = confection;

		
	}
	
	public void Info()
	{
		System.out.println("\nSection: " + section 
				+ "\nName: " + name 
				+"\nPrice: " + price);
	}
}
