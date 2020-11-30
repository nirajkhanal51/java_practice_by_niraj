package Constructor;

//Question12: 12Write a program to accept the roll, name, and nationality of the person and display those values in good format.


public class ConstructorDemo {

		private  String firstname;
		private String lastname;
		private int roll;
		private String grade;
		private String nationality;
		
		public ConstructorDemo(String f, String l, int r, String g, String n) {
			
			firstname = f;
			lastname = l;
			roll     = r; 
			grade    = g; 
			nationality = n;
			
		}

		public void display() {
			 
		System.out.println("First Name is: " +firstname);
		System.out.println("Last Name is: " + lastname); 
		System.out.println("Roll Number is: " + roll);
		System.out.println("Grade earned is: " + grade);
		System.out.println("Grade earned is: " + nationality);
		
	   
		}
		
		public static void main(String [] args) {
			
					
			ConstructorDemo user1 = new ConstructorDemo("sunita", "khanal", 45, "A", "Nepali");
			user1.display();
			
			System.out.println("===============================");
			
			ConstructorDemo user2 = new ConstructorDemo("niraj", "khanal", 30, "B", "Nepali");
			user2.display();
			
			System.out.println("===============================");
			
			ConstructorDemo user3 = new ConstructorDemo("Joe", "Biden", 77, "B", "American");
			user3.display();
			
			System.out.println("===============================");
			
			ConstructorDemo user4 = new ConstructorDemo("Kamala", "Harris", 56, "B", "American");
			user4.display();
		}
		


	
			
			}

