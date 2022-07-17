package generalizatio;

public class generalization3  //extracting properties of subclass and declaring into the super class & providing implementation
                           //definitios as per sub class specification
{
            
	public static void main(String[] args) {
		System.out.println("------samsung features----");
		samsung s = new samsung();
		s.calling();
		s.video();
		s.pictures();
		System.out.println("----realmi features------");
		
		realmi r = new realmi();
		r.calling();
		r.pictures();
		r.video();
		System.out.println("-------iphone features-----");
		iphone i = new iphone();
		i.calling();
		i.pictures();
		i.video();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
