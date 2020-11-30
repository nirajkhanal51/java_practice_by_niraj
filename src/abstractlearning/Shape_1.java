package abstractlearning;

public abstract class Shape_1 {

//abstract class  
//abstract method  
//note that we have not implemented the functionality of the method  
public abstract void draw();  
}  
class Circle_1 extends Shape_1 
{  
//implementing functionality of the abstract method  
public void draw()   
{  
System.out.println("Circle!");  
}  
 
//main method  

public static void main(String[] args)   
{  
Shape_1 circle = new Circle_1();  
//invoking abstract method draw()  
circle.draw();  
}  
}  