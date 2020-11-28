package Encapsulation;
class Account
{
	private long acc_no;  
	private String name,email;  
	private float amount;  
	//1
	public long getAcc_no()
	{
		return acc_no;
	}
	public void SetAcc_no(long acc_no)
	{
		this.acc_no=acc_no;
	}
	//2
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
	this.name=name;
	
	}
	//3
	public String getEmail()
	{
		return email;
	}
	public void setEmail( String email)
	{
		this.email=email;
	}
	//4
	public float getAmount()
	{
		return amount;
	}
	public void setAmount(float amount)
	{
		this.amount=amount;
	}	
}	
public class Encapsulation2 
{
	public static void main(String[] args) 
	{
		Account ac=new Account();
		ac.SetAcc_no(148310100086362l);
		ac.setAmount(10000);
		ac.setEmail("sriharshanukasani@gmail.com");
		ac.setName("harsha");
		
		System.out.println(ac.getAcc_no()+" "+ac.getAmount()+" "+ac.getEmail()+" "+ac.getName());
	}
}
