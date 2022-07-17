package this_super_keywords;

public class sample6 extends sample3 {


  int a=500;
  
  public void m4()
  {
	  int a= 345;
	  System.out.println(a);
	  
	  System.out.println(this.a);
	  
	  
	  System.out.println(super.a);
	  
	  
	  
  }

     public static void main(String[] args) {
		  
    	 sample6 s6 = new sample6();
    	 s6.m4();
    	 
    	 
    	 
    	 
    	 
    	 
	}








}
