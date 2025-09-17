package SUPERMARKET;

import java.util.Scanner;

public class billingprogram {

	
	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		//Asking how many items bought
		System.out.println("How many different items the did the customer bought? ");
		int name=b.nextInt();
		b.nextLine();                   //create newline
	
		//arrays that stores data
		String[] itemname=new String[name];
		double[] price=new double[name];
		int [] quantity=new int[name];
		double[] subtotal =new double[name];
		double gtotal=0;
		
		// Inputing items
		for (int i = 0; i < name; i++) {
            System.out.println("\nItem " + (i + 1) + ":");
            System.out.print("  Name of item is : ");
            String names = b.nextLine();

            System.out.print("  Price per unit is: ");
            price[i] = b.nextDouble();

            System.out.print("  Quantity purchased: ");
            quantity[i] = b.nextInt();
            b.nextLine(); 

            subtotal[i] = price[i] * quantity[i];
            gtotal += subtotal[i];
        }

        // checking if someone is allowed to have discount
        double discount = 0;
        if (gtotal > 50000) {
            discount = gtotal * 0.05;
        }
        double famount = gtotal - discount;

        // 4) Print receipt information
        System.out.println("\n========== RECEIPT ==========");
        System.out.println("Item Name      | Quantity | Price per unit | subtotal");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < name; i++) {
            System.out.println(itemname[i] + " | " + quantity[i] + " | " + price[i] + " | " + subtotal[i]);
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Total before discount: " + gtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount Payable: " + famount);
        System.out.println("=============================");

        b.close();
    }

				
		
		
	}


