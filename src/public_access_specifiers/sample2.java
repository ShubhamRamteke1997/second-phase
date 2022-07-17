package public_access_specifiers;

public class sample2 //default access specifier
{
  int a;
  
  sample2()
  {
	  a=10;
  }
	
  
  void m2() //default access specifier
	
  {
	  System.out.println(a);
  }
	
  public static void main(String[] args) {
	
	  sample2 s2 = new sample2();
	  s2.m2();
	  System.out.println(s2.a);
	  
	  
	  
	  
	  
}
  
  
  
  
  
  
  
  
  
  
}
