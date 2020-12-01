package returntypedemo;

import java.util.Scanner; 
public class ReturnClass {
	// this comment line is added because of learning github purpose and to push again
		
	public static void main(String args[]) {
        ReturnClass d =  new ReturnClass ();
        Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first number a : ");
		int a = input.nextInt();
		System.out.println("Please enter your second number b : ");
		int b = input.nextInt(); 
		System.out.println("Please enter your third number c: "); 
		int c = input.nextInt(); 
        
        d.add(a,b,c);     // to call the non-static method
	}
	
	public int add(int x ,int y, int z) {
        	
		
		int d = x + y + z;
		
		
		//can be hard coded like below or taken input from scanner as above
		//int a = x;
        //int b = y;
        //int c = a + b;
        System.out.println("The sum of given numbers is: " + d); 
        return -345; // the return value can be any integer either positive or negative such as 0,1,2,-1,-2,-3 etc. 
        }
	

			

	}


