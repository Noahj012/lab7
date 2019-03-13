
public class HealthyPerson extends Person
{

	private String reason = "";
	public HealthyPerson(String name, int age, String reason)
	{
		super(name, age);
		this.reason = reason;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int compareToImpl(Person p) 
	{
		// TODO Auto-generated method stub
		if (p.getClass() != this.getClass())
		{
			return 0;
		}
		else if (this.getName().charAt(0) < p.getName().charAt(0))
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	
	public String toString()
	{
		return String.format("%s In for %s", this.getName(),reason);
	}

}
