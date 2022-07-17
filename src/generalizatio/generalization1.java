package generalizatio;

public class generalization1 //extracting important properties of sub class and declaring it into the super class
                             //&providing implements/definitions according to the sub class specification
{

	  public static void main(String[] args) {
		
		  System.out.println("---sbi features------");
		  sbi s = new sbi();
		  s.money();
		  s.checks();
		  s.statements();
		  s.newfeatureA();
		  System.out.println("----boi features------");
		  boi b = new boi();
		  b.money();
		  b.checks();
		  b.statements();
		  b.newfeatureB();
		  System.out.println("----icici features-----");
		  icici i = new icici();
		  i.money();
		  i.checks();
		  i.statements();
		  i.newfeatureC();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
