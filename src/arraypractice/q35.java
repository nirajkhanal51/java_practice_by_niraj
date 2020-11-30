package arraypractice;

public class q35 {
	
	public static void main(String[] args) { 
	
	int a[]={3,5,68,9};  
	int b[]={23,35,56,67,89};
	
	System.out.printf("Second Largest: ", findSecondLargest(a,4));  
	System.out.printf("Second Largest: ", findSecondLargest(b,5));  
	}

public static Object[] findSecondLargest (int[] a, int y){  
	int x;
	
	for (int i = 0; i < y; i++) {  
	for (int j = i + 1; j < y; j++) {  
	 if (a[i] > a[j]) {  
	 x = a[i];  
	 a[i] = a[j];  
	 a[j] = x;  }  
}  }  
	       return null ;  
	}  

}
