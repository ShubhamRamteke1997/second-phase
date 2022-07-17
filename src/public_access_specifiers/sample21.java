package public_access_specifiers;

public class sample21 {

	public int a;
	
	public sample21()
	
	{
		a=999;
		
	}
	
	
	public void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		sample21 s21 =new sample21();
		s21.m1();
		System.out.println(s21.a);
	
	}
	
	
	
	
	
	
	
	
	
}
