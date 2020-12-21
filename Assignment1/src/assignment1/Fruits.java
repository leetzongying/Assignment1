package assignment1;

import java.util.*;

public class Fruits {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter your name:");
		String name = in.next();
		System.out.println("Name:" + name);
		
		System.out.println("Enter your age:");
		int age = in.nextInt();
		System.out.println("Age:" + age);
		
		System.out.println("Enter your gender:");
		String str = in.next();
		char gender = str.charAt(0);
		System.out.println("Gender:" + gender);
		
		System.out.println();
		System.out.println("Product provided: Apples, Oranges, Pineapples");
		double price1 = 1.20;
		double price2 = 1.30;
		double price3 = 1.50;
		System.out.println("Price of apples: RM1.20");
		System.out.println("Price of oranges: RM1.30");
		System.out.println("Price of pineapples: RM1.50");
		
		System.out.println();
		System.out.println("Sales discount for non members will be provided 10% discount for total purchase less than RM100, and 20% for purchase more than RM100!");
		System.out.println("Sales discount for members will be provided 15% discount for total purchase less than RM100, and 25% for purchase more than RM100!");
		System.out.println();
		
		System.out.println("Do you have the membership card? (true for yes, false for no):");
		boolean card = in.nextBoolean();
		
		System.out.println("Enter the number of type of fruit purchased:");
		int items = in.nextInt();
		
		if(card = false) {
		switch(items) {
		case 1:
			System.out.println("Enter the quantity of apples purchased:");
			int quantity1 = in.nextInt();
			
			double total = price1*quantity1;
		System.out.println("Total price:" + total);
		if(total<100) {
			double discount = total*10/100;
			System.out.println("Discount total:" + discount);
			System.out.println("Price to be paid:" + (total - discount));
		}
		else if(total>100) {
			double discount = total*20/100;
			System.out.println("Discount total:" + discount);
			System.out.println("Price to be paid:" + (total - discount));
		}
		case 2:
			System.out.println("Enter the quantity of apples purchased:");
			int quantity1x = in.nextInt();
			System.out.println("Enter the quantity of oranges purchased:");
			int quantity2 = in.nextInt();
			
			double total1 = (price1*quantity1x) + (price2*quantity2);
			System.out.println("Total price:" + total1);
			if(total1<100) {
				double discount = total1*10/100;
				System.out.println("Discount total:" + discount);
				System.out.println("Price to be paid:" + (total1 - discount));
			}
			else if(total1>100) {
				double discount = total1*20/100;
				System.out.println("Discount total:" + discount);
				System.out.println("Price to be paid:" + (total1 - discount));
			}
		case 3: 
			System.out.println("Enter the quantity of apples purchased:");
			int quantity1y = in.nextInt();
			System.out.println("Enter the quantity of oranges purchased:");
			int quantity2y = in.nextInt();
			System.out.println("Enter the quantity of pineapples purchased:");
			int quantity3 = in.nextInt();
			
			double total2 = (price1*quantity1y) + (price2*quantity2y) + (price3*quantity3);
			System.out.println("Total price: RM" + total2);
			if(total2<100) {
				double discount = total2*10/100;
				System.out.println("Discount total: RM" + discount);
				System.out.println("Price to be paid: RM" + (total2 - discount));
			}
			else if(total2>100) {
				double discount = total2*20/100;
				System.out.println("Discount total: RM" + discount);
				System.out.println("Price to be paid: RM" + (total2 - discount));
			}
			
		
	}}
		else if(card = true) {
			switch(items) {
			case 1:
				System.out.println("Enter the quantity of apples purchased:");
				int quantity1 = in.nextInt();
				
				double total = price1*quantity1;
			System.out.println("Total price:" + total);
			if(total<100) {
				double discount = total*15/100;
				System.out.println("Discount total:" + discount);
				System.out.println("Price to be paid:" + (total - discount));
			}
			else if(total>100) {
				double discount = total*25/100;
				System.out.println("Discount total:" + discount);
				System.out.println("Price to be paid:" + (total - discount));
			}
			case 2:
				System.out.println("Enter the quantity of apples purchased:");
				int quantity1x = in.nextInt();
				System.out.println("Enter the quantity of oranges purchased:");
				int quantity2 = in.nextInt();
				
				double total1 = (price1*quantity1x) + (price2*quantity2);
				System.out.println("Total price:" + total1);
				if(total1<100) {
					double discount = total1*15/100;
					System.out.println("Discount total:" + discount);
					System.out.println("Price to be paid:" + (total1 - discount));
				}
				else if(total1>100) {
					double discount = total1*25/100;
					System.out.println("Discount total:" + discount);
					System.out.println("Price to be paid:" + (total1 - discount));
				}
			case 3: 
				System.out.println("Enter the quantity of apples purchased:");
				int quantity1y = in.nextInt();
				System.out.println("Enter the quantity of oranges purchased:");
				int quantity2y = in.nextInt();
				System.out.println("Enter the quantity of pineapples purchased:");
				int quantity3 = in.nextInt();
				
				double total2 = (price1*quantity1y) + (price2*quantity2y) + (price3*quantity3);
				System.out.println("Total price: RM" + total2);
				if(total2<100) {
					double discount = total2*15/100;
					System.out.println("Discount total: RM" + discount);
					System.out.println("Price to be paid: RM" + (total2 - discount));
				}
				else if(total2>100) {
					double discount = total2*25/100;
					System.out.println("Discount total: RM" + discount);
					System.out.println("Price to be paid: RM" + (total2 - discount));
				}
			
		}
		}
		in.close();

}
}
