package inheritance;

public class telegramv3 extends telegramv2 
{

public void pdf()
{
	System.out.println("send pdf");
}
	
	
	public static void main(String[] args) {
		
		
		telegramv2 t1 = new telegramv2();
		t1.downloadmovies();
		t1.textmsg();
		t1.audiocalling();
		t1.downloadmovies();
		telegramv3 v3 = new telegramv3();
		v3.pdf();
				
		//multiple level inheritance; in this opration 3 or more than 3 classes are mandatory
		// in multiple level inheritance sub module acquires the propertiees of   another  parent/super class and
		// that class acquires properties of another super class
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
