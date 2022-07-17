package this_super_keywords;

public class sample5  extends sample3{
  int a = 500;
  
  public void m3() {
  int a = 450;
	System.out.println(a);
	System.out.println(this.a);
	
		  System.out.println(super.a);
		  
		  
		  
		  
		  
		  
  }
	
	
	public static void main(String[] args) {
	  sample5 s5 = new sample5();
	  s5.m3();
	}
	
	
	
	
	
	
}
