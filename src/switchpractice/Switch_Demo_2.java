package switchpractice;

import java.util.Scanner; 

public class Switch_Demo_2 {

	public static void main(String[] args) {
		
		Switch_Demo_2 obj = new Switch_Demo_2();
		obj.gateNumber(); 
		
	    }  
	
	public void gateNumber() {
	
	//Getting a variable for switch expression from scanner  
    
			Scanner input = new Scanner(System.in);
			
			System.out.println("To find the airlines please enter your gate number: ");	
			int gate_Number= input.nextInt();  
					
		    //Switch expression  
		    switch(gate_Number){  
		    //Case statements  
		    case 10: System.out.println("This gate is for American AirLines and at Terminal D");  
		    break;  
		    case 11: System.out.println("This gate is for Gulf Air and at Terminal D");  
		    break;  
		    case 12: System.out.println("This gate is for Lufthansa and at Terminal D"); 
		    break; 
		    case 13: System.out.println("This gate is for Indian Air and at Terminal D"); 
		    break;
		    case 14: System.out.println("This gate is for Canada Air and at Terminal D");
		    break;
		    	    
		    //Default case statement  
		    default:System.out.println("This gate number does not exist at DFW Airport");  
		    
		   
		    }
	
	}  
	}  