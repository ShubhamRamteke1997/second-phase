package generalizatio;

public class boi implements bank            //extracting important properties of sub class and declaraing it into the super
                                    //class & providing definitiosns as per sub class specification
{

	public void money()
	{
		System.out.println("money:2cr");
	}
	public void checks()
	{
      System.out.println("checks:200 checks");
	}
	public void statements()
	{
		System.out.println("statements:unlimited");
	}
	public void newfeatureB()
	{
		System.out.println("newfeatures:B");
	}
}
