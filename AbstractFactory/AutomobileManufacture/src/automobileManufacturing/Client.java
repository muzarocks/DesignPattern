package automobileManufacturing;

import java.util.Scanner;

public class Client {
	
	private static Factory factoryObj;
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which brand Tire or Headlight you would like to make from?");
		System.out.println("Type A for Audi and M for Mercedes");
		
		String choice = input.nextLine();
		
		if(choice.equalsIgnoreCase("A"))
		{
			factoryObj = new AudiFactory();
		}
		else {
			factoryObj = new MercedesFactory();
		}
		
		factoryObj.makeTire();
		factoryObj.makeHeadLight();
		
	
		
		
	}

}
