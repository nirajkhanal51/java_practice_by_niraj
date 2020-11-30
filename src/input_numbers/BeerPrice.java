package input_numbers;

import java.util.Scanner;

/*Question: Generate the bill based upon beer ordered. For every 3 beer you buy and get a fourth one for free,
print total number of beer order print price for beer including free beer (suppose 8 beer ordered mean pay for 6 only)
print discount if dozen of beer is bought, for every dozen you buy and get a 10% discount and print the final prices with 13% tax.

The price of beer is 1.5. 
*/

public class BeerPrice {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the number of beer you want to buy : ");
		double a = input.nextDouble();
		
		 double x =  1.5 ;
		 
		 double twobeer = 2 * x; 
		 double threebeer = 3 * x; 
		 double fourbeer = threebeer; 
		 double fivebeer = threebeer + x;
		 double sixbeer = 6 * x; 
		 double sevenbeer = 2 * fourbeer;
		 double eightbeer = 2 * fourbeer; 
		 
		  
		  if   ((double) a == (double) 1) {
			 System.out.println("Your total beer price is: " + x );} 
		  else if   ((double) a == (double) 2) {
			  System.out.println("Your total beer price is: " + twobeer);}
		  else if   ((double) a == (double) 3) {
			  System.out.println("Your total beer price is: " + threebeer + " Enjoy your fourth beer free!");}
		  else if   ((double) a == (double) 4)  {
			  System.out.println("Your total beer price is: " + fourbeer + "  Your fourth beer is free! Your only paid for three!");} 
		  else if  ((double) a == (double) 5) {
			  System.out.println("Your total beer price is: " + fivebeer+ " You get extra one beer in purchase of 3, you paid just for four, Thank You");}
		  else if  ((double) a == (double) 6) {
			  System.out.println("Congratulation! you get extra two beer for free! Your total price is: " + sixbeer );}
		  else if  ((double) a == (double) 7) {
			  System.out.println("Your total price is: " +sevenbeer + " You already got two beers free, get 8 beers to home.");}
		  else if  ((double) a == (double) 8) {
			  System.out.println("Your total price is: " + eightbeer + " Just pay for six beers, get two extra beer for free.");}
		  input.close(); 
	
	}
		  
		
		  
		
	
}


