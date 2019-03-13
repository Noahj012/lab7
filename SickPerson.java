
public class SickPerson extends Person
{
	private int serverity = 0;

	public SickPerson(String name, int age, int serverity) 
	{
		super(name, age);
		this.serverity = serverity;
	}

	@Override
	protected int compareToImpl(Person p) 
	{
		return serverity - this.serverity;
	}
	
	public String toString()
	{
		return String.format("%s Severity level %d",this.getName(), serverity);
	}

}
