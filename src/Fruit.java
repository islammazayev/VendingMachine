import Util.Section;

public class Fruit extends Product {
	
	public Fruit(String Name, double Price, Section fruit) {
		super(Name, Price);
		this.section = fruit;
	}
	
	
	public void Info()
	{
		System.out.println("\nSection: " + section 
				+ "\nName: " + name 
				+"\nPrice: " + price);
	}

}
