package inheritance2;

public class sample1 extends sample2 //this super keyword
{

	
	int a =20; //global variable from same class
	
	
	public void m1()
	{
		int a = 10; //local variable
		
		System.out.println(a);  //a=10
		
		System.out.println(this.a);//a = 20 global variable
	
		
		System.out.println(super.a);//a=30 from sample2
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
