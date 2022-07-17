package abstractclass;

abstract public class sample4  //abstract class :a class declared with abstract keyword is called abstract class
{
     public void m1()
     {
    	 System.out.println("completed method m1 in abstract class");
     }
	
	abstract public void m2();     //incomplete method 
	// there is no definition
	abstract public void m3();	//incomplete method 
	//there is no definition
	
	
	//an abstract is nothing but an incomplete class where programmer can declare complete as well as 
	//in complete methods in it
	//Programmer can declare incomplete methods as abstract method by declaring keyword called "abstract"
	//in front of method .
	//we can't create object of abstract class we need to make use of concrete class
	
	
}
