package stringpractice;

public class StringUses {

	public static void main(String[] args) {
		
		
		String welcoming = "Hello";
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		
		String txt1 = "Hello World";
		System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt1.toLowerCase());   // Outputs "hello world"
		
		String txt2 = "Please locate where 'locate' occurs!";
		System.out.println(txt2.indexOf("locate")); // Outputs 7
		
		String firstName = "Ram";
		String lastName = "Sharma";
		System.out.println(firstName + " " + lastName);
		
		String firstName_1 = "Guddu";
		String lastName_1 = "Barma";
		System.out.println(firstName_1.concat( lastName_1));
		
		String txt_3 = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt_3);
		
		String txt_4 = "It's alright.";
		System.out.println(txt_4);
		
		String txt_5 = "The character \\ is called backslash.";
		System.out.println(txt_5);
		
		int x = 10;
		int y = 20;
		int z = x + y; 
		System.out.println(z);
		
		String x1 = "10";
		String y1 = "20";
		String z1 = x1 + y1;   // z will be 1020 (a String)
		System.out.println(z1);
		
		String x2 = "10";
		int y2 = 20;
		String z2 = x2 + y2;   // z will be 1020 (a String)
		System.out.println(z2);
		
				

	}
	
	

}
