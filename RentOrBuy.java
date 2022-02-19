import java.security.Identity;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.swing.tree.AbstractLayoutCache;

public class LabOne {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner (System.in);
		int numberOfDays;
		
		
		
		System.out.println("please specify rent if you would like to rent or buy if you like to buy");
		String answer = myScanner.next();
		
		if(answer.equals("rent")) {
			System.out.println("you have chosen to rent");
			
		System.out.println("please enter number of days to rent ");	
			numberOfDays= myScanner.nextInt();
			
		double	totalRent = 3.5 * Math.pow(numberOfDays, 2)/2;
				
			if (numberOfDays>0) {
			System.out.println("your total rent is" + totalRent);
			}else 
				System.out.println("you cannot enter 0 or a  negative number");
			
			
		}else if (answer.equals("buy")){
			System.out.println("you have chosen to buy");	
			
			System.out.println("please input F for Ferrari, f for Ford and t for Toyota");	
			String carType= myScanner.next();
			
		switch (carType) {
		case "F":
				System.out.println("you have chosen ferrari and it costs you 100k");
			break; 
		
		case "f": 
			System.out.println("you have chosen ford and the price is 30k");
			break;
		
		case "t":
			System.out.println("you have chose toyota and the price is 20k");
			break;
			
		default: System.out.println("you have not chosen the right car");}	
			
			
		}else 
			System.out.println("you have entered neither buy or rent");
			
			
			}
		
			
		
		}

		
		
	
		
	
	


