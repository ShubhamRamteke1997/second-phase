package polymorphism;

public class compiletime_5 {
public static void main(String[] args) {
	
	sample5 s5 = new sample5();
	s5.addition(10, 20, 30);;
	
	
	//compiletime poly. method declaration is going to get binded to its definition at the time off
	 //compilation
	
	sample5 s = new sample5();
	s.addition(20, 80);
	
	
	
	
	
}
}
