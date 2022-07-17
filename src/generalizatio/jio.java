package generalizatio;

public class jio implements simcard //sub class //generalization :extracting all the important common properties from sub class & declaring it in super class
                     //&providing definitions/implementation according to subclass specification is called generalization
{
        
	                  //generelization file can be normal java class or abstract class ort interface but only interface is reommonded
	
	public void sms()
	{
		System.out.println("sms:no sms");
	}
	
	public void audiocalling()
	{
		System.out.println("audiocalling:100 calls");
	}
	
	public void internet()
	{
		System.out.println("internet:1gb");
	}
	public void newfeatureA()
	{
		System.out.println("newfeature:A");
	}
	
	
	
	
	
	
}
