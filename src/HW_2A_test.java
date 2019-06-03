
import java.util.Scanner;

public class HW_2A_test {

	public static void main(String[] args) {
		
			
			final int REST_ZIP = 75104;   	// zip code of restaurant
			int custzip;					// zip code of customer
			int zipdist;					// distance of zip codes
			int absdist;					// absolute distance of zip codes
			int delselect;					// selection of pickup or delivery by customer
			int delstat;					// delivery status - delivery, extra, too far
			int nuitems;					// number of items to be ordered by customer
			delstat = 0;					// default delivery status is NO -- too far
			
			double subtotal = 0.00;			// subtotal of order
			
			int menu;						// menu items to be ordered according to menu
			double taxes = 0.00;			// taxes of order
			double total = 0.00;			// total of order with subtotal, delivery, and taxes
			
			
			
			Scanner scanner = new Scanner(System.in);
			 System.out.println("Welcome to Flyer's Place:  Pick-Up -1- or Delivery- 2?");
			 
			 delselect = scanner.nextInt();
			 
			 
			
			 
			if (delselect == 2)
				 
				 {
					 System.out.println("Delivery Options");
				 
				 
				 System.out.println("Please Enter Your (You, Our Valued Customer's) Zip Code");
				 custzip = scanner.nextInt();
				  
				 zipdist = custzip - REST_ZIP;
				 absdist = Math.abs(zipdist);	// checking absolute value of distance of zip codes
				  
				 
				 if (absdist <= 4)
				 { System.out.println("Delivery Available");
				 delstat = 1;
				 }
				 else if (absdist == 5)
				 	{ System.out.println("Delivery with Extra Cost");
				 delstat = 2;
				 	} 
				 else 
				 	{ System.out.println("Distance Too Far - Delivery Not Available - Sorry");
				 	System.out.println("Pick Up In Restaurant \n");
				 	 delstat = 0;
				 	}
				 
				 }
				 
	if (delselect == 1)
				 
				 {System.out.println("Pick Up In Restaurant \n");
				 delstat = 0;
				 
				 	}
				 
				 
			 // Ordering in Restaurant
					 	
				 
				 System.out.println("Please May We Take Your Order?");
				 
				 System.out.println("Selection and Prices to Follow: \n");
				 
				 System.out.println("(1) Flyers' Burger: $4.50 per an order ");
				 
				 System.out.println("(2) Flyers' Drink: $1.50 per a container ");
				 
				 System.out.println("(3) Flyers' Fries: $2.50 per an order ");
				 
				 System.out.println("(4) Flyers' Dessert: $3.00 per an order ");
				 
				 System.out.println("(5) Flyers' Orange Juice: $1.50 per an order ");
				 
				 System.out.println("(6) Flyers' Pizza: $1.50 per a slice ");
				 
				 System.out.println("(7) Flyers' Chicken Fried Steak: $5.50 per an order ");
				 
				 System.out.println("(8) Flyers' Fried Fish and Chips: $8.00 per an order ");
				 
				 
				 
				 System.out.println("Tax 5%; Extra Delivery Costs = $5.00 for Delivery Available; $7.00 for Delivery With Extra Cost  \n");
				 
				 
				 
				 System.out.println("How many items?");
				 nuitems = scanner.nextInt();
				 
				 while (nuitems > 0)
					 
					 //	Customer Ordering Items
					 
				 { System.out.println("\n Please Enter Menu Order (1), (2), (3), (4), (5), (6), (7), (8) ");
				 System.out.println("-Please Just Enter Number Itself With No Parentheses-");
				 menu = scanner.nextInt();
					 
				if (menu == 1) 
					subtotal = subtotal + 4.50;
				if (menu == 2) 
					subtotal = subtotal + 1.50;
				if (menu == 3) 
					subtotal = subtotal + 2.50;
				if (menu == 4) 
					subtotal = subtotal + 3.00;
				if (menu == 5) 
					subtotal = subtotal + 1.50;
				if (menu == 6) 
					subtotal = subtotal + 1.50;
				if (menu == 7) 
					subtotal = subtotal + 5.50;
				if (menu == 8) 
					subtotal = subtotal + 8.00;
				
				
				
				nuitems--;
				
				 }
				 
				 //	Determining Prices1
				 
				 
				 System.out.printf(" Subtotal is: $%2.2f \n", subtotal);
				 
				 taxes = subtotal * .05;
				 
				
				 
				 System.out.printf(" Taxes: $%2.2f \n", taxes);
				 
				 subtotal = subtotal + taxes;
				 
				 
				 System.out.printf(" Amount After Taxes: $%2.2f \n", subtotal);
				 
				
				 
				 if (delstat == 0) 
					 System.out.println(" No Delivery Cost");
				 
				 if (delstat == 1) 
				 {
					 total = subtotal + 5.00;
					 System.out.println(" Delivery Cost:  $5.00");
					
				 	System.out.printf("     With Delivery Cost: $%2.2f \n", total);}
				 
				 
				 if (delstat == 2) 
				 {
					 total = subtotal + 7.00;
					
					 System.out.println(" Delivery Cost:  $7.00");
				 System.out.printf("     With Extra Cost Delivery Cost: $%2.2f \n", total); }
				 
		}
				 
				 
		}

	
