import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType> 
{
	private Stack<PatientType> stackHospital = new Stack<>();
	private int counter = 0;
	
	public StackHospital()
	{
		this.stackHospital = new Stack<>();
	}

	@Override
	public void addPatient(PatientType patient) 
	{
		// 
		stackHospital.push(patient);
		counter++;
	}

	@Override
	public PatientType nextPatient() 
	{
		//
		return stackHospital.peek();
	}

	@Override
	public PatientType treatNextPatient() 
	{
		//
		--counter;
		return stackHospital.pop();
	}

	@Override
	public int numPatients() 
	{
		//
		if (!(stackHospital.empty()))
		{
			return counter;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public String hospitalType() 
	{
		//
		return "Stack Hospital";
	}

	@Override
	public String allPatientInfo() 
	{
		String allInfo = "";
		
		for (int i = 0; i < stackHospital.size(); ++i)
		{
			allInfo += stackHospital.get(i).toString();
		}
		//return stackHospital.toString();
		return allInfo;
	}

}
