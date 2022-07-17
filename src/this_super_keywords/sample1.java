package this_super_keywords;

public class sample1 extends sample3 {

	
int a= 20; //gloabal variable from same class
		
		
		public void m1() 
		{
			int a= 10;  //local variable
			System.out.println(a);
			System.out.println(this.a); //20
			
			System.out.println(super.a);
			
			}
	
	   public static void main(String[] args) {
		
		   sample1 s1 = new sample1();
		   s1.m1();
		   
		   
		   
		   
		   
		   
		   
		   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
