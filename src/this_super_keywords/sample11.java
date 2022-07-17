package this_super_keywords;

public class sample11 extends sample10 {

	int a=99;
	
	public void m1()
	{
		int a=10;
		System.out.println(a);
		System.out.println(this.a);      //tihis keyword is use to print gloabal variable from same class
		
		
		System.out.println(super.a);  //super keyword is used to print gloabal variable from super class
		
		
		
		
	}
	                      public static void main(String[] args) {
							sample11 s11 = new sample11();
							s11.m1();
	                    	  
	                    	  
	                    	  
	                    	  
	                    	  
	                    	  
	                    	  
	                    	  
						}
	
	
}
