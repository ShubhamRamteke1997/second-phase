package inheritance2;

public class sample5  extends sample4//sub class child class
{

	int a=30; //gloabal class
	
	
	public void m1()
	{ int a =10; //local class
	
		
		{
		System.out.println(a); //local variable a=10
	     
		System.out.println(this.a); //Global variable a=30;
		
		System.out.println(super.a);//super class variable a= 40;
		}
	
	}
	
	
	
	
}
