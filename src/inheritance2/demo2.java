package inheritance2;

public class demo2 extends demo1{

	int a = 20; //global variable from same class
	public void m1()
	{ 
		int a =10;
		System.out.println(a); //a=10
		System.out.println(this.a);//a=20
		System.out.println(super.a);//a=30
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
