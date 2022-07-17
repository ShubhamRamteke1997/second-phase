package this_super_keywords;

public class sample9 extends sample10
{
 int a=99;
 
 
 public void m1()
 {  int a=77;
	System.out.println(a); 
	 
	 System.out.println(this.a);
	 
	 
	 System.out.println(super.a);
 }
 
	public static void main(String[] args) {
		sample9 s9 = new sample9();
		s9.m1();
		System.out.println(s9.a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
