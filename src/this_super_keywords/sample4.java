package this_super_keywords;

public class sample4  extends sample3 {


   int a=345;     //global class

 public void m2()
 {
	 int a = 30;   //local class
	 
	 System.out.println(a);
	 System.out.println(this.a);
	 
	 
	 System.out.println(super.a);
	 
 }
 public static void main(String[] args) {
	
	 sample4 s4 = new sample4();
	 s4.m2();
	 
	 
	 
	 
	 
	 
	 
}











}
