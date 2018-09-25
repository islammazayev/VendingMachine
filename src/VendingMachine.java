import Util.Section;
import java.util.Scanner;
import islam.libs.ConsoleScann;
public class VendingMachine {

	public static Scanner sc;
	ConsoleScann cscann = new ConsoleScann();
	private static Product[] productList;
	private static int[] coinsArray;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		setProducts();
		setCoins();
		
		while(true) {
//			sc = new Scanner(System.in);
			System.out.println("Welcome to my vending machine\nWhat do you want to shop\n1 - Fruit:\n2 - Confection:\n3 - Juice:");
			int sectionIndex = sc.nextInt();
			
			
			switch(sectionIndex) {
			
				case 1: 
					getFruits();
				  break;
				
				case 2:
					getConfection();
				  break;
				  
				case 3: 
					getJuice();
			      break;
			      
	//			case 4: 
	//				getSelected(Section.Confection);
	//		      break;
			  
			    default: break;
		
			}
			
	
			
			System.out.println("Value number of product");
			int productIndex = sc.nextInt();
			System.out.println("Selected " + productList[productIndex -1].name + " : " + productList[productIndex -1].price + " euro");
			System.out.println("Choise coin ");
			coinsList();
			int coinIndex = sc.nextInt();
			double endChange = coinsArray[coinIndex - 1] - productList[productIndex - 1].price;
			System.out.println("Your Change is " + endChange);
			sc.close();	
		}
		
//		sc.close();
		
	}
		
	
//	public static void getSelected(Section val ){ "en bra tip att filtrera" 
//		for(Product item : productList) {
//			if(item.section == val) {
//				System.out.println("\n" + val);
//				item.Info();
//			}
//		}
	
	public static void getFruits(){
//		for(Product item : productList) {
		for(int i = 1; i < productList.length; i++) {
			if(productList[i-1] instanceof Fruit) {
				System.out.println("\n" + i + " - Fruit");
				productList[i-1].Info();
			}
		}
	}
	
	public static void getConfection(){
		for(int i = 1; i < productList.length; i++) {
			if(productList[i-1] instanceof Confection) {
				System.out.println("\n" + i + " - Confection");
				productList[i-1].Info();
			}
		}
	}
	
	public static void getJuice(){
		for(int i = 1; i < productList.length; i++) {
			if(productList[i-1] instanceof Juice) {
				System.out.println("\n" + i + " - Juice");
				productList[i-1].Info();
			}
		}
	}
	
	public static void coinsList() {
		for(int i = 1; i < coinsArray.length; i++) {
			System.out.println("\n" + i + " - " + coinsArray[i -1]);
		}
	}
	
	public static void setCoins() {
		int[] coins = { 1, 5, 10, 20, 50, 100, 200, 500, 1000 };
		coinsArray = coins;
	}
	
	public static void setProducts() {
		Fruit banana = new Fruit("Banana", 18.95,Section.Fruit);
		Fruit cherry = new Fruit("Cherry", 25.00,Section.Fruit);
		Fruit pear = new Fruit("Pear", 26.95,Section.Fruit);
		Fruit pineapple = new Fruit("Pineapple", 34.00,Section.Fruit);
		Fruit apple = new Fruit("Apple", 26.00, Section.Fruit);
		Fruit peach = new Fruit("Peach", 14.99, Section.Fruit);
		Fruit grapes = new Fruit("Grapes", 29.95, Section.Fruit);
		Fruit apricot = new Fruit("Apricot", 31.95, Section.Fruit);
		Fruit quince = new Fruit("Quince", 36.99, Section.Fruit);
		Fruit watermelon = new Fruit("Watermelon", 18.95, Section.Fruit);
		
		
		Confection cake = new Confection("Cake", 120.95, Section.Confection);
		Confection buns = new Confection("Buns", 180.99, Section.Confection);
		Confection roll = new Confection("Roll", 148.95, Section.Confection);
		Confection cookies = new Confection("Cookies", 112.00, Section.Confection);
		Confection biscuit = new Confection("Biscuit", 165.00, Section.Confection);
		Confection cupcakes = new Confection("Cupcakes", 151.99, Section.Confection);		
		
		
		Juice sprite = new Juice("Sprite", 12.99, Section.Juice);
		Juice lipton = new Juice("Lipton", 25.00, Section.Juice);
		Juice pepsi = new Juice("Pepsi", 12.99, Section.Juice);
		Juice fanta = new Juice("Fanta", 12.99, Section.Juice);
		Juice nestea = new Juice("Nestea", 30.99, Section.Juice);
		Juice icetea = new Juice("Ice tea", 27.99, Section.Juice);
		Juice mirinda = new Juice("Mirinda", 20.00, Section.Juice);
		Juice crush = new Juice("Crush", 24.00, Section.Juice);
		Juice cocacola = new Juice("Coca cola", 12.99, Section.Juice);
		Juice mtndew = new Juice("Mtndew", 25.00, Section.Juice);
		
		productList = new Product[] {banana, cherry, pear, pineapple, apple, peach, grapes, apricot, quince, watermelon, cake, buns,  roll, cookies, biscuit, cupcakes, sprite, lipton, pepsi, fanta, nestea, icetea, mirinda, crush, cocacola, mtndew };
		
	}
}
