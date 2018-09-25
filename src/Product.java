import Util.Section;

public abstract class Product {

		 String name;
		 Double price;
		 Section section;
		 
public Product(String Name, Double Price) {
	
	name = Name;
	price = Price;
//	section = Section.Other;

     }

public abstract void Info();
}
