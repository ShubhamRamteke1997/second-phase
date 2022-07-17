package this_super_keywords;

public class sample12 extends sample10{

 int a=10;
 
 public void m1()
 { int a=20;
	 System.out.println(a);
      System.out.println(this.a);
 System.out.println(super.a);
 
 
 
 }
      
 public static void main(String[] args) {
	 
	 sample12 s12 = new sample12();
	 s12.m1();
	 
	 
	 
	 
}










}
