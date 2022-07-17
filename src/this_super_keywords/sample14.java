package this_super_keywords;

public class sample14 extends sample10 {
       
	 int a=100;
	 public void m1()
	 {  int a=200;
	 
	 System.out.println(a);
		 
		 System.out.println(this.a);
		 System.out.println(super.a); 
	 }
	
	
	      public static void main(String[] args) {
			
	    	  
	    	  sample14 s14 = new sample14();
	    	  s14.m1();
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
		}
	        
	
	
	
	
	
	
	
	
	
	
	
}
