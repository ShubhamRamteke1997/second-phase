package generalizatio;

public class icici implements bank //generalization is extracting important properties of sub class and declaring it into super class
                                    //by providing definitions according to sub class specification
{
         
	public void money()
	{
		System.out.println("money:3cr");
	}
    public void checks()
    {
    	System.out.println("checks:300 checks");
    }
    public void statements()
    {
    	System.out.println("statemetns:unlimited");
    }
   public void newfeatureC()
   {
	   System.out.println("new feature :C");
   }






}
